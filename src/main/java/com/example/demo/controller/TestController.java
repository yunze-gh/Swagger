package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * @author gaohan
 * @version 1.0
 * @date 2020/7/22 23:47
 */
@RestController
@RequestMapping(value = "/api")
@Api(value = "/api", tags = "TestController", description = "信息管理接口")
public class TestController {

    @RequestMapping(value = "/index/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String index(@PathVariable String id){
        System.err.println(id);
        return id;
    }


}
