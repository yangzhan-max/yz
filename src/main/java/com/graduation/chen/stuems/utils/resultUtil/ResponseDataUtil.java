package com.graduation.chen.stuems.utils.resultUtil;

/**
 * 在此工具类注册状态
 */
public class ResponseDataUtil {

    //自定义状态
    public static <T> ResponseData buildState(String code, String msg) {

        return new ResponseData<T>(code, msg);
    }

    public static <T> ResponseData buildState(String code, String msg, T data) {
        return new ResponseData<T>(code, msg, data);
    }

    //验证成功
    public static <T> ResponseData validateSuccess(T data) {
        return new ResponseData<T>(ResponseDataEnum.VALIDATE_SUCCESS, data);
    }

    public static ResponseData validateSuccess() {
        return new ResponseData(ResponseDataEnum.VALIDATE_SUCCESS);
    }

    //验证失败
    public static <T> ResponseData validateFail(T data) {

        return new ResponseData<T>(ResponseDataEnum.VALIDATE_FAIL, data);
    }

    public static ResponseData validateFail() {

        return new ResponseData(ResponseDataEnum.VALIDATE_FAIL);
    }

    // 访问资源错误
    public static <T> ResponseData resourceVisitError(T data) {

        return new ResponseData<T>(ResponseDataEnum.RESOURCE_VISIT_ERROR, data);
    }

    public static ResponseData resourceVisitError() {

        return new ResponseData(ResponseDataEnum.RESOURCE_VISIT_ERROR);
    }

    //请求成功
    public static <T> ResponseData requestSuccess(T data) {
        return new ResponseData<T>(ResponseDataEnum.REQUEST_SUCCESS, data);
    }

    public static ResponseData requestSuccess() {

        return new ResponseData(ResponseDataEnum.REQUEST_SUCCESS);
    }

    //请求失败
    public static <T> ResponseData requestError(T data) {

        return new ResponseData<T>(ResponseDataEnum.REQUEST_ERROR, data);
    }

    public static ResponseData requestError() {

        return new ResponseData(ResponseDataEnum.REQUEST_ERROR);
    }
}
