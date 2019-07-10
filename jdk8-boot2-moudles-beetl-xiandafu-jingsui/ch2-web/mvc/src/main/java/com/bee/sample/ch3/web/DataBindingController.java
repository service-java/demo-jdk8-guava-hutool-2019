package com.bee.sample.ch3.web;

import java.util.Date;
import java.util.List;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch3.entity.form.WorkInfoForm;
import com.bee.sample.ch3.entity.User;

/**
 * 日志格式化也可以参考MvcConfigurer，配置全局
 *
 * @author Lijiazhi
 */
@Controller
@RequestMapping("/databind")
public class DataBindingController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
        binder.addValidators(new Validator() {

            @Override
            public boolean supports(Class<?> clazz) {
                return clazz == WorkInfoForm.class;
            }

            @Override
            public void validate(Object target, Errors errors) {
                WorkInfoForm form = (WorkInfoForm) target;
            }

        });
    }

    @RequestMapping("/date")
    public @ResponseBody User printDate(Date d) {
        System.out.println(d);
        return new User();
    }


    @ResponseBody
    @RequestMapping("/addworkinfo.html")
    public void addWorkInfo(@Validated({WorkInfoForm.Add.class}) WorkInfoForm workInfo, BindingResult result) {
        if (result.hasErrors()) {

            List<ObjectError> list = result.getAllErrors();

            FieldError error = (FieldError) list.get(0);
            System.out.println(error.getObjectName() + "," + error.getField() + "," + error.getDefaultMessage());
            return;
        }

        return;
    }


}
