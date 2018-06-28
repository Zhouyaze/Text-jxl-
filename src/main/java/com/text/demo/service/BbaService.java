package com.text.demo.service;

import com.text.demo.dao.entity.BbaEntity;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface BbaService {

    List<BbaEntity> slectAll();

    boolean exportExcel(HttpServletResponse response);

}