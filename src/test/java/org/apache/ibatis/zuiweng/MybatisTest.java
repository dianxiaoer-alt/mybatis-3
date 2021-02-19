package org.apache.ibatis.zuiweng;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.zuiweng.mapper.BlogMapper;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;


public class MybatisTest {

  public static void main(String[] args) throws IOException {
    String resource = "resources/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    //配置加载
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    try (SqlSession session = sqlSessionFactory.openSession()) {
//      Map blog = (Map) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 21);
      BlogMapper mapper = session.getMapper(BlogMapper.class);
//      Map selectBlog = mapper.selectBlog(1,1);
//      System.out.println(selectBlog);
       Map selectBlogById = mapper.selectBlogById(1);
      System.out.println(selectBlogById);
    }

  }
}
