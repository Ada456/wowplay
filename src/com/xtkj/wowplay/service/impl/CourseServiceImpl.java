package com.xtkj.wowplay.service.impl;

import com.xtkj.wowplay.dao.CourseDao;
import com.xtkj.wowplay.dto.CourseDTO;
import com.xtkj.wowplay.dto.SortDTO;
import com.xtkj.wowplay.entity.Course;
import com.xtkj.wowplay.entity.Sort;
import com.xtkj.wowplay.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/15 0015.
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;
    List<Course> courseList = new ArrayList<>();


    @Override
    public List<Course> queryByFirstSort(Sort sort) {
        courseList = courseDao.queryByFirstSort(sort);
        return courseList;
    }
}
