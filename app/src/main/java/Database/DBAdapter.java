package Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DBAdapter {
    DBHelper dbH;

    public DBAdapter(Context context) {
        dbH = new DBHelper(context);
    }

    public long insertData(String name, int crtrnd,int points) {
        SQLiteDatabase dbb = dbH.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UsersMaster.Users.COLUMN_NAME_USERNAME, name);
        contentValues.put(UsersMaster.Users.COLUMN_NAME_CURRENT_ROUND,crtrnd);
        contentValues.put(UsersMaster.Users.COLUMN_NAME_POINTS,points);
        long id = dbb.insert(UsersMaster.Users.TABLE_NAME, null , contentValues);
        return id;
    }

   /* public int updateRound(int  points , int round , int oldround) {
        SQLiteDatabase db = dbH.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(UsersMaster.Users.COLUMN_NAME_POINTS,points);
        contentValues.put(UsersMaster.Users.COLUMN_NAME_CURRENT_ROUND,round);

        int[] whereArgs= {oldround};
        int count =  db.update(UsersMaster.Users.TABLE_NAME,contentValues, UsersMaster.Users._ID +" =" , whereArgs);
        return count;
    }*/

    public String getUserName() {
        SQLiteDatabase db = dbH.getWritableDatabase();
        String[] columns = {UsersMaster.Users._ID,UsersMaster.Users.COLUMN_NAME_USERNAME, UsersMaster.Users.COLUMN_NAME_POINTS, UsersMaster.Users.COLUMN_NAME_CURRENT_ROUND};
        Cursor cursor =db.query(UsersMaster.Users.TABLE_NAME,columns,null,null,null,null,null);
        StringBuffer buffer= new StringBuffer();
        while (cursor.moveToNext())
        {
            int cid =cursor.getInt(cursor.getColumnIndex(UsersMaster.Users._ID));
            String name =cursor.getString(cursor.getColumnIndex(UsersMaster.Users.COLUMN_NAME_USERNAME));
            String points =cursor.getString(cursor.getColumnIndex(UsersMaster.Users.COLUMN_NAME_POINTS));
            buffer.append(name);
        }
        return buffer.toString(); }
}
