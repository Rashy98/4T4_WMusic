package Database;

import android.provider.BaseColumns;

public final class UsersMaster {

    private UsersMaster() {
    }

    protected static class Users implements BaseColumns {

        public static final String TABLE_NAME = "Level04";
        public static final String COLUMN_NAME_USERNAME = "uname";
        public static final String COLUMN_NAME_CURRENT_ROUND = "currentRound";
        public static final String COLUMN_NAME_POINTS = "points";


    }
}
