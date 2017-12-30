package com.community.jboss.contactgroups.data;



import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

@Entity
public class ContactNumber {
    @PrimaryKey @NonNull
    private UUID uid;
    private int number;
    private Contact contact;

    public ContactNumber() {
        this(-1, null);
    }

    @Ignore
    public ContactNumber(int number, Contact contact) {
        this(number, contact, UUID.randomUUID());
    }

    private ContactNumber(int number, Contact contact, UUID uid) {
        this.number = number;
        this.contact = contact;
        this.uid = uid;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public UUID getUid() { return uid; }

    public void setUid(UUID uid) { this.uid = uid; }
}
