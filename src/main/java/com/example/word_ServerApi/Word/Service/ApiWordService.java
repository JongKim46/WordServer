package com.example.word_ServerApi.Word.Service;

import com.example.word_ServerApi.Word.Model.WordResponse;
import com.example.word_ServerApi.Word.Repository.WordRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service

public class ApiWordService {
    @Autowired
    WordRepository wordRepository;

    public List<WordResponse> getWordSelect(String wordLevel) throws Exception{
        return wordRepository.findAll(wordLevel);
    }

}
