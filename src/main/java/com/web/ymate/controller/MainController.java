package com.web.ymate.controller;

import com.web.ymate.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class MainController {

    @PostMapping(path = "/user", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String createUser(User user) {
        System.out.println(user.toString());
        return "User has been created";
    }
}
