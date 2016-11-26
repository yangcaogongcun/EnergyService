package com.stand.spring.Mapper;

import java.util.List;
import java.util.Map;

import com.stand.spring.model.Tempdata;

import tk.mybatis.mapper.common.Mapper;

public interface TempdataMapper extends Mapper<Tempdata> {
	List<Tempdata> selectTest(Map<String, String> map);
}