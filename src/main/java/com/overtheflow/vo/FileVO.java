package com.overtheflow.vo;

import java.util.Date;

public class FileVO {
	private int fileNo;
	private int folderNo;
	private int memberNo;
	private int file_size;
	private boolean important;
	private String name;
	private String extension;
	private Date uploadDate;
	public FileVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FileVO(int fileNo, int folderNo, int memberNo, int file_size, boolean important, String name,
			String extension, Date uploadDate) {
		super();
		this.fileNo = fileNo;
		this.folderNo = folderNo;
		this.memberNo = memberNo;
		this.file_size = file_size;
		this.important = important;
		this.name = name;
		this.extension = extension;
		this.uploadDate = uploadDate;
	}
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	public int getFolderNo() {
		return folderNo;
	}
	public void setFolderNo(int folderNo) {
		this.folderNo = folderNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getFile_size() {
		return file_size;
	}
	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}
	public boolean isImportant() {
		return important;
	}
	public void setImportant(boolean important) {
		this.important = important;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	@Override
	public String toString() {
		return "FileVO [fileNo=" + fileNo + ", folderNo=" + folderNo + ", memberNo=" + memberNo + ", file_size="
				+ file_size + ", important=" + important + ", name=" + name + ", extension=" + extension
				+ ", uploadDate=" + uploadDate + "]";
	}
	
	

}
