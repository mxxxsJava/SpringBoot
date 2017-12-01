package com.springboot.Exception;


import com.springboot.enums.ResultEnum;

/**
 * spring抛出的异常，只有RuntimeException支持回滚
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
