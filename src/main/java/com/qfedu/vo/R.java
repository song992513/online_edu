package com.qfedu.vo;

import com.qfedu.core.type.RType;
import lombok.Data;

/**
 * projectName: kabata
 *
 * @author: szc
 * time:2020/10/19 15:52
 * description:同一结果返回，整个系统 接口的统一返回格式
 */
@Data
public class R<T> {
    private int code;//返回码
    private String msg;//返回码的字符串信息
    private T data;//返回的数据

    public static <T> R setR(int c, String m, T obj){
        R r = new R();
        r.setCode(c);
        r.setMsg(m);
        r.setData(obj);
        return r;
    }
    //成功
    public static R ok(){
        return setR(RType.成功.getVal(),"ok",null);
    }//成功
    public static <T> R ok(T t){
        return setR(RType.成功.getVal(),"OK",t);
    }
    //失败
    public static R fail(){
        return setR(RType.失败.getVal(),"Fail",null);
    }

}
