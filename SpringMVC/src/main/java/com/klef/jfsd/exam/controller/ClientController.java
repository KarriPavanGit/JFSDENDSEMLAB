package com.klef.jfsd.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {
    
    @GetMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", username);
        return "greet";
    }
    
    @GetMapping("/about")
    public String about() {
    	System.out.println("Done");
        return "about";
    }
    
    @GetMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }
    
    @GetMapping("/demo2/{num1}/{num2}")
    public String demo2(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        int subtraction = num1 - num2;
        double division = (double) num1 / num2;
        model.addAttribute("subtraction", subtraction);
        model.addAttribute("division", division);
        return "demo2";
    }
    
    @GetMapping("/productform")
    public String productForm() {
        return "productform";
    }
    
    @GetMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 * num2;
        model.addAttribute("result", result);
        return "multiplyNumbers";
    }
    
    @GetMapping("/reverse")
    public String reverseStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        StringBuilder  sb1= new StringBuilder(str1);
        String reversedStr1=sb1.reverse().toString();
       StringBuilder sb2= new StringBuilder(str2);
       String reversedStr2 =sb2.reverse().toString();
        model.addAttribute("reversedStr1", reversedStr1);
        model.addAttribute("reversedStr2", reversedStr2);
        return "reverse";
    }
    
    @GetMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        model.addAttribute("addition", addition);
        model.addAttribute("subtraction", subtraction);
        return "calculate";
    }
}
