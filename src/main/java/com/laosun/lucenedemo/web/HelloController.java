/**
 * Copyright (C), 2009-2020
 * FileName: HelloController
 * Author:   laosun
 * Date:     2020/3/19 11:29 上午
 * Description:
 */
package com.laosun.lucenedemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/index")
    public String hello(){
        return "hello";
    }
}
