package com.youzheng.pojo;

import java.util.List;
import java.util.Map;

public class Item {
    String imgPath;
    String descripe;
    String name;
    String simplifyInfo;
    Map<String, String> detailedInfo;

    public String getDescripe() {
        return descripe;
    }

    public void setDescripe(String descripe) {
        this.descripe = descripe;
    }


    @Override
    public String toString() {
        return "Item{" +
                "imgPath='" + imgPath + '\'' +
                ", descripe='" + descripe + '\'' +
                ", name='" + name + '\'' +
                ", simplifyInfo='" + simplifyInfo + '\'' +
                ", detailedInfo=" + detailedInfo +
                '}';
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSimplifyInfo() {
        return simplifyInfo;
    }

    public void setSimplifyInfo(String simplifyInfo) {
        this.simplifyInfo = simplifyInfo;
    }

    public Map<String, String> getDetailedInfo() {
        return detailedInfo;
    }

    public void setDetailedInfo(Map<String, String> detailedInfo) {
        this.detailedInfo = detailedInfo;
    }
}
