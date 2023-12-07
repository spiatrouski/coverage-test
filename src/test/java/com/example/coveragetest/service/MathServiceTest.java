package com.example.coveragetest.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.coveragetest.service.MathService;

@ExtendWith(MockitoExtension.class)
class MathServiceTest {

    @InjectMocks
    private MathService mathService;

    @Test
    void sub() {
        assertThat(mathService.sub(4, 3)).isEqualTo(1);
    }

}
