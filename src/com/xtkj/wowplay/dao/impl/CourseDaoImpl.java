package com.xtkj.wowplay.dao.impl;

import com.xtkj.wowplay.dao.BaseDao;
import com.xtkj.wowplay.dao.CourseDao;
import com.xtkj.wowplay.entity.Course;
import com.xtkj.wowplay.entity.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *wuwei
 */
@Repository
public class CourseDaoImpl implements CourseDao {

    @Autowired
    private BaseDao baseDao;

    @Override
    public List<Course> queryByFirstSort(Sort sort) {
        return baseDao.findByHql("from Course c where c.sort.pid = "+sort.getId());
    }
}
