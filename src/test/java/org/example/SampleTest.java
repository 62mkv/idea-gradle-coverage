package org.example;

import org.example.domain.SourceData;
import org.example.legacy.SourceDetails;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    private final Sample sut = new Sample();

    @Test
    void testSomeCase() {
        assertEquals(1, sut.someMath(1, 2));
    }

    @Test
    void testMapping() {
        SourceData data = new SourceData();
        data.setDetails(Collections.singletonList("baba"));
        data.setId(1L);
        List<String> list = new ArrayList<>();
        list.add("baba");
        SourceDetails details = new SourceDetails(1, list);
        final SourceDetails actual = sut.convert(data);
        assertThat(actual).isEqualToComparingFieldByField(details);

        assertThat(sut.unconvert(actual)).isEqualToComparingFieldByField(data);
    }
}