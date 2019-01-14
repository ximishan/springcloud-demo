package com.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
 * Created by hcmony on 2017/9/5.
 */
@FeignClient(value = "springcloud-provider")
public interface TestService {
 
   @RequestMapping("/test")
   String test();
 
}