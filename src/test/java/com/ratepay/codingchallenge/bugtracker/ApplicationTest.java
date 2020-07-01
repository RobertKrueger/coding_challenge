package com.ratepay.codingchallenge.bugtracker;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class ApplicationTest extends AbstractSpringBootTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void applicationContextStartsUp() {
        assertThat(applicationContext).isNotNull();
    }
}
