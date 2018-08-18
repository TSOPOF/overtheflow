package com.overtheflow.dao;

import com.overtheflow.vo.MemberViewVO;

public interface MemberMapper {
	
	public void addMember(MemberViewVO vo) throws Exception;
	public void modifyMember(MemberViewVO vo) throws Exception;
	public void deleteMember(int memberNo) throws Exception;
	public Integer getMaxNo() throws Exception;
}
