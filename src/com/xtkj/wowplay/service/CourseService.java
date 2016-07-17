package com.xtkj.wowplay.service;

import com.xtkj.wowplay.dto.CourseDTO;
import com.xtkj.wowplay.entity.Course;
import com.xtkj.wowplay.entity.Sort;

import java.util.List;

/**
 * Created by Administrator on 2016/7/15 0015.
 */
public interface CourseService {


    /**根据sortId查找course集合*/
    List<Course> queryByFirstSort(Sort sort);
}
