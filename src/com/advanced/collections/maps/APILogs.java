package com.advanced.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;
public class APILogs {
    public static void main(String[] args) {
        // String str = "Hello";
        // System.out.println(str);
        Map<String, String> logs = new LinkedHashMap<>();
        logs.put("50", "SignUp");
        logs.put("2", "Login");
        logs.put("100", "Browse Instagram Reels");
        logs.put("7", "Scroll up and down");
        logs.put("1", "LogOut");
        System.out.println("API logs: " + logs);
    }
}
