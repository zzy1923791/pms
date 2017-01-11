package com.lacemile.authentication;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * Created by yuume on 17/1/10.
 */
public class AuthenticationTest {
    private static final String baseAddress = "http://localhost:8080";

    @Test
    public void testAuthentication(){
        String response = WebClient.create(baseAddress)
                .path("/Authentication")
                .replaceQueryParam("i_user_key",9)
                .replaceQueryParam("c_function_uri","AMS_SV13_F133")
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println("输出结果为1时,通过! 结果: " + response);
    }

    @Test
    public void testAuthentication1(){
        String response = WebClient.create(baseAddress)
                .path("/Authentication")
                .replaceQueryParam("i_user_key",0)
                .replaceQueryParam("c_function_uri","AMS_SV13_F133")
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println("输出结果为0时,认证失败! 结果: " + response);
    }

    @Test
    public void testAuthentication2(){
        String response = WebClient.create(baseAddress)
                .path("/Authentication")
                .replaceQueryParam("i_user_key",9)
                .replaceQueryParam("c_function_uri","CMS_SV13_F133")
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println("输出结果为-2时,URI错误,认证失败! 结果: " + response);
    }
}
