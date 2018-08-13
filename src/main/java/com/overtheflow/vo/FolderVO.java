package com.overtheflow.vo;

public class FolderVO {
	private int folderNo;
	private int superFolderNo;
	private int memberNo;
	private String folderName;
	public FolderVO() {
		super();
	}
	public FolderVO(int folderNo, int superFolderNo, int memberNo, String folderName) {
		super();
		this.folderNo = folderNo;
		this.superFolderNo = superFolderNo;
		this.memberNo = memberNo;
		this.folderName = folderName;
	}
	public int getFolderNo() {
		return folderNo;
	}
	public int getSuperFolderNo() {
		return superFolderNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderNo(int folderNo) {
		this.folderNo = folderNo;
	}
	public void setSuperFolderNo(int superFolderNo) {
		this.superFolderNo = superFolderNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	@Override
	public String toString() {
		return "FolderVO [folderNo=" + folderNo + ", superFolderNo=" + superFolderNo + ", memberNo=" + memberNo
				+ ", folderName=" + folderName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + folderNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FolderVO other = (FolderVO) obj;
		if (folderNo != other.folderNo)
			return false;
		return true;
	}
}
