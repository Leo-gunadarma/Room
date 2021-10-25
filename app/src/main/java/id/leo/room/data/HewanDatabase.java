package id.leo.room.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Hewan.class} , version = 1)
public abstract class HewanDatabase extends RoomDatabase {
    public abstract HewanDao hewanDao();
    private static HewanDatabase INSTANCE;
    public static HewanDatabase getDbInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    HewanDatabase.class,"db_hewan")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
}
