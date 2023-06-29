package com.mvdb.movieDB.repositories;

import com.mvdb.movieDB.models.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository

public interface MovieRepository extends JpaRepository<MovieModel, UUID> {

}
