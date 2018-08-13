package com.overtheflow.vo;

import java.util.Date;

public class PlaylistVO {
	private int playlistNo;
	private int memberNo;
	private int playlistVisibility;
	private String playlistTitle;
	private String playlistIntro;
	private Date playlistRegDate;
	
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
	public String getPlaylistIntro() {
		return playlistIntro;
	}
	public void setPlaylistIntro(String playlistIntro) {
		this.playlistIntro = playlistIntro;
	}
	public Date getPlaylistRegDate() {
		return playlistRegDate;
	}
	public void setPlaylistRegDate(Date playlistRegDate) {
		this.playlistRegDate = playlistRegDate;
	}
}
