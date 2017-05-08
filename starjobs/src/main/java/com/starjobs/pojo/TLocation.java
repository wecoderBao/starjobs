package com.starjobs.pojo;

public class TLocation {
    private Integer cLocationId;

    private String cLocationLongitude;

    private String cLocationLatitude;

    private String cLocationName;

    private String cLocationType;

    private String cLocationDesc;

    public Integer getcLocationId() {
        return cLocationId;
    }

    public void setcLocationId(Integer cLocationId) {
        this.cLocationId = cLocationId;
    }

    public String getcLocationLongitude() {
        return cLocationLongitude;
    }

    public void setcLocationLongitude(String cLocationLongitude) {
        this.cLocationLongitude = cLocationLongitude == null ? null : cLocationLongitude.trim();
    }

    public String getcLocationLatitude() {
        return cLocationLatitude;
    }

    public void setcLocationLatitude(String cLocationLatitude) {
        this.cLocationLatitude = cLocationLatitude == null ? null : cLocationLatitude.trim();
    }

    public String getcLocationName() {
        return cLocationName;
    }

    public void setcLocationName(String cLocationName) {
        this.cLocationName = cLocationName == null ? null : cLocationName.trim();
    }

    public String getcLocationType() {
        return cLocationType;
    }

    public void setcLocationType(String cLocationType) {
        this.cLocationType = cLocationType == null ? null : cLocationType.trim();
    }

    public String getcLocationDesc() {
        return cLocationDesc;
    }

    public void setcLocationDesc(String cLocationDesc) {
        this.cLocationDesc = cLocationDesc == null ? null : cLocationDesc.trim();
    }
}