package com.qfedu.util;

/**
 * projectName: kabata
 *
 * @author: szc
 * time:2020/10/19 15:49
 * description:
 */
public class StrUtil {
    /**
     * 效验是否为空
     * @return true 非空  false 空
     */
    public static boolean checkNoEmpty(String...strs){
        boolean r = true;
        for (String s : strs) {
            if (s==null || s.length()==0) {
                r=false;
                break;

            }
        }
        return r;
    }

}
