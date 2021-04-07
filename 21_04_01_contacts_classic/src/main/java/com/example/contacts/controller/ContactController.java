package com.example.contacts.controller;

import com.example.contacts.entity.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
public class ContactController {
    List<Contact> contacts = Arrays.asList(
            new Contact(1, "Vasya", "Vasin", 21),
            new Contact(2, "Petya", "Peterson", 22)
    );
    static int lastUsedId = 2;



    // REDIRECT START

    /**
     * @return
     */
    @GetMapping("/")
    public String mainPage() {
        return "forward:/contacts";
    }

/*
    @GetMapping("/")
    public String mainPage() {
        return "redirect:/contacts";
    }*/

    /*    *//**
     * @return
     *//*
    @GetMapping("/contacts", ""/")
    public String contacts(Model model) {
        model.addAttribute()
        return "contacts";
    }*/


    // REDIRECT END


    /**
     * The endpoint should return the page containing the list of contacts
     *
     * @return
     */
    @GetMapping("/contacts")
    public String contacts(Model model) {

        List<Contact> contacts = new ArrayList<>();

        { // initialisation block
            contacts.add(new Contact(1, "Vasya", "Vasin", 21));
            contacts.add(new Contact(2, "Petya", "Peterson", 22));
        }

        model.addAttribute("contacts", contacts);

        return "contacts";
    }

    /**
     * The endpoint should return the page with the empty form for creating a new contact.
     *
     * @return
     */
    @GetMapping("/add-contact")
    public String addContact(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact-form";
    }

    /**
     * The endpoint should return the page with the form filled in with a certain contact.
     *
     * @param id the id of the specified contact
     * @return
     */
    @GetMapping("/edit-contact/{id}")
    public String editContact(@PathVariable int id, Model model) {

        Contact contact = contacts.stream()
                .filter(cont -> cont.getId() == id)
                .findFirst()
                // .orElseThrow(() -> new NoSuchElementException() );
                .orElseThrow(NoSuchElementException::new);

        model.addAttribute("contact", contact);

        return "contact-form";
    }

    /**
     * The endpoint should return the page with the details of a certain contact.
     *
     * @param id
     * @return
     */
    @GetMapping("/contacts/{id}")
    public String contact(@PathVariable int id, Model model) { // Model model в рамках запроса живет !!
        return "user-details";
    }

    /**
     * The endpoint saves ether a new contact ot the existing contact (depending on the value of the field "id") and
     * then redirects to the contacts page
     *
     * @return
     */
    @PostMapping("/save-contact")
    public String saveContact(@ModelAttribute Contact contact) {
        if(contact.getId() == 0 ) {
             contact.setId(++lastUsedId);

        }else {

            Contact oldConatct = contacts.stream()
                    .filter(cont -> cont.getId() == contact.getId())
                    .findFirst()
                    .orElseThrow(NoSuchElementException::new);


        }
        return "redirect:/contacts";
    }

    /**
     * The endpoint removes the contact and return the redirect to the contacts page.
     *
     * @param id
     * @return
     */
    @GetMapping("/delete-contact/{id}")
    public String deleteContact(@PathVariable int id) {
        return "redirect:/contacts";
    }

}
