package com.shop.util;

/**
 * @Author: wzy
 * @Date: 2024/11/13 11:03
 * @Description: 返回结果类
 */
public class ResultJSON<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private T data;

    public ResultJSON(Integer code, String msg, Integer count, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }

    public static <T> ResultJSON SuccessorError(Integer count,T data){
        if (data != null){
            return new ResultJSON(0,"登录成功",count, data);
        }else {
            return new ResultJSON(400,"登录失败",count,null);
        }

    }

    public static <T> ResultJSON success(T data){
        return new ResultJSON(200,"登录成功",null,data);
    }
    public static <T> ResultJSON success(Integer count,T data){
        return new ResultJSON(200,"登录成功",count,data);
    }
    public static ResultJSON success(){
        return new ResultJSON(200,"登录成功",0,null);
    }
    public static ResultJSON success(Integer code,String msg){
        return new ResultJSON(code,msg,0,null);
    }
    public static ResultJSON error(){
        return new ResultJSON(400,"登录失败",0,null);
    }
    public static ResultJSON error(Integer code,String msg){
        return new ResultJSON(code,msg,0,null);
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
