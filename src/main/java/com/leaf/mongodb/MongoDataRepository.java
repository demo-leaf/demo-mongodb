package com.leaf.mongodb;

import com.leaf.mongodb.bean.MongoData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface  MongoDataRepository extends MongoRepository<MongoData,String> {}
