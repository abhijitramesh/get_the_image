package com.example.get_the_image.Room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Image.class},version = 1)

public abstract class AppDatabase extends RoomDatabase {
    public abstract ImageDAO imageDAO();
}
