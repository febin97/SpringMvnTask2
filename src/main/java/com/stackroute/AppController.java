package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String Login(Model model){
        return "index";
    }
    @RequestMapping(value = "/displayUser",method = RequestMethod.POST)
    public String displayUser(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "userPassword") String userPassword, ModelMap model
    ){
        User user = new User(userName,userPassword);
        model.addAttribute("user",user);
        return "displayUser";
    }
}
