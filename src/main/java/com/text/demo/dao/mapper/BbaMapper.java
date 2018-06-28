package com.text.demo.dao.mapper;

import com.text.demo.dao.entity.BbaEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BbaMapper {

    List<BbaEntity> selectAll();
}
