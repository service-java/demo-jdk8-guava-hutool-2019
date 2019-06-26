package interceptor;

/**
 * Created by Luo_0412 on 2017/4/9.
 */
import action.MessageAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String intercept(ActionInvocation arg0) throws Exception {
        Object object = arg0.getAction();//取得Action的实例
        if (object != null) {
            if (object instanceof MessageAction) {
                MessageAction action = (MessageAction) object;
                String content = action.getContent();
                if (content.contains("administrator")) {
                    content = content.replaceAll("administrator", "系统管理员");
                }
                if (content.contains("admin")) {
                    content = content.replaceAll("admin", "管理员");
                }
                action.setContent(content);
                return arg0.invoke();
            } else {
                return Action.LOGIN;
            }
        } else {
            return Action.LOGIN;
        }
    }
}
