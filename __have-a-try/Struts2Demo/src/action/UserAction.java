package action;

/**
 * Created by Luo_0412 on 2017/4/9.
 */

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String userName = null;  // 用户名
    private String pass = null;      // 密码
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String execute(){
        return SUCCESS;
    }

}