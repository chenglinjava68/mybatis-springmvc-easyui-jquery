package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.BlogManageService;
import domain.Blog;

@Controller
@RequestMapping(value = "/pages/blog/")
public class BlogController {

	@Autowired
	private BlogManageService blogManageService;
	
	
	/**
	 * 如果发生校验错误，就不会进入此方法
	 */
	@RequestMapping(value = "add.do",method = RequestMethod.POST)
	@ResponseBody
	public  List<Blog> saveBlog(@RequestParam(value="blogname")String name)  {
		System.out.println("saveBlog()执行");
		blogManageService.saveBlog(name);
		return blogManageService.findAllBlog();
		
	}

	/**
	 * 如果发生校验错误，就不会进入此方法
	 */
	@RequestMapping(value = "findAll.do",method = RequestMethod.GET)
	@ResponseBody
	public  List<Blog>  findAllBlog()  {
		System.out.println("saveBlog()执行");
		return blogManageService.findAllBlog();
		
	}

	
}
