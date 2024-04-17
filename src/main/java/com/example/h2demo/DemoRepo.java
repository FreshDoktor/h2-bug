package com.example.h2demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoRepo extends CrudRepository<DemoEntity, Long> {

    public List<DemoEntity> findByNameContaining(String name);

}
