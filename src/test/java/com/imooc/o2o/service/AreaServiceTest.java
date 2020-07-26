package com.imooc.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.catalina.webresources.Cache;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;

public class AreaServiceTest extends BaseTest{
	@Autowired
	private AreaService areaService;
	@Autowired
	private CacheService cacheService;
	
	@Test
	public void testgetAreaList() {
		List<Area> arealist = areaService.getAreaList();
		assertEquals("East", arealist.get(0).getAreaName());
		cacheService.removeFromCache(areaService.AREALISTKEY);
		arealist = areaService.getAreaList();
	}

}
