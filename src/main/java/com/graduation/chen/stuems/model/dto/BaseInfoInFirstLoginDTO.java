package com.graduation.chen.stuems.model.dto;

/**
 * 基本信息领域模型
 */
public class BaseInfoInFirstLoginDTO {


    //密码
    private String password;
    //邮箱
    private String email;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BaseInfoInFirstLoginDTO{" +
                "password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
