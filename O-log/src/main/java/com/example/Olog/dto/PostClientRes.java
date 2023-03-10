package com.example.Olog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostClientRes {
    private String title;
    private List<String> desc;
    private List<String> text;
    private String store;
    private String category;
    private List<String> img;
    private String city;
}
