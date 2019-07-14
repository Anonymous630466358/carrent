package cn.pjzc.controller;

import cn.pjzc.controller.util.ChangeJson;
import cn.pjzc.pojo.Comments;
import cn.pjzc.service.CommentsService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/comments")
@CrossOrigin
public class CommentsController {
    @Autowired
    CommentsService commentsService;
    //查询所有
    @RequestMapping("/findAll")
    public void findAll(HttpServletRequest request, HttpServletResponse response){
        List<Map<String,Object>> all=commentsService.findAll();
        String s= JSON.toJSONString(all,true);
        ChangeJson.changeJson(response,s);
    }
}
