package com.graduation.chen.stuems.model.vo;

/**
 * 课程相关VO对象
 */
public class SelectCourseVO {
    //课程名称
    private String courseName;
    //课程地点
    private String coursePlace;
    //课程教师
    private String courseTeacher;
    //说明：这里两项属性需要进行转换vo对象
    //课程时间(星期)
    private String courseWeek;
    //课程节次
    private String courseSection;

    //课程周期
    private String courseCycle;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePlace() {
        return coursePlace;
    }

    public void setCoursePlace(String coursePlace) {
        this.coursePlace = coursePlace;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseWeek() {
        return courseWeek;
    }

    public void setCourseWeek(Integer courseWeek) {
        String courseWeekVO = "";
        switch (courseWeek) {
            case 1:
                courseWeekVO = "星期一";
                break;
            case 2:
                courseWeekVO = "星期二";
                break;
            case 3:
                courseWeekVO = "星期三";
                break;
            case 4:
                courseWeekVO = "星期四";
                break;
            case 5:
                courseWeekVO = "星期五";
                break;
            case 6:
                courseWeekVO = "星期六";
                break;
            case 7:
                courseWeekVO = "星期天";
                break;
            default:
                courseWeekVO = "";
        }

        this.courseWeek = courseWeekVO;
    }

    public String getCourseSection() {
        return courseSection;
    }

    public void setCourseSection(Integer courseSection) {
        String courseSectionVO = "";
        switch (courseSection) {
            case 1:
                courseSectionVO = "1-2节";
                break;
            case 2:
                courseSectionVO = "3-4节";
                break;
            case 3:
                courseSectionVO = "5-6节";
                break;
            case 4:
                courseSectionVO = "7-8节";
                break;
            case 5:
                courseSectionVO = "9-10节";
                break;
            case 6:
                courseSectionVO = "11-12节";
                break;
            case 7:
                courseSectionVO = "13-14节";
                break;
            case 8:
                courseSectionVO = "15-16节";
                break;
            default:
                courseSectionVO = "";
        }
        this.courseSection = courseSectionVO;
    }

    public String getCourseCycle() {
        return courseCycle;
    }

    public void setCourseCycle(String courseCycle) {
        this.courseCycle = courseCycle;
    }

    @Override
    public String toString() {
        return "SelectCourseVO{" +
                "courseName='" + courseName + '\'' +
                ", coursePlace='" + coursePlace + '\'' +
                ", courseTeacher='" + courseTeacher + '\'' +
                ", courseWeek='" + courseWeek + '\'' +
                ", courseSection=" + courseSection +
                ", courseCycle='" + courseCycle + '\'' +
                '}';
    }

}
