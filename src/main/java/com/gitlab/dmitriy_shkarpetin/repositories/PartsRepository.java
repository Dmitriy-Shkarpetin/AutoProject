package com.gitlab.dmitriy_shkarpetin.repositories;

import com.gitlab.dmitriy_shkarpetin.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PartsRepository extends JpaRepository<Part, Integer> {
    List<Part> findAll();
}
