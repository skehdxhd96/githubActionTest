package com.example.githubaction.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleTest {

    @Value("${myname}")
    String name;

    @Test
    public void test() {

        Assertions.assertThat(name).isEqualTo("NaDongMin");

    }
}
