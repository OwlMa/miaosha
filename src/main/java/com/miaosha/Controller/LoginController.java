package com.miaosha.Controller;

import com.miaosha.Code.LoginCode;
import com.miaosha.Result.Result;
import com.miaosha.Util.Validator;
import com.miaosha.Vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/do_login")
    @ResponseBody
    public Result<Boolean> doLogin(LoginVo loginVo) {
        log.info(loginVo.toString());
        String phone = loginVo.getPhone();
        String password = loginVo.getPassword();

        //参数校验
        if (StringUtils.isEmpty(password)) {
            return Result.error(LoginCode.PASSWORD_EMPTY);
        }
        if (StringUtils.isEmpty(phone)) {
            return Result.error(LoginCode.PHONE_EMPTY);
        }
        if (!Validator.isPhone(phone)) {
            return Result.error(LoginCode.PHONE_FORMAT_ERROR);
        }
        return null;
    }
}
