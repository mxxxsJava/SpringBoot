package com.springboot.controller;

import com.springboot.model.Result;
        import com.springboot.respository.GirlRepository;
        import com.springboot.service.GirlService;
        import com.springboot.model.GirlProperties;
        import com.springboot.utils.ResultUtil;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.validation.BindingResult;
        import org.springframework.web.bind.annotation.*;

        import javax.validation.Valid;
        import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    @RequestMapping(value = "/girl")
    public List<GirlProperties> quaryAll(){
        System.out.println("三生三世");
        return girlRepository.findAll();
    }

    @RequestMapping(value = "/add",method=RequestMethod.GET)
    public Result<GirlProperties> add(@Valid GirlProperties girlProperties, BindingResult bindingResult){
        //验证
        if(bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        girlProperties.setCupSize(girlProperties.getCupSize());
        girlProperties.setAge(girlProperties.getAge());

        return ResultUtil.success();
    }

    @RequestMapping(value = "/two",method=RequestMethod.GET)
    public void two(){
        girlService.insertTwo();
    }

    @GetMapping(value = "getAge/{id}")
    private void getAge(@PathVariable("id") Integer id) throws Exception {
        girlService.getAge(id);
    }
}
