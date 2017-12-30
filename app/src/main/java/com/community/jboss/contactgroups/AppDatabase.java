package com.community.jboss.contactgroups;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.community.jboss.contactgroups.data.Contact;
import com.community.jboss.contactgroups.data.ContactDAO;
import com.community.jboss.contactgroups.data.ContactGroup;
import com.community.jboss.contactgroups.data.ContactGroupDAO;
import com.community.jboss.contactgroups.data.ContactNumber;
import com.community.jboss.contactgroups.data.ContactNumberDAO;
import com.community.jboss.contactgroups.data.Group;
import com.community.jboss.contactgroups.data.GroupDAO;

/**
 * Created by jatin on 29-12-2017.
 */

@Database(entities =
    {
        Contact.class,
        ContactGroup.class,
        ContactNumber.class,
        Group.class
    },
        version = 1,
        exportSchema = false)
public abstract class AppDatabase extends RoomDatabase{
    public abstract ContactDAO contactDAO();
    public abstract ContactGroupDAO contactGroupDAO();
    public abstract ContactNumberDAO contactNumberDAO();
    public abstract GroupDAO groupDAO();
}
