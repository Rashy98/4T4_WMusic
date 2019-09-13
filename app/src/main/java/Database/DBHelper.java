package Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MusicApp.db";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLDB) {
        String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + UsersMaster.Users.TABLE_NAME + " (" +
                        UsersMaster.Users._ID + " INTEGER PRIMARY KEY ," +
                        UsersMaster.Users.COLUMN_NAME_USERNAME + " TEXT," +
                        UsersMaster.Users.COLUMN_NAME_CURRENT_ROUND + " INTEGER," +
                        UsersMaster.Users.COLUMN_NAME_POINTS + " INTEGER)";

        sqLDB.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addname(String uname){

        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(UsersMaster.Users.COLUMN_NAME_USERNAME,uname);
        values.put(UsersMaster.Users.COLUMN_NAME_POINTS,0);
        values.put(UsersMaster.Users.COLUMN_NAME_CURRENT_ROUND,1);

        long newIdrow = db.insert(UsersMaster.Users.TABLE_NAME,null,values);

        if(newIdrow != -1)
            System.out.println("Inserted");
        else
            System.out.println("Not inserted");
    }


    public String readData() {

        String username;
        SQLiteDatabase db = this.getWritableDatabase();
        String[] projection = {
                UsersMaster.Users._ID,
                UsersMaster.Users.COLUMN_NAME_USERNAME,
                UsersMaster.Users.COLUMN_NAME_POINTS,
                UsersMaster.Users.COLUMN_NAME_CURRENT_ROUND
        };
        Cursor cursor = db.query(
                UsersMaster.Users.TABLE_NAME,
                projection, null,
                null,
                null,
                null,
                null,
                null
        );

        username = cursor.getString(cursor.getColumnIndex(UsersMaster.Users.COLUMN_NAME_USERNAME));

        /*while (cursor.moveToNext()) {
            username = cursor.getString(cursor.getColumnIndexOrThrow(UsersMaster.Users.COLUMN_NAME_USERNAME));
            return username;
        }*/

        return username;
    }

    public void updateItem(String name , int points) {
        SQLiteDatabase db = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(UsersMaster.Users.COLUMN_NAME_POINTS,points);

        String selection = UsersMaster.Users.COLUMN_NAME_USERNAME + " LIKE? ";
        String[] selectionArgs = {name};

        int count = db.update(UsersMaster.Users.TABLE_NAME , values , selection,selectionArgs);

        if(count != -1)
            System.out.println("Updated successfully");
    }


}
