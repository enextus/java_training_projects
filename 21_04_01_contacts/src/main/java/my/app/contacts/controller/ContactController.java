package my.app.contacts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

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
    public String contact(@PathVariable int id) {
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
        if (contact.getId() <= 0) {
            contact.setId(++lastUsedId);
            contacts.add(contact);
        } else {
            Contact oldContact = contacts.stream()
                    .filter(contactus -> contactus.getId() == contact.getId())
                    .findFirst()
                    .orElseThrow(NoSuchElementException::new);

            oldContact.setName(contact.getName());
            oldContact.setLastName(contact.getLastName());
            oldContact.setAge(contact.getAge());
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
