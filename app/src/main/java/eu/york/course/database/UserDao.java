package eu.york.course.database;

import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    UserEntity create(UserEntity user);

    @Update
    UserEntity update(UserEntity user);

    @Delete
    boolean delete(UserEntity user);

    @Query("SELECT * FROM User")
    @Nullable
    List<UserEntity> get();

    @Query("SELECT * FROM User LIMIT 1")
    @Nullable
    UserEntity getOne();

    @Query("SELECT * FROM User Where Name LIKE :name")
    @Nullable
    List<UserEntity> get(String name);

}
