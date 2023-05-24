package com.mona.fastcamp.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    
    @DisplayName("F:버블소트 - 입력된 리스트를 정렬한다")
    @Test
    void sort_failed() {
        List<Integer> input = Arrays.asList(3,2,1,5,4);

        BubbleSort<Integer> bubleSort = new BubbleSort<>();
        List<Integer> out = bubleSort.sort(input);

        assertNotEquals(Arrays.asList(1,2,3,4,1), out);
    }
    
    
    @DisplayName("S:버블소트 - 입력된 리스트를 정렬한다")
    @Test
    void sort() {
        List<Integer> input = Arrays.asList(3,2,1,5,4);

        BubbleSort<Integer> bubleSort = new BubbleSort<>();
        List<Integer> out = bubleSort.sort(input);

        assertEquals(Arrays.asList(1,2,3,4,5), out);
    }
    
}
