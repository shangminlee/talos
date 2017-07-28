package cn.luntaibang.talos.api.vo;

/**
 * <p>用户 view object</p>
 * @author arrows
 */
public class UserVo {

    //用户ID
    private Integer id;

    //手机号
    private String mobile;

    public UserVo() {
    }

    public UserVo(Integer id, String mobile) {
        this.id = id;
        this.mobile = mobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
