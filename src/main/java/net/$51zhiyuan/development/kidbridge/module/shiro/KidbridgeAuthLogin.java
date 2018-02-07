package net.$51zhiyuan.development.kidbridge.module.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * Created by hkhl.cn on 2017/7/31.
 */
public class KidbridgeAuthLogin extends UsernamePasswordToken {

    private Integer type;

    public KidbridgeAuthLogin() {
    }

    public KidbridgeAuthLogin(String code, Integer type) {
        super(code, code);
        this.type = type;
    }

    public KidbridgeAuthLogin(String code, Integer type, String host) {
        super(code, code, host);
        this.type = type;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
