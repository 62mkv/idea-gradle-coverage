package org.example.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by kirill.marchuk on 15.06.2021
 */
@Data
public class SourceData {
    private Long id;
    private List<String> details;
}
