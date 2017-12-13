package com.leaf.mongodb;

import com.leaf.mongodb.bean.MongoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mongodb")
public class MongodbController {
    @Autowired
    MongoRepository<MongoData,String> mongoDataRepository ;
    @RequestMapping("/save")
    public String saveMongodb(@RequestBody MongoData data){
        mongoDataRepository.save(data);
//        mongoDataRepository.insert(data);
        return "hello,everything is ok!";
    }
    @RequestMapping("/find")
    public List<MongoData> findMongodb(){
        List<MongoData> rst =  mongoDataRepository.findAll();
        return rst;
    }
}
