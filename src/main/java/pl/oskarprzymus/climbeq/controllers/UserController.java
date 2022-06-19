package pl.oskarprzymus.climbeq.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {


    @GetMapping("")
    public String home(){
        return ("<h1>Welcome user</h1>");
    }
}
