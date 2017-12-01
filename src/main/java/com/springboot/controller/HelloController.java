package com.springboot.controller;

import com.springboot.model.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/say",method = RequestMethod.GET)
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value = "/hello/{id}")
    @GetMapping(value = "/{id}/hello")
    //public String say(@PathVariable("id") String id){
    //?id=12
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") String id){

        return  id;
       // return "index";
    }
}
