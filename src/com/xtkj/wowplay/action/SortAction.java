package com.xtkj.wowplay.action;


import java.util.List;

import javax.annotation.Resource;

import com.xtkj.wowplay.dto.SortDTO;
import com.xtkj.wowplay.entity.Course;
import com.xtkj.wowplay.entity.Sort;
import com.xtkj.wowplay.entity.Tag;
import com.xtkj.wowplay.service.SortService;

/**
 * Created by Administrator on 2016/7/13 0013.
 */
public class SortAction extends BaseAction {

    private SortService sortService;
    //交互参数
    private List<SortDTO> sortDTOList;
    private List<Sort> sortList;
    private List<Tag> tagList;
    private List<Sort> chdSort;//子类别
    private List<Sort> firstSortList;
    private List<Course> courseList;
    private List<Course> hotList;//热门课程
    private List<Course> newList;//最新课程

    //index.jsp首页分类信息显示
    public String getFirstSort(){
        sortList =sortService.getFirstSort();
        getSession().put("sortList", sortList);
        return "index";
    }



    /*getter setter*/
    public SortService getSortService() {
        return sortService;
    }

    @Resource(name = "sortService")
    public void setSortService(SortService sortService) {
        this.sortService = sortService;
    }
}
