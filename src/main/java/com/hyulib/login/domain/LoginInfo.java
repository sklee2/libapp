package com.hyulib.login.domain;

/**
 * Created by sklee on 2016. 1. 17..
 */
public class LoginInfo {
    private String code;
    private String message;
    private String userId;
    private String userName;
    private String userPosition;
    private String campus;
    private String company;
    private String department;
    private String status;
    private String loanCheck;
    private String loanCheckCause;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoanCheck() {
        return loanCheck;
    }

    public void setLoanCheck(String loanCheck) {
        this.loanCheck = loanCheck;
    }

    public String getLoanCheckCause() {
        return loanCheckCause;
    }

    public void setLoanCheckCause(String loanCheckCause) {
        this.loanCheckCause = loanCheckCause;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPosition='" + userPosition + '\'' +
                ", campus='" + campus + '\'' +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", status='" + status + '\'' +
                ", loanCheck='" + loanCheck + '\'' +
                ", loanCheckCause='" + loanCheckCause + '\'' +
                '}';
    }
}
