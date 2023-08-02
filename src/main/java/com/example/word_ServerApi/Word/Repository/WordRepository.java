package com.example.word_ServerApi.Word.Repository;

import com.example.word_ServerApi.Word.Mapper.WordMapper;
import com.example.word_ServerApi.Word.Model.WordResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class WordRepository {
    @Autowired
    WordMapper wordmapper;

    public List<WordResponse> findAll(String wordLevel){
        log.info("wordLevel : " + wordLevel);
        return wordmapper.findAll(wordLevel);
    }
}
