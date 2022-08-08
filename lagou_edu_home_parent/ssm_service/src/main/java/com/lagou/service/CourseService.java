package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;

import java.util.List;

public interface CourseService {
    /**
     * 多条件查询课程列表
     * */
    public List<Course> findCourseByConditioin(CourseVO courseVO);

    /**
     * 保存课程信息
     * */
    public void saveCourseOrTeacher(CourseVO courseVO);

    /**
     * 根据id获取课程信息
     * */
    public CourseVO findCourseById(int id);

    /**
     * 修改课程信息
     * */
    public void updateCourseOrTeacher(CourseVO courseVO);

    /**
     * 修改课程状态
     * */
    public void updateCourseStatus(int id,int status);
}
