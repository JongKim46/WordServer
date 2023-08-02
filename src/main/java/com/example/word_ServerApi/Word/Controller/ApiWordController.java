package com.example.word_ServerApi.Word.Controller;

import com.example.word_ServerApi.Word.Model.WordResponse;
import com.example.word_ServerApi.Word.Service.ApiWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wordAPI")
public class ApiWordController {

    @Autowired
    ApiWordService apiWordService;

    @GetMapping("/word")
    public List<WordResponse> getWordSelect(@RequestParam String wordLevel) throws Exception{
        List<WordResponse> wordResponse = apiWordService.getWordSelect(wordLevel);
        return wordResponse;
    }

}
