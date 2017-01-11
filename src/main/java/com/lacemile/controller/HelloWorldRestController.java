package com.lacemile.controller;

import com.lacemile.model.Message;
import com.lacemile.service.HelloServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuume on 17/1/6.
 */
@RestController
public class HelloWorldRestController {

    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player){
        HelloServiceImpl impl = new HelloServiceImpl();
        return impl.findById(player);
    }
}
