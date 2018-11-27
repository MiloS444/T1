/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.aaap.assignment.communities;

/**
 *
 * @author Milos
 */
public class InnerJoin {


    private final String postal_kantonShort;
    private final String postal_placeRemark;
    private final String postal_communityRemark;
    private final String postal_communityName;
    private final String postal_communityNo;
    private final String postal_communityNameShort;
    private final String postal_zipCodeRemark;
    private final String postal_zipCode;
    private final String postal_zipCodeAdditional;
    private final String postal_zipCodeNameShort;

    private final String com_kantonShort;
    private final String com_districtNo;
    private final String com_communityNo;
    private final String com_communityName;
    private final String com_communityNameShort;
    private final String com_districtName;
    private final String com_kantonName;
    private final String com_lastUpdateDate;


    public InnerJoin(String postal_kantonShort, String postal_placeRemark,
                     String postal_communityRemark, String postal_communityName,
                     String postal_communityNo, String postal_communityNameShort,
                     String postal_zipCodeRemark, String postal_zipCode,
                     String postal_zipCodeAdditional, String postal_zipCodeNameShort,
                     String com_kantonShort, String com_districtNo, String com_communityNo,
                     String com_communityName, String com_communityNameShort,
                     String com_districtName, String com_kantonName,
                     String com_lastUpdateDate) {
        this.postal_kantonShort = postal_kantonShort;
        this.postal_placeRemark = postal_placeRemark;
        this.postal_communityRemark = postal_communityRemark;
        this.postal_communityName = postal_communityName;
        this.postal_communityNo = postal_communityNo;
        this.postal_communityNameShort = postal_communityNameShort;
        this.postal_zipCodeRemark = postal_zipCodeRemark;
        this.postal_zipCode = postal_zipCode;
        this.postal_zipCodeAdditional = postal_zipCodeAdditional;
        this.postal_zipCodeNameShort = postal_zipCodeNameShort;
        this.com_kantonShort = com_kantonShort;
        this.com_districtNo = com_districtNo;
        this.com_communityNo = com_communityNo;
        this.com_communityName = com_communityName;
        this.com_communityNameShort = com_communityNameShort;
        this.com_districtName = com_districtName;
        this.com_kantonName = com_kantonName;
        this.com_lastUpdateDate = com_lastUpdateDate;
    }

    public String getPostal_kantonShort() {
        return postal_kantonShort;
    }

    public String getPostal_placeRemark() {
        return postal_placeRemark;
    }

    public String getPostal_communityRemark() {
        return postal_communityRemark;
    }

    public String getPostal_communityName() {
        return postal_communityName;
    }

    public String getPostal_communityNo() {
        return postal_communityNo;
    }

    public String getPostal_communityNameShort() {
        return postal_communityNameShort;
    }

    public String getPostal_zipCodeRemark() {
        return postal_zipCodeRemark;
    }

    public String getPostal_zipCode() {
        return postal_zipCode;
    }

    public String getPostal_zipCodeAdditional() {
        return postal_zipCodeAdditional;
    }

    public String getPostal_zipCodeNameShort() {
        return postal_zipCodeNameShort;
    }

    public String getCom_kantonShort() {
        return com_kantonShort;
    }

    public String getCom_districtNo() {
        return com_districtNo;
    }

    public String getCom_communityNo() {
        return com_communityNo;
    }

    public String getCom_communityName() {
        return com_communityName;
    }

    public String getCom_communityNameShort() {
        return com_communityNameShort;
    }

    public String getCom_districtName() {
        return com_districtName;
    }

    public String getCom_kantonName() {
        return com_kantonName;
    }

    public String getCom_lastUpdateDate() {
        return com_lastUpdateDate;
    }
}
