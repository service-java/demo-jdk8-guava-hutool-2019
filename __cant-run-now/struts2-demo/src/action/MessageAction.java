package action;
/**
 * Created by Luo_0412 on 2017/4/9.
 */

import com.opensymphony.xwork2.ActionSupport;

public class MessageAction extends ActionSupport {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String title = null;//标题
    private String content = null;//内容

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String execute(){
        return SUCCESS;
    }

}
