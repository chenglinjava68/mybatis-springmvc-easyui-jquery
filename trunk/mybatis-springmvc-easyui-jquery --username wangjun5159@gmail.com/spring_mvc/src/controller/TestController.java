package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.User;

@Controller  
public class TestController {

	public TestController(){
		System.out.println("gou zao fangfa zhi xing");
	}
	
	/**
	 * 如果发生校验错误，就不会进入此方法
	 */
	@RequestMapping(value = "/pages/test/login.do",method = RequestMethod.POST)
	@ResponseBody
	public  User testLogin(@RequestParam(value="username")String username, 
			@RequestParam(value="email")String email)  {
		User u = new User();
		u.setEmail(email);
		u.setName(username);
		return u;
	}

}
