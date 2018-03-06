package com.dgit.persistence;

import java.util.List;

import com.dgit.domain.MemberVO;

public interface MemberDAO {
	public String getTime() throws Exception;
	public void insertMember(MemberVO vo) throws Exception;
	public MemberVO readMember(String userid) throws Exception;
	public MemberVO readWithPW(String userid, String userpw) throws Exception;
	public List<MemberVO> listAll() throws Exception;
	public int update(String userid, String userpw) throws Exception;
	public int delete(String userid) throws Exception;
}
