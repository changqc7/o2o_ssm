package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.HeadLine;

public class HeadlineDaoTest extends BaseTest{
	
	@Autowired
	private HeadlineDao headlineDao;
	
	@Test
	public void testQueryArea() {
		List<HeadLine> headLineList = headlineDao.queryHeadLine(new HeadLine());
		assertEquals(1, headLineList.size());
	}

}
