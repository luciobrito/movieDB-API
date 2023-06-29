package com.mvdb.movieDB.controller;

import com.mvdb.movieDB.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
//Controlador da API REST
@RestController
public class MovieController {
    @Autowired
    MovieRepository movieRepository;
    


}
