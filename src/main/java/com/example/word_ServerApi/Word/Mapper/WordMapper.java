package com.example.word_ServerApi.Word.Mapper;

import com.example.word_ServerApi.Word.Model.WordResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordMapper {
    List<WordResponse> findAll(@Param("wordLevel") String wordLevel);
}
