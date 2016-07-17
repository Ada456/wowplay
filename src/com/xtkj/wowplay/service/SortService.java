package com.xtkj.wowplay.service;

import com.xtkj.wowplay.dto.SortDTO;
import com.xtkj.wowplay.entity.Sort;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
public interface SortService {

    /**
     * 取出一级分类
     */
    List<Sort> getFirstSort();


    /**
     * 取出二级分类
     */
    List<Sort> querySecSort(Sort sort);


    /**
     * get方法
     */
    Sort getSortById(Sort sort);
}
