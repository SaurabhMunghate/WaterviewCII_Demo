package com.example.demo1;

//public class LoginController {
//
//}
//package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//import com.in28minutes.springboot.web.service.LoginService;

@Controller
//@SessionAttributes("name")
public class LoginController {

    @Autowired
//    LoginService service;

    @RequestMapping("/login")
    public String showLoginPage(){
//         System.out.println("HI this is login page");
         return "HI this is login page";
    }
 //@RequestMapping("/login")
   // public String showLoginPage(){
//         System.out.println("HI this is login page");
     //    return "HI this is login page";
    //}
//    @RequestMapping(value="/login", method = RequestMethod.POST)
//    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

//        boolean isValidUser = service.validateUser(name, password);

//        if (!isValidUser) {
//            model.put("errorMessage", "Invalid Credentials");
//            return "login";
//        }

//        model.put("name", name);
//        model.put("password", password);

//        return "welcome";
//    } 
    

}	