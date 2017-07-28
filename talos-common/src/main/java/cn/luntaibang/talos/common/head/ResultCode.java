package cn.luntaibang.talos.common.head;


public enum ResultCode {

    SUCCESS("000000","SUCCESS"),
    ERROR("100000","ERROR"),
    NEED_LOGIN("100001","NEED_LOGIN"),
    ILLEGAL_ARGUMENT("100002","ILLEGAL_ARGUMENT");

    private final String code;
    private final String desc;


    ResultCode(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

}
