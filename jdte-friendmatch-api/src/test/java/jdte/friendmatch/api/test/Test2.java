package jdte.friendmatch.api.test;

import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.SearchFriendsService;
import jdte.friendmatch.api.utils.MatchUtils;
import jdte.friendmatch.api.utils.ReadExcelData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
* @ClassName: TestExcelRead
* @Description: 测试excel读取工具类
* @author zhangmeng
* @date 2017年12月3日 下午3:21:32
* @version V1.0 
 */
public class Test2 {
	@Resource
	private SearchFriendsService searchFriendsService;
	private List<UserPO> userPOList = new ArrayList<>();
	private List<MatchResult> ansList = new ArrayList<>();
	@Test
	public void test() {
		UserPO mUser= new UserPO();
		//0.id
		mUser.setPhId(1);
		//1、姓名
		mUser.setPhName("asdasd");
		//2、性别
		mUser.setPhSex(1);
		//3、电话号码
		mUser.setPhTelphone("5445545");
		//4、工作地点
		mUser.setPhArea(1);
		//45入职时间
		mUser.setPhTimetag(1);
		//6、接受异性混住
		mUser.setPhDiffsex(2);
		//7、接受合租者有对象
		mUser.setPhSingle(2);
		mUser.setPhSameroom(1);
		//8、接受地铁15分钟内
		mUser.setPhSubway(1);
		//9、接受步行/骑行15分钟内
		mUser.setPhRide(1);
		//10、预期房租
		mUser.setPhPrice(3);
		//11、距离市区距离	
		mUser.setPhCenter(1);
		//12、岗位
		mUser.setPhStation(1);
		//13、喜欢宠物	
		mUser.setPhAnimal(2);
		//14、喜欢音乐	
		mUser.setPhMusic(4);
		//15、游戏爱好者	
		mUser.setPhGame(4);
		//16、桌游爱好者（狼人杀，三国杀等）	
		mUser.setPhTablegame(4);
		//17、是否喜爱旅游/摄影？	
		mUser.setPhTourism(3);
		//18、是否喜欢健身	
		mUser.setPhHealth(3);
		mUser.setPhFood(3);
		//19、喜欢安静	
		mUser.setPhQuiet(2);
		//20、个人技能（使用,隔开）	
		mUser.setPhSkill("dasdasd");
		//21、个人QQ/微信	
		mUser.setPhQQWechar("dasdasd");
		//22、是否公开自己的合租信息给18的其他京东小伙伴
		mUser.setPhOpen(1);
		System.out.println(userPOList.size());
		System.out.println(ansList.size());
     	userPOList = searchFriendsService.selectAllUser();
		ansList= MatchUtils.getFriend(mUser,userPOList);
		for (MatchResult mr:ansList) {
			System.out.println(mr.toString());
		}
	}
	
}
