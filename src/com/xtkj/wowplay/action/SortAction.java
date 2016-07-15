package com.xtkj.wowplay.action;


import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.xtkj.wowplay.dto.SortDTO;
import com.xtkj.wowplay.service.SortService;

/**
 * Created by Administrator on 2016/7/13 0013.
 */
public class SortAction extends BaseAction {

    private SortService sortService;


    //index.jsp首页分类信息展示
    public void getAll() throws IOException {
        List<SortDTO> sortList = sortService.getAllSortList();
        getSession().put("sortList", sortList);
        getResponse().getWriter().write(JSON.toJSONString(sortList));
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
