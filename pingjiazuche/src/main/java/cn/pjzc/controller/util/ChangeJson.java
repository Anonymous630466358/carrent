package cn.pjzc.controller.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//把返回值转化成json格式
public class ChangeJson {
    public static void changeJson(HttpServletResponse response,String json){
        response.setHeader("Content-Type","text/html;charset=utf-8");
        PrintWriter writer=null;
        try {
            writer=response.getWriter();
            writer.print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.flush();
            writer.close();
        }
    }
}
