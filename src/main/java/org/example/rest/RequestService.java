package org.example.rest;

import org.example.repository.MyEntity;
import org.example.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RequestService {

    @Autowired
    private MyRepository myRepository;

    @PostMapping("/user")
    public String storeValue(@RequestParam String value) {
        MyEntity entity = new MyEntity();
        entity.setValue(value);
        myRepository.save(entity);
        return "Value saved in database!";
    }
}
