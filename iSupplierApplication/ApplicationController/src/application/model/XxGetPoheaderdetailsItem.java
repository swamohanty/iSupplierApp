package application.model;

import oracle.maf.api.cdm.persistence.model.Entity;

import java.math.BigDecimal;


public class XxGetPoheaderdetailsItem extends Entity {

    private BigDecimal poHeaderId;
    private String poSegment1;
    private String poOu;
    private String poDate;
    private String poBuyerName;
    private String poStatus;
    private BigDecimal poAmount;
    private String poCurrency;


    public BigDecimal getPoHeaderId() {
        return this.poHeaderId;
    }

    public void setPoHeaderId(BigDecimal poHeaderId) {
        this.poHeaderId = poHeaderId;
    }

    public String getPoSegment1() {
        return this.poSegment1;
    }

    public void setPoSegment1(String poSegment1) {
        this.poSegment1 = poSegment1;
    }

    public String getPoOu() {
        return this.poOu;
    }

    public void setPoOu(String poOu) {
        this.poOu = poOu;
    }

    public String getPoDate() {
        return this.poDate;
    }

    public void setPoDate(String poDate) {
        this.poDate = poDate;
    }

    public String getPoBuyerName() {
        return this.poBuyerName;
    }

    public void setPoBuyerName(String poBuyerName) {
        this.poBuyerName = poBuyerName;
    }

    public String getPoStatus() {
        return this.poStatus;
    }

    public void setPoStatus(String poStatus) {
        this.poStatus = poStatus;
    }

    public BigDecimal getPoAmount() {
        return this.poAmount;
    }

    public void setPoAmount(BigDecimal poAmount) {
        this.poAmount = poAmount;
    }

    public String getPoCurrency() {
        return this.poCurrency;
    }

    public void setPoCurrency(String poCurrency) {
        this.poCurrency = poCurrency;
    }


}
