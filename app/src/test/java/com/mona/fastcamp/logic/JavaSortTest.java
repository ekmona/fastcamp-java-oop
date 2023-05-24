package com.mona.fastcamp.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JavaSortTest {
    @DisplayName("자바소트 - 입력된 리스트를 정렬한다")
    @Test
    void sort() {
        List<Integer> input = Arrays.asList(3,2,1,5,4);

        JavaSort<Integer> javaSort = new JavaSort<>();
        List<Integer> out = javaSort.sort(input);

        assertEquals(Arrays.asList(1,2,3,4,5), out);
    }
}
