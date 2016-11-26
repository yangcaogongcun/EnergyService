package com.stand.spring.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.stand.spring.Mapper.TempdataMapper;
import com.stand.spring.model.Tempdata;

public class InfoQueryService {

	@Autowired
	private TempdataMapper tempdataMapper;

	public List<Tempdata> query() {
		ApplicationContext ctx = null;
//		ctx = new ClassPathXmlApplicationContext("applicationContext-all.xml");
//		TempDataMapper tempDataMapper=(TempDataMapper) ctx.getBean("tempDataMapper");
//		SqlSession sqlSession = sqlSessionFactory.openSession();
		Map<String, String> map = new HashMap<>();
		map.put("tablename", "tempData200000000002");
		return tempdataMapper.selectTest(map);
	}
}
