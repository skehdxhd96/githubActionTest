package com.example.githubaction.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestServiceTest {

    @Autowired
    TestService testService;

    @Test
    @DisplayName(value = "+1 테스트")
    void plusOneTest() {
        int two = testService.plusOneService(1);

        Assertions.assertThat(two).isEqualTo(2);
    }
}