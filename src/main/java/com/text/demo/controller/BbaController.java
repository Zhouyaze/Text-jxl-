package com.text.demo.controller;

import com.text.demo.dao.entity.BbaEntity;
import com.text.demo.service.BbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class BbaController {

    @Autowired
    BbaService bbaService;

    @RequestMapping("/selectAll")
    public List<BbaEntity> select(){
        return bbaService.slectAll();
    }

    @RequestMapping("/excel")
    public String getExcel(HttpServletResponse response){
        boolean resoult=bbaService.exportExcel(response);
        if (resoult){
            return "生成成功";
        }
        return "狗浩宇";
    }
}
