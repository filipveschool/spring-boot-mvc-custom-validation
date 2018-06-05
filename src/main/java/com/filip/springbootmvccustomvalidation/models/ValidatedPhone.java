package com.filip.springbootmvccustomvalidation.models;

import com.filip.springbootmvccustomvalidation.validation.interfaces.ContactNumberConstraint;

public class ValidatedPhone {

    @ContactNumberConstraint
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return phone;
    }
}
