package com.xit.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xit.Service.ApplicationService;
import com.xit.beans.Application;
import com.xit.utils.Constant;

@Controller
@RequestMapping("/application")
public class ApplicationController {
	@Autowired
	ApplicationService applicationService;

	@RequestMapping("/joinClub")
	public String joinClub(@RequestParam("clubId") int clubId, @RequestParam("userId") int userId,HttpSession session) {
		Application application = new Application();
		System.out.println(clubId);
		System.out.println(userId);
		application.setCategory("加入社团");
		application.setStatus("等待通知");
		application.setTargetClub(clubId);
		application.setApplicant(userId);
		application.setApplicationDate(new Date());
		applicationService.addApplication(application);
		/*
		 * List<Application> applications = applicationService.getApplications(userId);
		 * session.setAttribute("applications",applications);
		 */
		return "forward:/club/getClubs";
	}

	@RequestMapping("/getApplications")
	public String getClubs(Model model,
			@RequestParam(value = "pageNo", required = false, defaultValue = "1") Integer pageNo) throws ParseException {
		List<Application> applications = applicationService.getApplicationsByPage(pageNo, Constant.PAGESIZE);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		for(Application application:applications) {
			Date applicationDate = application.getApplicationDate();
			String date_str = sdf.format(applicationDate);
			application.setFormatDate(date_str);
		}
		int totalSize = applicationService.CountApplications();
		int totalPage = totalSize % Constant.PAGESIZE == 0 ? totalSize / Constant.PAGESIZE
				: totalSize / Constant.PAGESIZE + 1;
		model.addAttribute("totalSize", totalSize);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("applications", applications);
		return "applicationlist";
	}
	
	/**
	 * 撤销申请
	 * @param id
	 * @return
	 */
	@RequestMapping("/undo")
	public String undo(@RequestParam("id")Integer id) {
		applicationService.remove(id);
		return "redirect:/application/getApplications";
	}
	
	/**
	 * 请求列表分页跳转
	 * @param pageNo
	 * @param model
	 * @return
	 */
	@RequestMapping("/page")
	public String firstPage(@RequestParam("pageNo") int pageNo, Model model) {
		model.addAttribute("pageNo", pageNo);
		return "redirect:/application/getApplications";
	}

	@RequestMapping("/getApplicationsByClubId")
	public String getApplicationsByClubId(Model model,
			@RequestParam(value = "pageNo", required = false,defaultValue = "1") Integer pageNo,
			@RequestParam(value="clubId")Integer clubId) throws ParseException {
		List<Application> applications = applicationService.getApplicationsByClubAndPage(pageNo, Constant.PAGESIZE,clubId);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		for(Application application:applications) {
			Date applicationDate = application.getApplicationDate();
			String date_str = sdf.format(applicationDate);
			application.setFormatDate(date_str);
		}
		int totalSize = applicationService.CountApplicationsByClub(clubId);
		int totalPage = totalSize % Constant.PAGESIZE == 0 ? totalSize / Constant.PAGESIZE
				: totalSize / Constant.PAGESIZE + 1;
		model.addAttribute("totalSize", totalSize);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("applications", applications);
		return "applicationlist_president";
	}
	
	@RequestMapping(value="/audit",method = RequestMethod.PUT)
	public String audit(@RequestParam("id")Integer id,@RequestParam("status")String status) {
		applicationService.alterApplicationById(id,status);
		return "forward:/application/getApplicationsByClubId";
	}
	
	@RequestMapping("/createClub")
	public String createClub(@RequestParam("userId")Integer userId) {
		Application application = new Application();
		application.setApplicant(userId);
		application.setCategory("创建社团");
		application.setApplicationDate(new Date());
		application.setStatus("等待通知");
		applicationService.addApplicationByCreateClub(application);
		
		return "success";
	}
	
}
