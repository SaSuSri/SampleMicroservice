package com.sairam.practice.demo1.cache;

import java.util.HashMap;
import java.util.Map;

public class DateRefCache {

    private static Map<String,String> dateRefMap = new HashMap<>();

    public static void setDateRefMap(Map<String,String> dateMap){
        dateRefMap = dateMap;
    }

    public static Map<String,String> getDateRefMap(){
        return dateRefMap;
    }
}
