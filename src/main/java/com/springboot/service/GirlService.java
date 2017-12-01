package com.springboot.service;

import com.springboot.Exception.GirlException;
import com.springboot.enums.ResultEnum;
import com.springboot.respository.GirlRepository;
import com.springboot.model.GirlProperties;
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
@Transactional
    public void insertTwo(){
        GirlProperties girlProperties=new GirlProperties();
        girlProperties.setCupSize("a");
        girlRepository.save(girlProperties);

        GirlProperties girlProperties2=new GirlProperties();
        girlProperties2.setCupSize("ass");
        girlRepository.save(girlProperties2);
    }


    public void getAge(Integer id) throws Exception {
        GirlProperties girlProperties=girlRepository.findOne(id);
        Integer age=girlProperties.getAge();
        if(age<10){
                throw new GirlException( ResultEnum.PRIMARY_SCHLOOL);
        }else if(age>10&&age<16){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    //通过id查询
    public GirlProperties findOne(Integer id){
        return girlRepository.findOne(id);
    }
}
