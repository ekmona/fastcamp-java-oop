package com.mona.fastcamp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mona.fastcamp.logic.JavaSort;

public class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    void doSort() {
        // given
        
        // when
        List<String> out = sut.doSort(Arrays.asList("3", "1", "2")) ;

        // then
        assertEquals(Arrays.asList("1", "2", "3"), out);
    }
}
