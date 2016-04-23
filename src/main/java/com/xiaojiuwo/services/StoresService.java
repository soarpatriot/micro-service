package com.xiaojiuwo.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * Created by liuhaibao on 16/4/15.
 */
@Component
public class StoresService {


    @HystrixCommand(fallbackMethod = "defaultParticipants")
    public String getParticipants(String raceId) {
        return "hello";
    }

    public String defaultParticipants(String raceId) {
        return "default";
    }

}
