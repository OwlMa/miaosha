package com.miaosha.Util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
    public static String md5(String source) {
        return DigestUtils.md5Hex(source);
    }

    public static String clientSalt = "1a2b3c";
    public static String userPasswordToFormPassword(String userPassword) {
        String str = "" + clientSalt.charAt(0) + clientSalt.charAt(2) + userPassword + clientSalt.charAt(5) + clientSalt.charAt(4);
        return md5(str);
    }

    public static String formPasswordToDBPassword(String formPassword, String salt) {
        String dbPassword = "" + salt.charAt(0) + salt.charAt(2) + formPassword + salt.charAt(5) + salt.charAt(4);
        return md5(dbPassword);
    }
}
