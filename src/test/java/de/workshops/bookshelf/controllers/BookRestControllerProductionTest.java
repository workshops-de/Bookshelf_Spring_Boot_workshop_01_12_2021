package de.workshops.bookshelf.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.EnabledIf;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class BookRestControllerProductionTest {

    @Value("${server.port}")
    private int actualServerPort;

    @Test
    @EnabledIf(expression = "#{environment['spring.profiles.active'] == 'prod'}", loadContext = true)
    void testServerPort() {
        assertEquals(8090, actualServerPort);
    }
}
