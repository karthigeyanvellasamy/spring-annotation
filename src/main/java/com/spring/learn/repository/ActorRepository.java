package com.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learn.domain.Actor;

import lombok.Data;
import lombok.NoArgsConstructor;


@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer>{
	
}
