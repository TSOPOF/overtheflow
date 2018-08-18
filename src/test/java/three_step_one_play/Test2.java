package three_step_one_play;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.overtheflow.dao.FollowMapper;
import com.overtheflow.dao.MemberClassMapper;
import com.overtheflow.dao.MemberMapper;
import com.overtheflow.dao.MemberViewMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class Test2 {
	
	@Autowired
	private FollowMapper followMapper;
	
	@Autowired
	private MemberClassMapper memberClassMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private MemberViewMapper memberViewMapper;
	

	
	public void memberClassMapperTest() throws Exception {
		
		/*MemberClassVO vo1=new MemberClassVO(1,"시일버",3);
		MemberClassVO vo2=new MemberClassVO(2,"고올드",6);
		MemberClassVO vo3=new MemberClassVO(3,"다이아모온드",7);
		
		memberClassMapper.addMemberClass(vo1);
		memberClassMapper.addMemberClass(vo2);
		memberClassMapper.addMemberClass(vo3);*/

		
		/*memberClassMapper.deleteMemberClass(1);*/
		
		/*MemberClassVO vo4=new MemberClassVO(1,"금은동",4);
		MemberClassVO vo5=new MemberClassVO(2,null,5);
		
		memberClassMapper.modifyMemberClass(vo4);
		memberClassMapper.modifyMemberClass(vo5);*/
		
		/*List<MemberClassVO> list=memberClassMapper.getAll();
		for(MemberClassVO vo : list) {
			System.out.println(vo.toString());
		}*/
		
		/*MemberClassVO vo=memberClassMapper.getClass(2);
		System.out.println(vo.toString());
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("memberClassName", "금");
		List<MemberClassVO> list=memberClassMapper.getClasses(map);
		
		for(MemberClassVO v : list) {
			System.out.println(v.toString());
		}*/
		
		
	}
	
	
	public void memberMapperTest() throws Exception {

		/*MemberViewVO vo1=new MemberViewVO(1,1,"jiwoo1","빵야",
						"1997@naver.com","1111","김지우1","하이욧",
						null,null,null);
		MemberViewVO vo2=new MemberViewVO(2,1,"jiwoo2","지우개",
				"1998@naver.com","1111","김찌우","하이욧",
				null,null,null);
		MemberViewVO vo3=new MemberViewVO(3,3,"jiwoo3","빵ㅎㅎ",
				"1999@naver.com","1111","찐찡잉","하이욧",
				null,null,null);
		memberMapper.addMember(vo1);
		memberMapper.addMember(vo2);
		memberMapper.addMember(vo3);*/
		
		/*MemberViewVO vo4=new MemberViewVO(3,3,null,null,
				"2000@naver.com","1112",null,null,
				null,null,null);
		memberMapper.modifyMember(vo4);*/
		
		/*System.out.println(memberMapper.getMaxNo());*/
		
		/*memberMapper.deleteMember(2);*/
		
		
	}
	
	
	public void memberViewMapperTest() throws Exception {
		
		/*MemberViewVO vo1=memberViewMapper.getMember(2);
		System.out.println(vo1);*/
		/*List<MemberViewVO> list2=memberViewMapper.getAll();*/
		
		/*Map<String,Object> map=new HashMap<String,Object>();
		
		map.put("memberNickname","빵");
		map.put("memberEmail","1997@naver.com");
		
		List<MemberViewVO> list1=memberViewMapper.getMembers(map);
		for(MemberViewVO vo : list1) {
			System.out.println(vo.toString());
		}*/
		
	}
	
	@Test
	public void followMapperTest() throws Exception {
		
		/*Map<String,Object> map=new HashMap<String,Object>();
		map.put("followerNo", 2);
		map.put("followNo", 1);*/
		
		/*followMapper.addFollow(map);*/
		
		/*Integer isfollow=followMapper.getFollow(map);
		System.out.println(isfollow);*/
		
		/*Map<String,Object> map=new HashMap<String,Object>();
		map.put("followerNo", 2);
		map.put("columnName", "follow_no");
		List<Integer> list=followMapper.getfollows(map);
		//followerNo가2인 사람의 followNo찾기
		
		for(Integer i : list) {
			System.out.println(i);
		}*/
		
		/*followMapper.deleteFollow(map);*/
		
	}
	
}
