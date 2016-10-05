package application.model;

import oracle.maf.api.cdm.persistence.model.Entity;

import java.math.BigDecimal;


public class XxPoline extends Entity {

    private BigDecimal poHeaderId;
    private String poSegment1;
    private String poOu;
    private String poDate;
    private String poBuyerName;
    private String poStatus;
    private BigDecimal poAmount;
    private String poCurrency;
    private String lineNum;
    private String lineType;
    private String itemDescription;
    private String uom;
    private BigDecimal unitPrice;
    private String promisedDate;
    private String needByDate;
    private BigDecimal qty;


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

    public String getLineNum() {
        return this.lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getLineType() {
        return this.lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getUom() {
        return this.uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getPromisedDate() {
        return this.promisedDate;
    }

    public void setPromisedDate(String promisedDate) {
        this.promisedDate = promisedDate;
    }

    public String getNeedByDate() {
        return this.needByDate;
    }

    public void setNeedByDate(String needByDate) {
        this.needByDate = needByDate;
    }

    public BigDecimal getQty() {
        return this.qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }


}
