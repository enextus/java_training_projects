package com.example.demo.controller;

import com.example.demo.dto.Auto;
import com.example.demo.dto.Greetings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model) {

        model.addAttribute(name);
        model.addAttribute("defaultName", "Peter Parker");
        model.addAttribute("greetings", "Hello!");

        return "hello";
    }

    @RequestMapping(value = "/hello-string/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String helloString(@PathVariable String name) {
        String capitalName = name.toUpperCase();
        return "Hello " + capitalName + "!";
    }

    @GetMapping("/hello-plain/{name}")
    @ResponseBody
    public String helloPlain(@PathVariable String name, Model model) {

        model.addAttribute(name);
        model.addAttribute("defaultName", "Peter Parker");
        model.addAttribute("greetings", "Hello!");

        return name;
    }

    @RequestMapping(value = "/hello-json/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Greetings helloJson(@PathVariable String name) {
        String capitalName = name.toUpperCase();
        Greetings response = new Greetings(capitalName, "Yo");
        return response;
    }

    @PostMapping(value = "/auto")
    @ResponseBody
    public String acceptAuto(@RequestBody Auto auto) { ;
        System.out.println(auto);
        return "The following auto was received: " + "make" + auto.make + ", color: " + auto.color;
    }

}
