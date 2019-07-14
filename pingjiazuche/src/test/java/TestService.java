import cn.pjzc.service.CommentsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationMapper.xml")
public class TestService {
    @Autowired
    CommentsService commentsService;
    @Test
    public void test(){
        List<Map<String,Object>> list=commentsService.findAll();
        for(Map<String,Object> map:list){
            System.out.println(map);
        }
    }
}
