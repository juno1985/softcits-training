package org.softcits.mbg.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.softcits.mbg.mapper.MbgUserMapper;
import org.softcits.mbg.model.MbgUser;
import org.softcits.mbg.model.MbgUserExample;
import org.softcits.mbg.model.MbgUserExample.Criteria;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class MbgMybatisTest {
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testMbg() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File(".\\src\\main\\resources\\mbg.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);
	}
	
	@Test
	public void testMyBatis3Simple() throws IOException{
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try{
			MbgUserMapper mapper = openSession.getMapper(MbgUserMapper.class);
			List<MbgUser> list = mapper.selectByExample(null);
			for (MbgUser mu : list) {
				System.out.println(mu.getUserName());
			}
		}finally{
			openSession.close();
		}
	}
	
	@Test
	public void testMyBatis3() throws IOException{
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try{
			MbgUserMapper mapper = openSession.getMapper(MbgUserMapper.class);
			//xxxExample就是封装查询条件的
			//1、查询所有
			//List<MbgUsesr> users = mapper.selectByExample(null);
			//2、查询员工名字中有e字母的，和员工性别是1的
			//封装员工查询条件的example
			MbgUserExample example = new MbgUserExample();
			//创建一个Criteria，这个Criteria就是拼装查询条件
			//select id, last_name, email, gender, d_id from tbl_employee 
			//WHERE ( last_name like ? and gender = ? ) or email like "%e%"
			Criteria criteria = example.createCriteria();
			criteria.andUserNameLike("%e%");
			criteria.andGIdEqualTo(1);
			
			Criteria criteria2 = example.createCriteria();
			criteria2.andGIdIn(Arrays.asList(2,3));
			
			//拼接条件
			example.or(criteria2);
			
			List<MbgUser> list = mapper.selectByExample(example);
			for (MbgUser mu : list) {
				System.out.println(mu.getUserName() + " " + mu.getgId());
			}
			
		}finally{
			openSession.close();
		}
	}

	//测试分页插件
	@Test
	public void testPageHelp() throws IOException{
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try{
			MbgUserMapper mapper = openSession.getMapper(MbgUserMapper.class);
			MbgUserExample example = new MbgUserExample();
			
			PageHelper.startPage(2, 2);
			
			List<MbgUser> list = mapper.selectByExample(example);
			for (MbgUser mu : list) {
				System.out.println(mu.getUserName());
			}
			
			PageInfo<MbgUser> info = new PageInfo<>(list);
			System.out.println("当前页码："+info.getPageNum());
			System.out.println("总记录数："+info.getTotal());
			System.out.println("每页的记录数："+info.getPageSize());
			System.out.println("总页码："+info.getPages());
			System.out.println("是否第一页："+info.isIsFirstPage());

		}finally{
			openSession.close();
		}
	}
}
