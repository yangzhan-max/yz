package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.entity.TeachProgramInfo;
import com.graduation.chen.stuems.service.SignInfoShowService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/view")
public class teachingProgramController {

    @Autowired
    private SignInfoShowService signInfoShowService;

    @PostMapping(value = "/insert-teach-program")
    public ResponseData insertInTeachProgram(@RequestBody TeachProgramInfo teachProgramInfo) {
        return signInfoShowService.insertInTeachProgram(teachProgramInfo) == 1
                ? ResponseDataUtil.requestSuccess("报名成功！")
                : ResponseDataUtil.requestError("报名失败请重试！");

    }

    @GetMapping(value = "/show-teach-program")
    public ResponseData ListInTeachProgram(HttpSession session) {

        //从session中获取用户名
        String id = (String) session.getAttribute("session_user");
        return ResponseDataUtil.requestSuccess(signInfoShowService.listAllInTeachProgram(id));
    }
}
