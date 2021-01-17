package com.frankshop.api.repository;

import com.frankshop.api.entity.BaseEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BaseRepository<K extends BaseEntity> extends MongoRepository<K, String> {

    
}
