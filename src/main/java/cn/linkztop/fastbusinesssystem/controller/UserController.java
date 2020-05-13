package cn.linkztop.fastbusinesssystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nasico
 */
@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
