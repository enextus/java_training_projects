package com.example.demo_web.controller;

import com.example.demo_web.dto.Auto;
import com.example.demo_web.dto.Greetings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

/*    @GetMapping("/")
    public String hello() {

        return "start";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model) {

        model.addAttribute(name);
        model.addAttribute("defaultName", "Peter Parker");
        model.addAttribute("greetings", "Hello!");

        return "hello";
    }

    //  @RequestMapping(value = "/hello-string/{name}", method = RequestMethod.GET)
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

    // JSON Mapping

    @RequestMapping(value = "/hello-json/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Greetings helloJson(@PathVariable String name) {
        String capitalName = name.toUpperCase();
        Greetings response = new Greetings(capitalName, "Yo");
        return response;
    }*/

    @PostMapping("/auto")
    @ResponseBody
    public String acceptAuto(@RequestBody Auto auto) {
        return "The following auto was received: " + "make: " + auto.make + ", color: " + auto.color;
    }

}
