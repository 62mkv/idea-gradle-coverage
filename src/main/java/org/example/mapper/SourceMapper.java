package org.example.mapper;

import org.example.domain.SourceData;
import org.example.legacy.SourceDetails;
import org.mapstruct.Mapper;

@Mapper
public interface SourceMapper {
    SourceDetails toDetails(SourceData data);
    SourceData toData(SourceDetails source);
}
