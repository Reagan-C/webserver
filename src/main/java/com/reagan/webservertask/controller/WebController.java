package com.reagan.webservertask.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    public static final String JSON_RESPONSE_STARTING = "{\n" ;
    public static final String SLACK_USERNAME = "\"slackUsername\": " + "\"Reagan\", ";
    public static final boolean BACKEND = true;
    public static final int AGE = 28;
    public static final String BIO = ", \"bio\": \"I am Reagan, a passionate junior backend engineer with java language" +
            " who has an eye for details\" \n";
    public static final String JSON_RESPONSE_ENDING = "}";
    public static final String RESPONSE =  JSON_RESPONSE_STARTING + SLACK_USERNAME + "\"backend\": " + BACKEND +
            ", \"age\": " + AGE + BIO + JSON_RESPONSE_ENDING;

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getJson() {
        return RESPONSE;
    }
}
