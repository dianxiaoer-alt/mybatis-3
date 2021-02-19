package org.apache.ibatis.zuiweng.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BlogMapper {

	Map selectBlog(@Param("id") Integer id,@Param("user_id")Integer user_id);


	@Select(value = { "select * from blogs where user_id = ${id}" })
	Map selectBlogById(Integer id);


	List selectBlogByUserId(Integer userId);

}
