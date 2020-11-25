package com.miaosha.Util;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final Pattern phone_pattern = Pattern.compile("1\\d{10}");

    public static boolean isPhone(String phone) {
        if (StringUtils.isEmpty(phone)) {
            return false;
        }
        Matcher matcher = phone_pattern.matcher(phone);
        return matcher.matches();
    }
}
