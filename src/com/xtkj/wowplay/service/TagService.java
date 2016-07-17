package com.xtkj.wowplay.service;

import com.xtkj.wowplay.dto.TagDTO;
import com.xtkj.wowplay.entity.Sort;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12 0012.
 */
public interface TagService {

    /**
     * 根据一级标签取出取出tag表标签
     */
    List<TagDTO> queryByFirstSort(Sort sort);

}
