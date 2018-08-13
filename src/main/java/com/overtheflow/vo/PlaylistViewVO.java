package com.overtheflow.vo;

import java.util.Date;

public class PlaylistViewVO {
	private int playlistNo;
	private int memberNo;
	private int playlistVisibility;
	private String playlistTitle;
	private String palylistIntro;
	private Date playlistRegDate;
	private int likePlaylistCnt;
	private int playlistRepostCnt;
	private String memberNickname;
	
	public int getPlaylistNo() {
		return playlistNo;
	}
	public void setPlaylistNo(int playlistNo) {
		this.playlistNo = playlistNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getPlaylistVisibility() {
		return playlistVisibility;
	}
	public void setPlaylistVisibility(int playlistVisibility) {
		this.playlistVisibility = playlistVisibility;
	}
	public String getPlaylistTitle() {
		return playlistTitle;
	}
	public void setPlaylistTitle(String playlistTitle) {
		this.playlistTitle = playlistTitle;
	}
	public String getPalylistIntro() {
		return palylistIntro;
	}
	public void setPalylistIntro(String palylistIntro) {
		this.palylistIntro = palylistIntro;
	}
	public Date getPlaylistRegDate() {
		return playlistRegDate;
	}
	public void setPlaylistRegDate(Date playlistRegDate) {
		this.playlistRegDate = playlistRegDate;
	}
	public int getLikePlaylistCnt() {
		return likePlaylistCnt;
	}
	public void setLikePlaylistCnt(int likePlaylistCnt) {
		this.likePlaylistCnt = likePlaylistCnt;
	}
	public int getPlaylistRepostCnt() {
		return playlistRepostCnt;
	}
	public void setPlaylistRepostCnt(int playlistRepostCnt) {
		this.playlistRepostCnt = playlistRepostCnt;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
}
