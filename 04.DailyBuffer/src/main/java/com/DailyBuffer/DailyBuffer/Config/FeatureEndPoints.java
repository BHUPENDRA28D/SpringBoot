//package com.DailyBuffer.DailyBuffer.Config;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
//import org.springframework.stereotype.Component;
//
//import java.awt.*;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//@Component
//@Endpoint(id ="features")
//public class FeatureEndPoints {
//
//    private final Map<String, Taskbar.Feature> featureMap = new ConcurrentHashMap<>();
//
//
//    public FeatureEndPoints() {
//        featureMap.put("Department",new Feature(featureMap.isEmpty(): true));
//    }
//
//    @Data
//    @NoArgsConstructor
//    @AllArgsConstructor
//    private static  class Feature{
//    private boolean isEnabled;
//
//    }
//
//
//}
