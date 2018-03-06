package com.dgit.ex00;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.MemberVO;
import com.dgit.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	@Autowired
	private MemberDAO dao;
	
	//@Test
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	//@Test
	public void testInsert() throws Exception{
		MemberVO vo=new MemberVO();
		vo.setUserid("bjj");
		vo.setUserpw("123");
		vo.setUsername("배재진");
		vo.setEmail("aaa@aaa.com");
		vo.setRegdate(new Date());
		vo.setUpdatedate(new Date());
		
		dao.insertMember(vo);
	}
	
	//@Test
	public void testReadMember() throws Exception{
		MemberVO list= dao.readMember("bjj");
		System.out.println(list);
	}
	
	//@Test
	public void testReadWithPW() throws Exception{
		MemberVO list=dao.readWithPW("bjj", "123");
		System.out.println(list);
	}
	
	@Test
	public void testListAll() throws Exception{
		List<MemberVO> list=dao.listAll();
		for(MemberVO m: list){
			System.out.println(m);
		}		
	}
	
	//@Test
	public void testUpdate() throws Exception{
		System.out.println(dao.update("bjj", "123123"));
	}
	
	//@Test
	public void testDelete() throws Exception{
		System.out.println(dao.delete("bjj"));
	}
}
















