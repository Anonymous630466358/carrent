package cn.pjzc.service.impl;

import cn.pjzc.dao.CommentsDao;
import cn.pjzc.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    CommentsDao commentsDao;
    @Override
    public List<Map<String, Object>> findAll() {
        return commentsDao.findAll();
    }
}
