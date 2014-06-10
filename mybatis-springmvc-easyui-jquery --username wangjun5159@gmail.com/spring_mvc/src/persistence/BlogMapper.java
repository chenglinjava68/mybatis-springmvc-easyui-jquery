package persistence;

import java.util.List;

import domain.Blog;

public interface BlogMapper {

	Blog selectBlog(Long id);
	
	void saveBlog(String name);
	
	List<Blog> findAllBlog();
}
