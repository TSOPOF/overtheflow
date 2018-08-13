package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.FolderVO;

public interface FolderMapper {
	public FolderVO addFolder(int folderNo);
	public void modifyFolder(FolderVO folder);
	public FolderVO getFolderByNo(int folderNo);
	public List<FolderVO> getAll();
	public List<FolderVO> getFolders(Map<String, Object> conditions);
	public int getMaxNo();
	public void deleteFolder(int folderNo);
}
