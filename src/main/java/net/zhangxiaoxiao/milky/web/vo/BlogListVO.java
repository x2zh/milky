package net.zhangxiaoxiao.milky.web.vo;

import java.util.List;

public class BlogListVO {
    private String siteName;
    private List<String> postNameList;

    public BlogListVO(String siteName, List<String> postNameList) {
        this.siteName = siteName;
        this.postNameList = postNameList;
    }

    public String getSiteName() {
        return siteName;
    }

    public List<String> getPostNameList() {
        return postNameList;
    }
}
