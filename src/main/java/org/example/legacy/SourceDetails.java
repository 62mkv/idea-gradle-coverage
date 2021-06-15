package org.example.legacy;

import lombok.Data;

import java.util.List;

/**
 * Created by kirill.marchuk on 15.06.2021
 */
@Data
public class SourceDetails {
    private final int id;
    private final List<String> details;
}
