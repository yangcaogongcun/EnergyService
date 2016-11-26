package com.stand.spring.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stand.spring.Mapper.AlarmsMapper;
import com.stand.spring.model.Alarms;

@Service
public class AlarmsService {

	@Autowired
	private AlarmsMapper alarmsMapper;
	
	public List<Alarms> queryAlarms(){
		List<Alarms> result=new ArrayList<>();
		result=alarmsMapper.selectAll();
		return result;
	}
	
}
