package com.example.h2demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class H2DemoApplicationTests {

    @Autowired
    DemoLogic demoLogic;

    @Test
    void test() {
        demoLogic.demoCall();
    }

}
