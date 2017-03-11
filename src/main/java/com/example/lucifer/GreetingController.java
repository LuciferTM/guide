package com.example.lucifer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by LuciferTM on 2017/3/7.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //@RequestMapping映射
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue = "Word")String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }
}
