package com.youzheng.controller;

import com.youzheng.TableVo;
import com.youzheng.pojo.Item;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class DataControl {
    @RequestMapping("/res/getData")
    public TableVo getData(){
        TableVo tableVo = getAllData();
        return tableVo;
    }

    private TableVo getAllData() {
        TableVo tableVo = new TableVo();
        tableVo.setCount(1);
        ArrayList<Item> items = new ArrayList<>();
        Item item = new Item();
        item.setImgPath("static/img/设备产品.jpg");
        HashMap<String, String> map = new HashMap<>();
        map.put("为用户提供电气运维解决方案","为客户提供专业的能耗管理、设备状态管理服务，保障用户配电设施的运行安全。");
        map.put("将采集信息实时传输到云平台","为客户提供专业的能耗管理、设备状态管理服务，保障用户配电设施的运行安全。");
        map.put("智能运维系统互联网＋应用模式","为客户提供专业的能耗管理、设备状态管理服务，保障用户配电设施的运行安全。");
        item.setDetailedInfo(map);
        item.setName("智能电气运维点检系统");
        item.setSimplifyInfo("为用户提供电气运维解决方案; 将采集信息实时传输到云平台; 智能运维系统互联网+应用模式; 平台对信息进行智能运算分析。");
        items.add(item);
        tableVo.setData(items);
        return tableVo;
    }
}
