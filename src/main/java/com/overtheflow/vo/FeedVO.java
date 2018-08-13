package com.overtheflow.vo;

import java.util.Date;

public class FeedVO {
	private int feedNo;
	private int feedTypeNo;
	private int memberNo;
	private boolean checked;
	private Date date;
	public FeedVO() {
		super();
	}
	public FeedVO(int feedNo, int feedTypeNo, int memberNo, boolean checked, Date date) {
		super();
		this.feedNo = feedNo;
		this.feedTypeNo = feedTypeNo;
		this.memberNo = memberNo;
		this.checked = checked;
		this.date = date;
	}
	public int getFeedNo() {
		return feedNo;
	}
	public int getFeedTypeNo() {
		return feedTypeNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public boolean isChecked() {
		return checked;
	}
	public Date getDate() {
		return date;
	}
	public void setFeedNo(int feedNo) {
		this.feedNo = feedNo;
	}
	public void setFeedTypeNo(int feedTypeNo) {
		this.feedTypeNo = feedTypeNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "FeedVO [feedNo=" + feedNo + ", feedTypeNo=" + feedTypeNo + ", memberNo=" + memberNo + ", checked="
				+ checked + ", date=" + date + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + feedNo;
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
		FeedVO other = (FeedVO) obj;
		if (feedNo != other.feedNo)
			return false;
		return true;
	}
}
