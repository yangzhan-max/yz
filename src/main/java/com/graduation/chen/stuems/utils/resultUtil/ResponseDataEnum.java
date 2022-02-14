package com.graduation.chen.stuems.utils.resultUtil;

import lombok.Getter;

/**
 * 在枚举中添加状态
 */
@Getter
public enum ResponseDataEnum {

    //请求成功
    REQUEST_SUCCESS("001", "请求成功"),
    //请求错误
    REQUEST_ERROR("000", "请求失败"),
    //验证成功
    VALIDATE_SUCCESS("201", "验证成功"),
    //验证失败
    VALIDATE_FAIL("202", "验证失败"),
    //访问资源失败
    RESOURCE_VISIT_ERROR("403", "访问资源错误"),
    //没有找到资源
    RESOURCE_NOT_FOUND("404", "资源未找到");

    private String code;

    private String desc;

    ResponseDataEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
