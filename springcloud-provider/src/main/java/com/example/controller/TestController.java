package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * Created by hcmony on 2017/9/5.
 */
@RestController
public class TestController {

   //@Value("${server.port}")
   @Value("${server.port}")
   String port;
 
   @RequestMapping("/test")
   public String test(){
      return "provider 被调用了！:" +port;
   }
}