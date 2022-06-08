package edu.zjnu.biz.controller;

import edu.zjnu.biz.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 描述
 * @author: 杨海波
 * @date: 2022-01-29
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public String getUser(Model model) {
        User user = new User();
        user.setName("罗思雯");
        user.setAge(17);
        model.addAttribute("user", user);
        return "user";
    }
}
