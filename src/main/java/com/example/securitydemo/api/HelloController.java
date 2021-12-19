/**
 * Desc    The controllers is part of security-demo
 * Author  wuchuheng <root@wuchuheng.com>
 * Blog    https://wuchuheng.com
 * DATE    2021/12/19
 * Listen  MIT
 */

package com.example.securitydemo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String firstPage() {
        return "Hello world";
    }

}
