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
public interface ContactGroupDAO {

    @Insert
    void addContactGroup(ContactGroup... contactGroup);

    @Query("SELECT * FROM ContactGroup")
    List<ContactGroup> getContactGroups();

    @Query("SELECT * FROM ContactGroup WHERE `group` LIKE :group")
    List<ContactGroup> getContactsGroupusingGroup(Group group);

    @Query("SELECT * FROM ContactGroup WHERE contact LIKE :contact")
    List<ContactGroup> getContactGroupusingContact(Contact contact);

    @Update
    void updateContactGroup(ContactGroup... contactGroups);

}
