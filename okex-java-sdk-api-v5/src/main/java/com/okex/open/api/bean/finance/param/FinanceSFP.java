package com.okex.open.api.bean.finance.param;

public class FinanceSFP {
    private String productId;
    private String notionalSz;

    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    private String ordId;
    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    private String quoteId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getNotionalSz() {
        return notionalSz;
    }

    public void setNotionalSz(String notionalSz) {
        this.notionalSz = notionalSz;
    }

    public String getNotionalCcy() {
        return notionalCcy;
    }

    public void setNotionalCcy(String notionalCcy) {
        this.notionalCcy = notionalCcy;
    }

    private String notionalCcy;
}
