package com.overtheflow.vo;

import java.util.Date;

public class MemberViewVO {
	
	private Integer memberNo;
	private Integer memberClassNo;
	private String memberId;
	private String memberNickname;
	private String memberEmail;
	private String memberPassword;
	private String memberName;
	private String memberIntro;
	private Date memberRegDate;
	private String memberClassName;
	private Integer maxStorageSize;
	
	public MemberViewVO() {
		
	}

	public MemberViewVO(Integer memberNo, Integer memberClassNo, String memberId, String memberNickname,
			String memberEmail, String memberPassword, String memberName, String memberIntro, Date memberRegDate,
			String memberClassName, Integer maxStorageSize) {
		super();
		this.memberNo = memberNo;
		this.memberClassNo = memberClassNo;
		this.memberId = memberId;
		this.memberNickname = memberNickname;
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberIntro = memberIntro;
		this.memberRegDate = memberRegDate;
		this.memberClassName = memberClassName;
		this.maxStorageSize = maxStorageSize;
	}



	public Integer getMemberNo() {
		return memberNo;
	}

	public Integer getMemberClassNo() {
		return memberClassNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberIntro() {
		return memberIntro;
	}

	public Date getMemberRegDate() {
		return memberRegDate;
	}

	public String getMemberClassName() {
		return memberClassName;
	}

	public Integer getMaxStorageSize() {
		return maxStorageSize;
	}

	public void setMemberNo(Integer memberNo) {
		this.memberNo = memberNo;
	}

	public void setMemberClassNo(Integer memberClassNo) {
		this.memberClassNo = memberClassNo;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberIntro(String memberIntro) {
		this.memberIntro = memberIntro;
	}

	public void setMemberRegDate(Date memberRegDate) {
		this.memberRegDate = memberRegDate;
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
		result = prime * result + ((memberNo == null) ? 0 : memberNo.hashCode());
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
		MemberViewVO other = (MemberViewVO) obj;
		if (memberNo == null) {
			if (other.memberNo != null)
				return false;
		} else if (!memberNo.equals(other.memberNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberViewVO [memberNo=" + memberNo + ", memberClassNo=" + memberClassNo + ", memberId=" + memberId
				+ ", memberNickname=" + memberNickname + ", memberEmail=" + memberEmail + ", memberPassword="
				+ memberPassword + ", memberName=" + memberName + ", memberIntro=" + memberIntro + ", memberRegDate="
				+ memberRegDate + ", memberClassName=" + memberClassName + ", maxStorageSize=" + maxStorageSize + "]";
	}
	
	
	
	
}
