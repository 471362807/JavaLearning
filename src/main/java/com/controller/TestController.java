package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date:2023-09-19-10:39
 *
 * @author zhangjian
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "HelloWorld";
    }

}
