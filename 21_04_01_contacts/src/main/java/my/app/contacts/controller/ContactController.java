package my.app.contacts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ContactController {

    /**
     * @return
     */
    @GetMapping("/contacts")
    public String contacts() {
        return "contacts";
    }

    /**
     * @return
     */
    @GetMapping("/add-contact")
    public String addContact() {
        return "contact-form";
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/edit-contact/{id}")
    public String editContact(@PathVariable int id) {
        return "contact-form";
    }

    @GetMapping("/contacts/{id}")
    public String contact(@PathVariable int id) {
        return "user-details";
    }

}
