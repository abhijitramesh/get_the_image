package com.example.get_the_image.Room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


import java.io.Serializable;
@Entity
public class Image implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] image;

    /**
     * Getters and Setters
     *
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImage(){
        return image;
    }

    public void  setImage(byte[] image){
        this.image = image;
    }



}
