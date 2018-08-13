package com.overtheflow.vo;

public class FeedTypeVO {
	private int feedTypeNo;
	private String labelName;
	public FeedTypeVO() {
		super();
	}
	public FeedTypeVO(int feedTypeNo, String labelName) {
		super();
		this.feedTypeNo = feedTypeNo;
		this.labelName = labelName;
	}
	public int getFeedTypeNo() {
		return feedTypeNo;
	}
	public String getLabelName() {
		return labelName;
	}
	public void setFeedTypeNo(int feedTypeNo) {
		this.feedTypeNo = feedTypeNo;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	@Override
	public String toString() {
		return "FeedTypeVO [feedTypeNo=" + feedTypeNo + ", labelName=" + labelName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + feedTypeNo;
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
		FeedTypeVO other = (FeedTypeVO) obj;
		if (feedTypeNo != other.feedTypeNo)
			return false;
		return true;
	}
}
