package ru.melnikov;

import java.util.Date;

public class Bulat {

    private Date date;
    private String name;
    private String regionName;
    private String index;
    private String ipAddress;

    public Bulat(String str) {
        String[] sArr = str.split(";");
        setName(sArr[1].trim());
        setIpAddress(sArr[2].trim());
        String[] sName = getName().split("-");
        if (sName.length>2) {
            setIndex(sName[1]);
            setRegionName(Element.getRegionName(sName[0]));
        }
        date=new Date();
    }

    @Override
    public String toString() {
        return String.join(",",date.toString(),name,ipAddress,regionName);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
