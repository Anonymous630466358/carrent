package cn.pjzc.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface CommentsDao {
    @Select("select * from user")
    public List<Map<String,Object>> findAll();
}
