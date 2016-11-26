package com.stand.spring.dao.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stand.spring.Mapper.AlarmsMapper;
import com.stand.spring.Mapper.TempdataMapper;
import com.stand.spring.model.Alarms;
import com.stand.spring.model.Tempdata;
import com.stand.spring.service.AlarmsService;

public class AlarmTest {

	private ApplicationContext ctx = null;
	private AlarmsMapper alarmsMapper;
	private AlarmsService alarmsService;
	
	private TempdataMapper tempdataMapper;
	
	
	{
		ctx = new ClassPathXmlApplicationContext("springMVC/config/applicationContext-all.xml");
		alarmsMapper = ctx.getBean(AlarmsMapper.class);
		tempdataMapper=ctx.getBean(TempdataMapper.class);
	}
	@Test
	public void test() {
		List<Alarms> list=alarmsMapper.selectAll();
		for(Alarms alarms:list){
			System.out.println(alarms.toString());
		}
	}
	
	@Test
	public void test2(){
		
		Map<String, String> map = new HashMap<>();
		map.put("tablename", "tempdata200000000001");
		List<Tempdata> list=tempdataMapper.selectTest(map);
		System.out.println(list.size());
		for(Tempdata tempdata:list){
			System.out.println(tempdata);
		}
		
		
	}

}
