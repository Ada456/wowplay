package com.xtkj.wowplay.service.impl;

import com.xtkj.wowplay.dao.SortDao;
import com.xtkj.wowplay.entity.Sort;
import com.xtkj.wowplay.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
@Service("sortService")
public class SortServiceImpl implements SortService {


    @Autowired
    private SortDao sortDao;

    @Override
    public  List<Sort> getFirstSort() {
        List<Sort> sortList = sortDao.queryFirstSort();
        return  sortList;
    }

    @Override
    public List<Sort> querySecSort(Sort sort) {
        return sortDao.querySecSort(sort);
    }

    @Override
    public Sort getSortById(Sort sort) {
        return sortDao.queryById(sort);
    }


}
