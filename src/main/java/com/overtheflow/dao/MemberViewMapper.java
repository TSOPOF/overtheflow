package com.overtheflow.dao;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.MemberViewVO;

public interface MemberViewMapper {
	
	public MemberViewVO getMember(int memberNo) throws Exception;
	public List<MemberViewVO> getMembers(Map<String,Object> map) throws Exception;
	public List<MemberViewVO> getAll() throws Exception;
	

}
