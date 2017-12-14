package jdte.friendmatch.api.controller;

import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.ExcelDataService;
import jdte.friendmatch.api.service.SearchFriendsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
* @ClassName: SearchFriendsController
* @Description: 根据姓名查询数据Controller
* @author weizhirong
* @date 2017年12月6日 上午10:05:59
* @version V1.0 
 */
@Controller
@RequestMapping("/search")
public class SearchFriendsController {
	/**
	 * 
	* @ClassName: SearchFriendService
	* @Description:根据手机号查询数据
	* @author weizhirong
	* @date 2017年12月6日 上午10:05:59
	* @version V1.0 
	 * @throws IOException 
	 */
	@Autowired
	private SearchFriendsService searchFriendsService;

	@Autowired
	private ExcelDataService excelDataService;

	private static final Logger logger = LoggerFactory.getLogger(SearchFriendsController.class);

	/**
	 * 搜索匹配
	 * @param telphone
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/searchfriends", method = RequestMethod.GET)
    @ResponseBody
	public List<MatchResult> searchFriend(@RequestParam(value="telphone") String telphone)
			throws IOException {
		List<MatchResult> ansList = new ArrayList<MatchResult>();
		try {
			Integer idIndex = excelDataService.getMaxId();
			//上线前修改此处
			excelDataService.setUserData("C://aaa.xls",	6,idIndex);
			ansList= searchFriendsService.SearchFriendsData(telphone);
		} catch (Exception e) {
			logger.error("匹配出错, 错误信息为: {}", e.toString());
		}
		return ansList;
	}
	
}
