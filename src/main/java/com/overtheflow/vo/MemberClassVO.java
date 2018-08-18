package com.overtheflow.vo;

public class MemberClassVO {

	private Integer memberClassNo;
	private String memberClassName;
	private Integer maxStorageSize;
	
	public MemberClassVO() {
		
	}

	public MemberClassVO(Integer memberClassNo, String memberClassName, Integer maxStorageSize) {
		super();
		this.memberClassNo = memberClassNo;
		this.memberClassName = memberClassName;
		this.maxStorageSize = maxStorageSize;
	}

	public Integer getMemberClassNo() {
		return memberClassNo;
	}

	public String getMemberClassName() {
		return memberClassName;
	}

	public Integer getMaxStorageSize() {
		return maxStorageSize;
	}

	public void setMemberClassNo(Integer memberClassNo) {
		this.memberClassNo = memberClassNo;
	}

	public void setMemberClassName(String memberClassName) {
		this.memberClassName = memberClassName;
	}

	public void setMaxStorageSize(Integer maxStorageSize) {
		this.maxStorageSize = maxStorageSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberClassNo == null) ? 0 : memberClassNo.hashCode());
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
		MemberClassVO other = (MemberClassVO) obj;
		if (memberClassNo == null) {
			if (other.memberClassNo != null)
				return false;
		} else if (!memberClassNo.equals(other.memberClassNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberClassVO [memberClassNo=" + memberClassNo + ", memberClassName=" + memberClassName
				+ ", maxStorageSize=" + maxStorageSize + "]";
	}
	
	
	
	
}
