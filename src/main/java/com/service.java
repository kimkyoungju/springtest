package com;

import com.Entity.MemberEntityTest;
import com.Entity.Repository;
import com.dto.Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {


    @Autowired
    private Repository repository;


    public int write(Dto dto){

        MemberEntityTest entityTest = repository.save(dto.toEntityTest());
        return entityTest.getPno();
    }
}
