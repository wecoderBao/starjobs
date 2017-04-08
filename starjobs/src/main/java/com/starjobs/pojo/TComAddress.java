package com.starjobs.pojo;

public class TComAddress {
    private Integer cComAddressId;

    private String cProvince;

    private String cCity;

    private String cTown;

    private String cAddressDetail;

    public Integer getcComAddressId() {
        return cComAddressId;
    }

    public void setcComAddressId(Integer cComAddressId) {
        this.cComAddressId = cComAddressId;
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince == null ? null : cProvince.trim();
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity == null ? null : cCity.trim();
    }

    public String getcTown() {
        return cTown;
    }

    public void setcTown(String cTown) {
        this.cTown = cTown == null ? null : cTown.trim();
    }

    public String getcAddressDetail() {
        return cAddressDetail;
    }

    public void setcAddressDetail(String cAddressDetail) {
        this.cAddressDetail = cAddressDetail == null ? null : cAddressDetail.trim();
    }
}