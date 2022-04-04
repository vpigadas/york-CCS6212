package eu.york.course.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UserEntity.class}, version = 1)
public abstract class AppInstance extends RoomDatabase {
    public abstract UserDao getUserDao();
}
