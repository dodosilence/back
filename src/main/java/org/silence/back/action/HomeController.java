package org.silence.back.action;

import org.silence.back.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by tristan on 16/4/18.
 */
@Controller
public class HomeController {


    @RequestMapping
    @ResponseBody
    public Object homePage(){
        User user=  new User();
        user.setId("asdasdasd");
        return user;
    }
}
