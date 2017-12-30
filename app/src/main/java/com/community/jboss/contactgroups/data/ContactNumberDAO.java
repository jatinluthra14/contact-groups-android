package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by jatin on 29-12-2017.
 */

@Dao
public interface ContactNumberDAO {

    @Insert
    void addContactNumber(ContactNumber... contactNumbers);

    @Query("SELECT * FROM ContactNumber")
    List<ContactNumber> getContactNumbers();

    @Query("SELECT * FROM ContactNumber WHERE uid LIKE :uid")
    List<ContactNumber> getContactNumberById(String uid);

    @Query("SELECT * FROM ContactNumber WHERE contact LIKE :contact")
    List<ContactNumber> getContactNumberByContact(Contact contact);

    @Query("SELECT * FROM ContactNumber WHERE number LIKE :number")
    List<ContactNumber> getContactNumberByNumber(int number);

    @Update
    void updateContactNumber(ContactNumber... contactNumbers);

}
