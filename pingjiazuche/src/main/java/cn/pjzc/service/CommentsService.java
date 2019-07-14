package cn.pjzc.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface CommentsService {
    public List<Map<String,Object>> findAll();
}
