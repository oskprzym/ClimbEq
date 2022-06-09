package pl.oskarprzymus.climbeq.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin")
public class AdminController {

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome admin</h1>");
    }

}
