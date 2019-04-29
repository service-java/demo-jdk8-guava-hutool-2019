package com.bee.sample.ch3.web.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WorkOverTimeValidator implements ConstraintValidator<WorkOverTime, Integer> {
    WorkOverTime work;
    int max;

    public void initialize(WorkOverTime work) {
        this.work = work;
        max = work.max();
    }

    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value < max;
    }
}
