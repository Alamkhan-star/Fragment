package com.example.fragment;

import java.sql.Time;

public class Contact {

    String Name;
    String Time;
    int Photo;

    public Contact() {

    }

    public Contact(String name, String time, int photo) {
        Name = name;
        Time = time;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Time;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String time) {
        Time = time;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
