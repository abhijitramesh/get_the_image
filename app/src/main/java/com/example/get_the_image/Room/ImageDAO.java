package com.example.get_the_image.Room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;


import java.util.List;

@Dao
public interface ImageDAO {

    @Query("SELECT * FROM Image")
    List<Image> getAll();

    @Insert
    void insert(Image image);

    @Delete
    void delete(Image image);

    @Update
    void  update(Image image);
}
