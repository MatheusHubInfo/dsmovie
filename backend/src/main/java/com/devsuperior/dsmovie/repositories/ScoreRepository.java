package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entites.Score;
import com.devsuperior.dsmovie.entites.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	

}