package action;

/**
 * Created by Luo_0412 on 2017/4/9.
 */

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModelUserAction extends ActionSupport implements ModelDriven<User> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private User user = new User();
    public User getModel() {
        // TODO Auto-generated method stub
        return this.user;
    }

    @Override
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        return SUCCESS;
    }

}