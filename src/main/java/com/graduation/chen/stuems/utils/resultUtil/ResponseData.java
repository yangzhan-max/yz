package com.graduation.chen.stuems.utils.resultUtil;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 统一返回的数据格式
 */
@Setter
@Getter
public class ResponseData<T> implements Serializable {
    //状态码
    private String code;
    //描述
    private String msg;
    //数据
    private T data;

    public ResponseData(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseData(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseData(ResponseDataEnum responseDataEnum) {
        this.code = responseDataEnum.getCode();
        this.msg = responseDataEnum.getDesc();
    }

    public ResponseData(ResponseDataEnum responseDataEnum, T data) {
        this.code = responseDataEnum.getCode();
        this.msg = responseDataEnum.getDesc();
        this.data = data;
    }

}
