package com.text.demo.service.impl;

import com.text.demo.dao.entity.BbaEntity;
import com.text.demo.dao.mapper.BbaMapper;
import com.text.demo.service.BbaService;
import com.text.demo.tools.Constants;
import com.text.demo.tools.ConvertDate;
import com.text.demo.tools.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class BbaServiceImpl implements BbaService {

    @Autowired
    BbaMapper mapper;

    @Override
    public List<BbaEntity> slectAll() {
        return mapper.selectAll();
    }


    @Override
    public boolean exportExcel(HttpServletResponse response) {
        List<BbaEntity>ls=mapper.selectAll();
        List<String[]>strings=  convertList(ls);
        try {
            ExportExcel.exportData(response,Constants.DATE_FORMAT_HOUR_MINUTE,Constants.EXCEL_FILE_NAME, Constants.STUDENT_TITLE_NAME,strings);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    /**
     * 转换类型
     * @param studentEntityList 要转换的类型
     * @return 转换后的类型
     */
    private List<String[]> convertList(List<BbaEntity> studentEntityList){
        List<String[]> list = null;
        if(null != studentEntityList && studentEntityList.size() > 0){
            list = new ArrayList<>();
            for(BbaEntity studentEntity : studentEntityList){
                String[] strings = new String[]
                        {studentEntity.getName(),studentEntity.getAge()
                        , ConvertDate.convertDate(studentEntity.getTime(),ConvertDate.DATE_HOUR)
                        ,studentEntity.getBan()};
                list.add(strings);
            }
        }
        return list;
    }

}
