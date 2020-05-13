package cn.linkztop.fastbusinesssystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nasico
 */
@Controller
public class AuthController {

    @GetMapping("login")
    public String login(){
        return "login";
    }
}
