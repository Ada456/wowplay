package com.xtkj.wowplay.dao;

import com.xtkj.wowplay.entity.Course;
import com.xtkj.wowplay.entity.Sort;

import java.util.List;

/**
 * courseDao
 * wuwei
 */
public interface CourseDao {


    /**通过一级分类查找课程*/
    List<Course> queryByFirstSort(Sort sort);
}
