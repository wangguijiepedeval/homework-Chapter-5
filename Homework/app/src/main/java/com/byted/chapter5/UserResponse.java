package com.byted.chapter5;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class UserResponse {
    // 请求状态码
    @SerializedName("errorCode")
    public int errorCode;
    // 错误信息
    @SerializedName("errorMsg")
    public String errorMsg;
    // 用户对象数据
    @SerializedName("data")
    User user;

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
