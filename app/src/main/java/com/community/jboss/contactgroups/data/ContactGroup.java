package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity
public class ContactGroup {
    @PrimaryKey @NonNull
    private Contact contact;
    private Group group;

    public ContactGroup() {
        this(null, null);
    }

    @Ignore
    public ContactGroup(Contact contact, Group group) {
        this.contact = contact;
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setContact(Contact contact) { this.contact = contact; }

    public Contact getContact() {
        return contact;
    }

    public void setGroup(Group group) { this.group = group; }

}
