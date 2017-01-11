package com.lacemile.service;

import com.lacemile.model.Message;

/**
 * Created by yuume on 17/1/6.
 */
public class HelloServiceImpl implements HelloService {
    public Message findById(String id){
        return new Message("name_" + id, "text_" + id);
    }
}
