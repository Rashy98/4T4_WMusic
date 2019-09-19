package Database;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="ScoreInfo.db";

   public DBHelper(Context context){super(context,DATABASE_NAME,null,1);}

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

       String SQL_CREATE_ENTRIES=
               "CREATE TABLE "+UserMaster.Users.TABLE_NAME+"("+
                       UserMaster.Users._ID+" INTEGER PRIMARY KEY,"+
                       UserMaster.Users.COLUMN_NAME_SCORE+" TEXT)";

        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addInfo(String score){

     SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(UserMaster.Users.COLUMN_NAME_SCORE,score);

        long newRowId = db.insert(UserMaster.Users.TABLE_NAME,null,values);
        if(newRowId != -1)
        {
            System.out.println("Inserted");
        }
    }
}
