package com.xtkj.wowplay.dao;

import com.xtkj.wowplay.entity.Sort;
import com.xtkj.wowplay.entity.Tag;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
public interface TagDao {

    /**
     * 通过一级分类查出标签集合
     */
    List<Tag> queryByFirstSort(Sort sort);
}
