package net.zhangxiaoxiao.milky.web.controller;

import net.zhangxiaoxiao.milky.web.vo.BlogListVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BlogController {

    @GetMapping("/api/blog-list")
    public BlogListVO getBlogList(@RequestParam("username") String username) {
        System.out.println("coming");
        List<String> blogList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            blogList.add("demo post name, test" + i);
        }
        BlogListVO blogListVO = new BlogListVO("milky home\t" + username, blogList);
        return blogListVO;
    }

}
