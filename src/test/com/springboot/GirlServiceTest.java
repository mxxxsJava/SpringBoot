package com.springboot;

import com.springboot.model.GirlProperties;
import com.springboot.service.GirlService;
import org.aspectj.lang.annotation.AfterReturning;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest//启动整个spring工程
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;

    @Test
    public void main() throws Exception {
        GirlProperties girlProperties=girlService.findOne(73);
        Assert.assertEquals(new Integer(13),girlProperties.getAge());
    }

}