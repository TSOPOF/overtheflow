package com.overtheflow.test;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.overtheflow.mapper.PlaylistMapper;
import com.overtheflow.vo.PlaylistVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class TestDDL {
	@Inject
	private PlaylistMapper playlistMapper;
	
	@Test
	public void test() {
		try {
		PlaylistVO playlist = new PlaylistVO();
		playlist.setMemberNo(1);
		playlist.setPlaylistIntro("인트로");
		playlist.setPlaylistNo(1);
		playlist.setPlaylistRegDate(new Date());
		playlist.setPlaylistTitle("플리 제목");
		playlist.setPlaylistVisibility(0);
		
		this.playlistMapper.create(playlist);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
