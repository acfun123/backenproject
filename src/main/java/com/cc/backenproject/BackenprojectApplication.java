package com.cc.backenproject;

import com.cc.backenproject.mapper.SysLogMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@SpringBootApplication
@Controller
public class BackenprojectApplication {

    @Resource
    SysLogMapper sysLogMapper;

    public static void main(String[] args) {
        SpringApplication.run(BackenprojectApplication.class, args);
    }

    @PostMapping("/hello/{sysId}")
    @ResponseBody
    public Object hello(@PathVariable long sysId){
        return sysLogMapper.selectByPrimaryKey(sysId);
    }

}
