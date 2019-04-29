package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import model.User;

public class UserValidator implements Validator {

    public boolean supports(Class<?> arg0) {
        // TODO Auto-generated method stub
        return arg0.equals(User.class);
    }

    public void validate(Object arg0, Errors arg1) {
    }

    public void validateuserName(String userNameField, Errors errors){//验证用户名
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, userNameField, null,"用户名不能为空");
    }
    public void validatepassWord(String passwordField, Errors errors){//验证密码
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, passwordField, null,"密码不能为空");
    }
    public void validatepass(String passField, Errors errors){//验证确认密码
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, passField, null,"确认密码不能为空");
    }
    public void validatepassEquals(String passwordField,String passField, Errors errors){//验证密码是否一致
        String passWord = errors.getFieldValue(passwordField).toString().trim();
        String pass = errors.getFieldValue(passField).toString().trim();
        if (!passWord.equals("")&&!pass.equals("")){
            if(!pass.equals(passWord)){
                errors.rejectValue(passField, null, "两次密码输入不一致");
            }
        }
    }
    public void validatemail(String mailField, Errors errors){//验证邮箱是否合法
        if (!errors.getFieldValue(mailField).toString().trim().equals("")) {
            String email = (String) errors.getFieldValue("mail");
            boolean flag = false;
            String check  = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
            if (!flag) {
                errors.rejectValue(mailField, null, "Email格式不正确");
            }
        } else {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, mailField, null,"Email不能为空");
        }
    }

    public void validateTel(String telField, Errors errors){//验证手机号码
        if (!errors.getFieldValue(telField).toString().trim().equals("")) {
            String mobile = (String)errors.getFieldValue(telField);
            Pattern regex = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
            Matcher matcher = regex.matcher(mobile);
            if(!matcher.matches()){
                errors.rejectValue(telField, null,"手机号码格式不正确");
            }
        } else {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, telField, null,"手机号码不能为空");
        }

    }
    public void validateAddress(String addressField, Errors errors){//验证地址
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, addressField, null,"地址不能为空");
    }





}
