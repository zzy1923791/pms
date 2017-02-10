package com.lacemile.controller;

import com.lacemile.service.sys.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuume on 17/1/10.
 * 权限认证Service
 */
@RestController
public class AuthenticationRest {

    @Autowired
    AuthenticationService authenticationService;

    @RequestMapping("/authentication")
    public int authentication(@RequestParam int i_user_key, @RequestParam  String c_function_uri){

        int i = authenticationService.i_accept(i_user_key,c_function_uri);
        return i;
    }
}
