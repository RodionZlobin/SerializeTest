package com.rodion.serializer;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.JsonObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Instant;
import java.util.ArrayList;


/**
 * @author Rodion Zlobin {@literal <mailto:rodion.zlobin@so4it.com/>}.
 */
public class Start {
    public static void main(String[] args) throws JsonProcessingException {
        Instant instant = Instant.ofEpochSecond(825000000);
        User user = new User("name", "family", new ArrayList(), instant);

        user.getList().add("1");
        user.getList().add("2");

        System.out.println(user);


        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", user.getFirstName());
        jsonObject.addProperty("instant", String.valueOf(user.getInstant()));
        jsonObject.addProperty("list", String.valueOf(user.getList()));

        System.out.println(jsonObject);



        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        String json = objectMapper.writeValueAsString(user);
        System.out.println(objectMapper.writeValueAsString(user));
        System.out.println(json);








    }
}
