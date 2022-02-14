package com.graduation.chen.stuems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StuemsApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(System.getProperty("user.dir"));

    }

//    @Test
//    public boolean robot(String command, int[][] obstacles, int x, int y) {
//        //原点坐标
//        int[] current = {0, 0};
//        //最终状态
//        boolean state = false;
//        //重复执行指令
//        tag:
//        for (; ; ) {
//            //解析指令
//            for (int i = 0; i < command.length(); i++) {
//                //判断是x轴移动还是y轴移动
//                if (command.charAt(i) == 'U') {
//                    current[1]++;
//                } else {
//                    current[0]++;
//                }
//                //判断是否会撞到障碍
//                for (int[] obstacle : obstacles) {
//                    if (current[0] == obstacle[0] && current[1] == obstacle[1]) {
//                        state = false;
//                        break tag;
//                    }
//                }
//                //判断是否到终点
//                if (current[0] == x && current[1] == y) {
//                    state = true;
//                    break tag;
//                }
//            }
//        }
//        return state;
//    }

//    @Autowired
//    private CourseService courseService;
//
//    @Test
//    public void QuerySelectCourseTest() {
//
//        SelectCourseQuery query = new SelectCourseQuery();
//        query.setStudentId("516300214204");
//        query.setCourseWeek("周四");
//        query.setCourseYear("2019");
//        query.setCourseTerm(1);
//
//        List<SelectCourseVO> voList = courseService.listAllByQueryInAllSelectCourse(query);
//
//        for (SelectCourseVO selectCourseVO:voList) {
//
//            System.out.println("测试结果为：--------");
//            System.out.println(selectCourseVO.toString());
//        }

}
