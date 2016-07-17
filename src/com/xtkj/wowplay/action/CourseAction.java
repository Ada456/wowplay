package com.xtkj.wowplay.action;

import com.xtkj.wowplay.dto.TagDTO;
import com.xtkj.wowplay.entity.Course;
import com.xtkj.wowplay.entity.Sort;
import com.xtkj.wowplay.service.CourseService;
import com.xtkj.wowplay.service.SortService;
import com.xtkj.wowplay.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2016/7/14 0014.
 */
public class CourseAction extends BaseAction{

    @Autowired
    private TagService tagService;
    @Autowired
    private SortService sortService;
    @Autowired
    private CourseService courseService;

    private Sort sort;
    private List<TagDTO> tagList;
    private List<Sort> secSortList;//二级分类
    private List<Sort> firstSortList;
    private List<Course> courseList;
    private List<Course> hotList;//热门课程
    private List<Course> newList;//最新课程


    /**初始化课程页面标签和课程的显示*/
    public String initPage() throws IOException {
        String curFirstSortId = getRequest().getParameter("sortId");
        sort=new Sort();
        sort.setId(Integer.valueOf(curFirstSortId));
        sort = sortService.getSortById(sort);
        //一级分类对应的二级分类
        secSortList = sortService.querySecSort(sort);
        //一级分类对应的所有标签
        tagList=tagService.queryByFirstSort(sort);
        //一级分类对应的所有课程
        courseList = courseService.queryByFirstSort(sort);

        getSession().put("tagList",tagList);
        getSession().put("courseList",courseList);
        getSession().put("secSortList",secSortList);
        return "front_courses";
    }


    /**
     * 课程页面根据筛选条件，查询相应的课程和标签
     * @return
     */
    public String changeSelect(){
        String sortId = getRequest().getParameter("sortId");
        String tagId = getRequest().getParameter("tagId");
        return null;


    }


}
