package com.starjobs.pojo;

public class TLocation {
    private Integer cLocationId;

    private Float cLocationLongitude;

    private Float cLocationLatitude;

    private String cLocationName;

    private String cLocationType;

    private String cLocationDesc;

    public Integer getcLocationId() {
        return cLocationId;
    }

    public void setcLocationId(Integer cLocationId) {
        this.cLocationId = cLocationId;
    }

    public Float getcLocationLongitude() {
        return cLocationLongitude;
    }

    public void setcLocationLongitude(Float cLocationLongitude) {
        this.cLocationLongitude = cLocationLongitude;
    }

    public Float getcLocationLatitude() {
        return cLocationLatitude;
    }

    public void setcLocationLatitude(Float cLocationLatitude) {
        this.cLocationLatitude = cLocationLatitude;
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