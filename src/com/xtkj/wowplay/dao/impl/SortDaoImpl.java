package com.xtkj.wowplay.dao.impl;

import com.xtkj.wowplay.dao.BaseDao;
import com.xtkj.wowplay.dao.SortDao;
import com.xtkj.wowplay.entity.Sort;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
@Repository("sortDao")
public class SortDaoImpl implements SortDao {


    @Override
    public List<Sort> queryFirstSort() {
        return baseDao.findByHql("from Sort s where s.pid =0");
    }

    @Override
    public List<Sort> querySecSort(Sort sort) {
        return baseDao.findByHql("from Sort s where s.pid ="+sort.getId());
    }

    @Override
    public Sort queryById(Sort sort) {
        return (Sort) baseDao.querySession().get(Sort.class, sort.getId());
    }


    private BaseDao baseDao;

    public BaseDao getBaseDao() {
        return baseDao;
    }

    @Resource(name="baseDao")
    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }
}
