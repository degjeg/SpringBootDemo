package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017-11-10.
 */
@Controller
public class IndexController {

    @Autowired
    private BookProperties bookProperties;

    @RequestMapping("/")
    public
    @ResponseBody
    String index() {
        return "欢迎你" + Math.random()+"+" + bookProperties.getName() + "," + bookProperties.getAge();
    }
}
