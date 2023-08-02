package com.example.word_ServerApi.Word.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WordResponse {
    private int word_id;
    private String word_kanji;
    private String word_hurigana;
    private String word_hurigana_test1;
    private String word_hurigana_test2;
}
