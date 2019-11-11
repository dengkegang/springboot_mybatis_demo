package com.elifen.spring_demo.controller;

import com.elifen.spring_demo.pojo.User;
import com.elifen.spring_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/demo")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestBody User user){
        int flag = userService.addUser(user);
        if(flag==1) {
            System.out.println("user = [" + user + "]");
        }
        return "saved";
    }

    @PostMapping(path = "/delete")
    public @ResponseBody String deleteUser(@RequestBody User user){
        User u = userService.getOneUser(user.getId());
        if(u != null){
            userService.deleteUser(u.getId());
            return "deleted";
        }else{
            return "not have this user";
        }
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUser(){
        return userService.getAllUser();
    }
}
