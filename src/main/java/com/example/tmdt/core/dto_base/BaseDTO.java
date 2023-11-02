package com.example.tmdt.core.dto_base;

import com.fasterxml.jackson.annotation.JsonIgnore;


public abstract class BaseDTO {

    public interface Create {

    }

    public interface Update {

    }

    @JsonIgnore
    private String statusCode;

    public BaseDTO() {
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
