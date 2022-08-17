package com.example.truckapp.repositories;

import com.example.truckapp.model.LoadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LoadRepositories extends JpaRepository<LoadEntity, Long> {

    //    @Query(value = "SELECT * FROM loads  WHERE shipper_id='1'", nativeQuery = true)
    @Query(value = "SELECT * from loads load where load.id= :id", nativeQuery = true)
    Optional<LoadEntity> findLoadByLoadId(Long id);

    @Query(value = "SELECT * from loads load where load.shipper_id= :id", nativeQuery = true)
    Optional<List<LoadEntity>> findLoadByShipperId(String id);


}
