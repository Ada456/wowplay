package com.xtkj.wowplay.dao;

import com.xtkj.wowplay.entity.Sort;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12 0012.
 */

public interface SortDao {

    /**查询所有的一级类别*/
    List<Sort> queryFirstSort();
    /**查询所有的二级类别*/
    List<Sort> querySecSort(Sort sort);
    /**通过id查询*/
    Sort queryById(Sort sort);
}
