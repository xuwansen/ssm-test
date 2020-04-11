package com.xit.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xit.Service.ClubService;
import com.xit.Service.UserService;
import com.xit.beans.Club;
import com.xit.beans.User;
import com.xit.utils.Constant;

/**
 * @author 许万森
 * @创建时间 2020年2月16日
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	ClubService clubService;
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public String login(@RequestParam("username")String username,@RequestParam("password")String password,HttpSession session){
		String address=null;
		User temp_user=new User();
		temp_user.setUserName(username);
		temp_user.setUserPassword(password);
		User user = userService.login(temp_user);
		switch(user.getPrivilege()) {
			case "管理员":
				address="redirect:/index_admin.jsp";
				break;
			case "社长" : 
				address="redirect:/index_president.jsp";
				Club club=clubService.getClubByUser(user.getUserId());
				session.setAttribute("club", club);
				break;
			case "学生" :
				address="redirect:/index_student.jsp";
				
				break;
			default:address="defeat";
		}
		session.setAttribute("user", user);
		return address;
	}	
	
	
	/**
	 * 用户注销
	 * @param session
	 * @return
	 */
	@RequestMapping("logout")
	public String loginout(HttpSession session) {
		if(session.getAttribute("user")!=null) {
			session.removeAttribute("user");
		}
		return "redirect:/index_student.jsp";
	}
	
	
	  @RequestMapping("enroll") 
	  public String enroll(@RequestParam("username")String username,
			  				@RequestParam("phone")String phone,
			  				@RequestParam("password")String password,
			  				@RequestParam("gender")String gender){
		  
		  User user=new User();
		  user.setUserName(username);
		  user.setPhone(phone);
		  user.setGender(gender);
		  user.setUserPassword(password);
		  user.setPrivilege("学生");
		  Boolean flag=false;
		  String address="";
		  flag=userService.addUser(user);
		  if(flag) {
			  address="success";
		  }else {
			  address="failure";
		  }
		  return address;
	  }
	 
	@RequestMapping("/getUsers")
	public String getUsers(Model model,
				@RequestParam(value = "pageNo", required = false, defaultValue = "1") Integer pageNo) {
			List<User> users = userService.getUsersByPage(pageNo, Constant.PAGESIZE);
			int totalSize = userService.CountUsers();
			int totalPage = totalSize % Constant.PAGESIZE == 0 ? totalSize / Constant.PAGESIZE
					: totalSize / Constant.PAGESIZE + 1;
			model.addAttribute("totalSize", totalSize);
			model.addAttribute("totalPage", totalPage);
			model.addAttribute("pageNo", pageNo);
			model.addAttribute("users", users);
			return "userlist";
		}
	
	  /**
		 * 社团分页跳转
		 * @param pageNo
		 * @param model
		 * @return
		 */
		@RequestMapping("/page")
		public String firstPage(@RequestParam("pageNo") int pageNo, Model model) {
			model.addAttribute("pageNo", pageNo);
			return "forward:/user/getUsers";
		}
}
