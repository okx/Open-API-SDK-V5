package com.okex.open.api.bean.account.param;

public class AccountMode {
    public String getAcctLv() {
        return acctLv;
    }

    public void setAcctLv(String acctLv) {
        this.acctLv = acctLv;
    }

    private String acctLv;

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    private String feeType;
    private String type;

    public String getStgyType() {
        return stgyType;
    }

    public void setStgyType(String stgyType) {
        this.stgyType = stgyType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String stgyType;

    public String getSettleCcy() {
        return settleCcy;
    }

    public void setSettleCcy(String settleCcy) {
        this.settleCcy = settleCcy;
    }

    private String settleCcy;
    @Override
    public String toString() {
        return "AccountMode{" +
                "acctLv='" + acctLv + '\'' +

                '}';
    }
}
