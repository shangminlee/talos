package cn.luntaibang.talos.common.head;


import java.io.Serializable;


public class Result<T> implements Serializable {

    private String status;
    private String msg;
    private T data;

    private Result(String status){
        this.status = status;
    }
    private Result(String status, T data){
        this.status = status;
        this.data = data;
    }

    private Result(String status, String msg, T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private Result(String status, String msg){
        this.status = status;
        this.msg = msg;
    }

    public String getStatus(){
        return status;
    }
    public T getData(){
        return data;
    }
    public String getMsg(){
        return msg;
    }


    public static <T> Result<T> createBySuccess(){
        return new Result<T>(ResultCode.SUCCESS.getCode());
    }

    public static <T> Result<T> createBySuccessMessage(String msg){
        return new Result<T>(ResultCode.SUCCESS.getCode(),msg);
    }

    public static <T> Result<T> createBySuccess(T data){
        return new Result<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getDesc(),data);
    }

    public static <T> Result<T> createBySuccess(String msg, T data){
        return new Result<T>(ResultCode.SUCCESS.getCode(),msg,data);
    }

    public static <T> Result<T> createByError(){
        return new Result<T>(ResultCode.ERROR.getCode(), ResultCode.ERROR.getDesc());
    }

    public static <T> Result<T> createByErrorMessage(String errorMessage){
        return new Result<T>(ResultCode.ERROR.getCode(),errorMessage);
    }

    public static <T> Result<T> createByErrorCodeMessage(String errorCode, String errorMessage){
        return new Result<T>(errorCode,errorMessage);
    }













}
