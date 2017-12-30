package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;
import java.util.UUID;

/**
 * Created by jatin on 29-12-2017.
 */

@Dao
public interface ContactDAO {

    @Insert
    void addContact(Contact... contacts);

    @Query("SELECT * FROM Contact")
    List<Contact> getContacts();


    @Query("SELECT * FROM Contact WHERE uid LIKE :uid")
    List<Contact> getContactusingId(UUID uid);

    @Update
    void updateContact(Contact... contacts);
}
