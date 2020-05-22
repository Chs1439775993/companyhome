package com.youzheng;

import com.youzheng.pojo.Item;

import java.util.List;

public class TableVo {
    int count;
    List<Item> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Item> getData() {
        return data;
    }

    public void setData(List<Item> data) {
        this.data = data;
    }
}
