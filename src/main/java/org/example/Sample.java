package org.example;

import org.example.domain.SourceData;
import org.example.legacy.SourceDetails;
import org.example.mapper.SourceMapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by kirill.marchuk on 15.06.2021
 */
public class Sample {

    private final SourceMapper mapper = Mappers.getMapper(SourceMapper.class);
    public int someMath(int a, int b) {
        var c = a * b;
        var d = b - a;
        return c + d * a - b;
    }

    public SourceDetails convert(SourceData data) {
        return mapper.toDetails(data);
    }

    public SourceData unconvert(SourceDetails details) {
        return mapper.toData(details);
    }
}
