package com.example.contacts_spring.repo;

import com.example.contacts_spring.entity.Contact;

import java.util.HashMap;
import java.util.List;

public class ContactRepoMap implements IContactRepo {

    HashMap<Integer, Contact> contactById;

    @Override
    public void save(Contact contact) {

    }

    @Override
    public Contact find(int id) {
        return null;
    }

    @Override
    public Contact remove(int id) {
        return null;
    }

    @Override
    public List<Contact> findAll() {
        return null;
    }
}