package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

@Entity
public class Contact {
    @PrimaryKey @NonNull
    private UUID uid;
    private String name;

    public Contact() {
        this(null);
    }

    @Ignore
    public Contact(String name) {
        this(name, UUID.randomUUID());
    }

    private Contact(String name, UUID uid) {
        this.name = name;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) { this.uid = uid; }
}
