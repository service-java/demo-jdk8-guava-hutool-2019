package _ch2_hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;
import org.junit.Test;

import java.util.List;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-07-08
 * Time: 17:13
 */
public class HttpUtilDemo {

    @Test
    public void h() {
        //请求列表页
        String listContent = HttpUtil.get("https://www.oschina.net/action/ajax/get_more_news_list?newsType=&p=2");

        //使用正则获取所有标题
        List<String> titles = ReUtil.findAll("<span class=\"text-ellipsis\">(.*?)</span>", listContent, 1);
        for (String title : titles) {
            //打印标题
            Console.log(title);
        }
    }
}
