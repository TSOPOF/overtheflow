package com.overtheflow.dao;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.MemberClassVO;

public interface MemberClassMapper {
	
	public void addMemberClass(MemberClassVO vo) throws Exception;
	public void modifyMemberClass(MemberClassVO vo) throws Exception;
	public void deleteMemberClass(int memberClassNo) throws Exception;
	public MemberClassVO getClass(int memberClassNo) throws Exception;
	public List<MemberClassVO> getClasses(Map<String,Object> map) throws Exception;
	public List<MemberClassVO> getAll() throws Exception;
	public int getMaxNo() throws Exception;

}
