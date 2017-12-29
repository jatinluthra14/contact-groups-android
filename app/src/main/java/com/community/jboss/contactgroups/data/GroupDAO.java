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
public interface GroupDAO {

    @Insert
    void addGroup(Group... groups);

    @Query("SELECT * FROM 'Group'")
    List<Group> getAllGroup();

    @Query("SELECT * FROM 'Group' WHERE uid LIKE :uid")
    List<Group> getGroupById(String uid);

    @Query("SELECT * FROM 'Group' WHERE name LIKE :name")
    List<Group> getGroupsByName(String name);

    @Update
    void updateGroup(Group... groups);

}
