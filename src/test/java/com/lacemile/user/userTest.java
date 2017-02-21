package com.lacemile.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuume on 17/1/20.
 */


public class UserTest {
    private static final String baseAddress = "http://localhost:8080";

    private static final List<Object> providerList = new ArrayList<Object>();

    @Test
    public void getUserTest() {
        String user = WebClient.create(baseAddress)
                .path("/get_user")
                .replaceQueryParam("i_user_key",1)
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println(user);
    }

    @Test
    public void getUserTest1(){
        String user = WebClient.create(baseAddress)
                .path("/get_user")
                .replaceQueryParam("i_user_key",2)
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println(user);
    }
    @Test
    public void getUserTest2(){
        String user = WebClient.create(baseAddress)
                .path("/get_user")
                .replaceQueryParam("i_user_key",3)
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println(user);
    }

    @Test
    public void getUsersTestJson(){
        String fuleFilePath = "/Users/yuume/IdeaProjects/com.lacemile/pms/src/test/java/com/lacemile";
        String fullFileName = fuleFilePath + "/user/jsonIn.json";
        String strResult = "";
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode rootNode = objectMapper.readTree(new File(fullFileName));

            strResult = rootNode.toString();
        }catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        }

        String user = WebClient.create(baseAddress)
                .path("/get_user1")
                .replaceQueryParam("jsonIn", strResult)
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println(user);
    }
}
