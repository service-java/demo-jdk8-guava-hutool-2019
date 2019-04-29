package com.bee.sample.ch3.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import com.bee.sample.ch3.web.validate.WorkOverTime;

@Data
public class WorkInfoForm {

    public interface Update {
    }

    public interface Add {
    }


    @NotNull(groups = {Update.class})
    @Null(groups = {Add.class})
    Long id;

    @Size(min = 3, max = 20)
    String name;

    @Email
    String email;

    @WorkOverTime(max = 5)
    Integer workTime;

}
