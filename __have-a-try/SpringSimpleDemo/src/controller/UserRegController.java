package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import model.User;
import validator.UserValidator;

public class UserRegController extends AbstractWizardFormController {

    // 取消后转向的视图
    private String cancelView;

    // 最终处理成功转向的页面
    private String succeseView;

    public String getCancelView() {
        return cancelView;
    }

    public void setCancelView(String cancelView) {
        this.cancelView = cancelView;
    }

    public String getSucceseView() {
        return succeseView;
    }

    public void setSucceseView(String succeseView) {
        this.succeseView = succeseView;
    }

    @Override
    protected ModelAndView processFinish(HttpServletRequest arg0,
                                         HttpServletResponse arg1, Object arg2, BindException arg3)
            throws Exception {
        User fullUser = (User) arg2;

        return new ModelAndView(succeseView,"user",fullUser);
    }

    @Override
    protected ModelAndView processCancel(HttpServletRequest request,
                                         HttpServletResponse response, Object command, BindException errors)
            throws Exception {

        return new ModelAndView(cancelView);
    }

    @Override
    protected void validatePage(Object command, Errors errors, int page) {
        UserValidator validator = (UserValidator) getValidator();
        if (page == 0) {
            validator.validateuserName("userName", errors);
            validator.validatepassWord("password", errors);
            validator.validatepass("pass", errors);
            validator.validatepassEquals("password","pass", errors);
            validator.validatemail("mail", errors);
        }else if(page == 1){
            validator.validateAddress("address", errors);
            validator.validateTel("tel", errors);
        }
    }

}
