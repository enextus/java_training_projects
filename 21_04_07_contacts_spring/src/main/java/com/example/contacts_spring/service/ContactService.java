package com.example.contacts_spring.service;

import com.example.contacts_spring.entity.Contact;
import com.example.contacts_spring.repo.IContactRepo;
import org.springframework.stereotype.Service;

import java.util.List;

// самая важная тут лежит domain logic
// логика бизнеса лежит здесь

@Service
public class ContactService {

    IContactRepo contactRepo;

    ContactService() {

        this.contactRepo = IContactRepo contactRepo;

    }


    public ContactService(IContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    public List<Contact> getAll() {
        return contactRepo.findAll();
    }

    public Contact get(int id) {
        return contactRepo.find(id);
    }

    public void save(Contact contact) {
        contactRepo.save(contact);
    }

    public Contact remove(int id) {
        return contactRepo.remove(id);
    }

}
