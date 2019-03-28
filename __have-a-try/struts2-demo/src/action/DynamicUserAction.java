package action;

/**
 * Created by Luo_0412 on 2017/4/9.
 */
import com.opensymphony.xwork2.ActionSupport;

public class DynamicUserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    public String add(){ return "add"; }
    public String del(){ return "del"; }
    public String update(){ return "update"; }
    public String show(){ return "show"; }
}
