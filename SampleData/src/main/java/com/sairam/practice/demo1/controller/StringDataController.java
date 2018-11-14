package com.sairam.practice.demo1.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class StringDataController {

    List<String> stringList = new ArrayList<>();


    @RequestMapping(value = "/securities/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> sendStringData(){

        stringList.add("12345");
        stringList.add("23435");
        stringList.add("23436");
        return stringList;
    }
/*

    @RequestMapping(value = "/customers/{phoneNo}/friends", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Long> getSpecificFriends(@PathVariable Long phoneNo) {
        logger.info("Friend and Family numbers for customer {}", phoneNo);
        return friendService.getSpecificFriends(phoneNo);
    }
*/

}
