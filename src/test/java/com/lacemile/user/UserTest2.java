package com.lacemile.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lacemile.model.sys.user.User;

import java.io.IOException;
import java.util.*;

public class UserTest2 {

    public static void main(String[] args) throws IOException {

        User user1 = new User();
        user1.setI_key(1);
        user1.setC_name("测试一");
        user1.setC_imageName("I1.img");
        user1.setC_imagePath("/a/b/c/d");

        User user3 = new User();
        user3.setI_key(2);
        user3.setC_name("测试二");
        user3.setC_imageName("I2.img");
        user3.setC_imagePath("/e/f/g/d");

        ObjectMapper mapper = new ObjectMapper();

        //Convert between List and JSON
        List<User> stuList = new ArrayList<User>();
        stuList.add(user1);
        stuList.add(user3);
        String jsonfromList = mapper.writeValueAsString(stuList);
        System.out.println(jsonfromList);

        //List Type is not required here.
        List stuList2 = mapper.readValue(jsonfromList, List.class);
        System.out.println(stuList2);
        System.out.println("************************************");

        //Convert Map to JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("studentList", stuList);
        map.put("class", "ClassName");
        String jsonfromMap =  mapper.writeValueAsString(map);
        System.out.println(jsonfromMap);

        Map map2 =  mapper.readValue(jsonfromMap, Map.class);
        System.out.println(map2);
        System.out.println(map2.get("studentList"));
        System.out.println("************************************");

        //Convert Array to JSON
        User[] stuArr = {user1, user3};
        String jsonfromArr =  mapper.writeValueAsString(stuArr);
        System.out.println(jsonfromArr);
        User[] stuArr2 =  mapper.readValue(jsonfromArr, User[].class);
        System.out.println(Arrays.toString(stuArr2));
    }

}