package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import persistence.BlogMapper;
import domain.Blog;


@Service
public class BlogManageService {

	@Autowired
	private BlogMapper blogMapper;
	
	
	@Transactional
	public void saveBlog(String name){
		blogMapper.saveBlog(name);
	}
	
	
	public List<Blog> findAllBlog(){
		return blogMapper.findAllBlog();
	}
	
	
	
	
}
