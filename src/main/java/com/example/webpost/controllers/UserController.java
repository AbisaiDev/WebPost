package com.example.webpost.controllers;

import com.example.webpost.entities.Publication;
import com.example.webpost.entities.User;
import com.example.webpost.services.PublicationService;
import com.example.webpost.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class UserController {
    private final UserService<User> userService;
    private final PublicationService<Publication> publicationService;

    public UserController(UserService<User> userService, PublicationService<Publication> publicationService) {
        this.userService = userService;
        this.publicationService = publicationService;
    }

    @GetMapping("/")
    public ModelAndView index() throws Exception {
        return new ModelAndView("index").addObject("post", publicationService.findAll());
    }
}
