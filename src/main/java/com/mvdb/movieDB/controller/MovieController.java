package com.mvdb.movieDB.controller;

import com.mvdb.movieDB.dtos.MovieRecordDto;
import com.mvdb.movieDB.repositories.MovieRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mvdb.movieDB.models.MovieModel;
import java.util.List;
//Controlador da API REST
@RestController
public class MovieController {
    @Autowired
    MovieRepository movieRepository;

    @PostMapping("/movies")
    public ResponseEntity<MovieModel> saveMovie(@RequestBody @Valid MovieRecordDto movieRecordDto){
        var movieModel = new MovieModel();
        BeanUtils.copyProperties(movieRecordDto, movieModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(movieRepository.save(movieModel));
    }
    @GetMapping("/movies")
    public ResponseEntity<List<MovieModel>> getAllMovies(){
        return ResponseEntity.status(HttpStatus.OK).body(movieRepository.findAll());
    }

}
