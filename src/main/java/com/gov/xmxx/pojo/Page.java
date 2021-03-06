package com.gov.xmxx.pojo;


import com.github.pagehelper.PageInfo;

/**
 * @author Han Yong
 * @since 2018-07-02
 */

public class Page {
    private Integer code;
    private String msg;
    private long count;
    private Object data;

    public Page(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Page{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }

    public Page(PageInfo pageInfo) {
        this.code = 0;
        this.msg = "成功";
        this.count = pageInfo.getTotal();
        this.data = pageInfo.getList();
    }

    public Page(Integer code, String msg, long count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public Page(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Page(Object data) {

        this.data = data;
    }
}
