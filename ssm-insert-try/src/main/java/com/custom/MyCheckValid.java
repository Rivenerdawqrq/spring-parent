package com.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCheckValid implements ConstraintValidator<MyCheck,Integer> {
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        if (integer==null){
            return false;
        }else {
            return true;
        }

    }
}
