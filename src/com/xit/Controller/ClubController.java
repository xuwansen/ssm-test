package com.xit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xit.Service.ClubService;
import com.xit.beans.Club;
import com.xit.utils.Constant;

/**
 * @author 许万森
 * @创建时间 2020年2月16日
 *
 */
/**
 * @author 许万森
 * @创建时间 2020年2月19日
 *
 */
@Controller
@RequestMapping("/club")
public class ClubController {
	@Autowired
	ClubService clubService;

	
	/**
	 * 分页显示所有社团
	 * 
	 * @param model
	 * @param pageNo
	 * @return
	 */
	@RequestMapping("/getClubs")
	public String getClubs(Model model,
			@RequestParam(value = "pageNo", required = false, defaultValue = "1") Integer pageNo,
			@RequestParam(value ="privilege",required=false, defaultValue = "学生")String privilege) {
		List<Club> clubs = clubService.getClubsByPage(pageNo, Constant.PAGESIZE);
		int totalSize = clubService.CountClubs();
		int totalPage = totalSize % Constant.PAGESIZE == 0 ? totalSize / Constant.PAGESIZE
				: totalSize / Constant.PAGESIZE + 1;
		model.addAttribute("totalSize", totalSize);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("clubs", clubs);
		String address=null;
		switch(privilege) {
		case "学生":address="clublist";break;
		case "社长":address="clublist_president";break;
		case "管理员":address="clublist_admin";break;
		}
		return address;
	}

	/**
	 * 社团分页跳转
	 * 
	 * @param pageNo
	 * @param model
	 * @return
	 */
	@RequestMapping("/page")
	public String firstPage(@RequestParam("pageNo") int pageNo, Model model) {
		model.addAttribute("pageNo", pageNo);
		return "forward:/club/getClubs";
	}
	

	/**
	 * 查询社团
	 * @param clubName
	 * @param pageNo
	 * @param model
	 * @return
	 */
	@RequestMapping("/search")
	public String search(@RequestParam("clubName")String clubName,
					@RequestParam(value ="pageNo", required = false, defaultValue = "1")int pageNo,
					@RequestParam(value ="privilege")String privilege,
					Model model) {
		List<Club> clubs = clubService.getClubsByCondition(pageNo, Constant.PAGESIZE, clubName);
		int totalSize = clubService.CountClubsByCondition(clubName);
		int totalPage = totalSize % Constant.PAGESIZE == 0 ? totalSize / Constant.PAGESIZE:totalSize / Constant.PAGESIZE + 1;
		model.addAttribute("totalSize", totalSize);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("clubs", clubs);
		String address=null;
		switch(privilege) {
		case "学生":address="clublist";break;
		case "社长":address="clublist_president";break;
		case "管理员":address="clublist_admin";break;
		}
		return address;
	}
	
	@RequestMapping("/removeClub")
	public String removeClub(@RequestParam("clubId")Integer clubId) {
		clubService.removeClub(clubId);
		return "forward:/club/getClubs"; 
	}
	
	
	/*
	 * @RequestMapping("addClub") public String
	 * addClub(@RequestParam("clubName")String
	 * clubName,@RequestParam("userId")Integer
	 * userId,@RequestParam("clubInfo")String clubInfo) { Club club=new Club();
	 * club.setClubName(clubName); club.setClubOwner(userId); club.setCreateTime(new
	 * Date()); club.setClubInfo(clubInfo); clubService.addClub(club); return
	 * "success"; }
	 */

}
