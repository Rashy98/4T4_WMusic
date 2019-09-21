package Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Music.db";
    public static final String LEVEL_1 = "Level1";
    public static final String LEVEL_2 = "Level2";
    public static final String LEVEL_3 = "Level2";
    public static final String DEFAULT_SCORE = "0";
    public static final int LEVEL_3_DEFAULT_SCORE = 0;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_USER_INFO = "CREATE TABLE " + UsersMaster.UsersInfo.TABLE_NAME
                + " (" + UsersMaster.UsersInfo._ID + " INTEGER PRIMARY KEY,"
                + UsersMaster.UsersInfo.COLUMN_NAME_USERNAME + " TEXT,"
                + UsersMaster.UsersInfo.COLUMN_NAME_CURRENT_LEVEL + " TEXT,"
                + UsersMaster.UsersInfo.COLUMN_NAME_LEVEL1_SCORE + " TEXT,"
                + UsersMaster.UsersInfo.COLUMN_NAME_LEVEL2_SCORE + " TEXT,"
                + UsersMaster.UsersInfo.COLUMN_NAME_LEVEL3_SCORE + " INTEGER,"
                + UsersMaster.UsersInfo.COLUMN_NAME_LEVEL4_SCORE + " TEXT)";

        db.execSQL(SQL_CREATE_USER_INFO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public long insertData(String userName, String score){
        SQLiteDatabase database = getWritableDatabase();

        ContentValues values =  new ContentValues();
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_USERNAME, userName);
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_CURRENT_LEVEL, LEVEL_1);
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_LEVEL1_SCORE, score);
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_LEVEL2_SCORE, DEFAULT_SCORE);
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_LEVEL3_SCORE, DEFAULT_SCORE);
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_LEVEL4_SCORE, DEFAULT_SCORE);

        long result = database.insert(UsersMaster.UsersInfo.TABLE_NAME,null, values);

        return result;
    }

    public String getUser(String userName){
        SQLiteDatabase database = getReadableDatabase();

        String projection[] = {
                UsersMaster.UsersInfo._ID,
                UsersMaster.UsersInfo.COLUMN_NAME_USERNAME,
                UsersMaster.UsersInfo.COLUMN_NAME_CURRENT_LEVEL,
                UsersMaster.UsersInfo.COLUMN_NAME_LEVEL1_SCORE,
                UsersMaster.UsersInfo.COLUMN_NAME_LEVEL2_SCORE,
                UsersMaster.UsersInfo.COLUMN_NAME_LEVEL3_SCORE,
                UsersMaster.UsersInfo.COLUMN_NAME_LEVEL4_SCORE,
        };

        String selection = UsersMaster.UsersInfo.COLUMN_NAME_USERNAME + "=?";
        String selectionArgs[] = {userName};

        Cursor cursor = database.query(
                UsersMaster.UsersInfo.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        if( cursor != null && cursor.moveToFirst()){
            return cursor.getString(cursor.getColumnIndex(UsersMaster.UsersInfo.COLUMN_NAME_USERNAME));
        }
        else {
            return null;
        }

    }

    public int insertRound2Score(String score, String userName){
        SQLiteDatabase database = getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_LEVEL2_SCORE, score);
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_CURRENT_LEVEL, LEVEL_2);

        String selection = UsersMaster.UsersInfo.COLUMN_NAME_USERNAME + "=?";
        String selectionArgs[] = {userName};

        int count = database.update(
                UsersMaster.UsersInfo.TABLE_NAME,
                values,
                selection,
                selectionArgs
        );

        return count;
    }

    public int insertRound3Score(int score, String userName){
        SQLiteDatabase database = getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_LEVEL3_SCORE, score);
        values.put(UsersMaster.UsersInfo.COLUMN_NAME_CURRENT_LEVEL, LEVEL_3);

        String selection = UsersMaster.UsersInfo.COLUMN_NAME_USERNAME + "=?";
        String selectionArgs[] = {userName};

        int count = database.update(
                UsersMaster.UsersInfo.TABLE_NAME,
                values,
                selection,
                selectionArgs
        );

        return count;
    }

    public String readInfo(String userName) {

        SQLiteDatabase database = getReadableDatabase();

        String[] projection = {

                UsersMaster.UsersInfo._ID,
                UsersMaster.UsersInfo.COLUMN_NAME_USERNAME,
                UsersMaster.UsersInfo.COLUMN_NAME_CURRENT_LEVEL,
                UsersMaster.UsersInfo.COLUMN_NAME_LEVEL2_SCORE,
        };

        String selection = UsersMaster.UsersInfo.COLUMN_NAME_USERNAME + "=?";
        String selectionArgs[] = {userName};

        Cursor cursor = database.query(
                UsersMaster.UsersInfo.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                null

        );

        String username = cursor.getString(cursor.getColumnIndexOrThrow(UsersMaster.UsersInfo.COLUMN_NAME_USERNAME));

        cursor.close();
        return username;
    }


//        // Updating Employee
//        public int insertRound2Score(String name , String score) {
//
//            SQLiteDatabase database = getReadableDatabase();
//
//            ContentValues values = new ContentValues();
//            values.put(UsersMaster.UsersInfo.COLUMN_NAME_USERNAME, name);
//            values.put(UsersMaster.UsersInfo.COLUMN_NAME_LEVEL2_SCORE, score);
//            values.put(UsersMaster.UsersInfo.COLUMN_NAME_CURRENT_LEVEL, "LEVEL_2");
//
//            // updating row
//            return database.update(UsersMaster.UsersInfo.TABLE_NAME, values,
//                    UsersMaster.UsersInfo.COLUMN_NAME_USERNAME + "=?",new String[] { String.valueOf(name)});
//
//    }
}
