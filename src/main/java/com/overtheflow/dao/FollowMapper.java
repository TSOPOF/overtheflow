package com.overtheflow.dao;

import java.util.List;
import java.util.Map;

public interface FollowMapper {
	
	public void addFollow(Map<String,Object> map) throws Exception;
	public void deleteFollow(Map<String,Object> map) throws Exception;
	public Integer getFollow(Map<String,Object> map) throws Exception;
	public List<Integer> getfollows(Map<String,Object> map) throws Exception;
	
}
