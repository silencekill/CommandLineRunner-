package org.javaboy.commandlinerunner.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Order(98)
public class MyCommandLineRunner2 implements CommandLineRunner {
    //在系统启动的时候会执行此方法
    @Override
    public void run(String... args) throws Exception {
        String s = Arrays.toString(args);
        System.out.println("系统启动执行2");
        System.out.println(s);
    }
}
