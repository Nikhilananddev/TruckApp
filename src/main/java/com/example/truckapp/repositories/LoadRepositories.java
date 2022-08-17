package com.example.truckapp.repositories;

import com.example.truckapp.model.LoadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoadRepositories extends JpaRepository<LoadEntity, String> {
    public Optional<LoadEntity> findLoadById(String id);

}