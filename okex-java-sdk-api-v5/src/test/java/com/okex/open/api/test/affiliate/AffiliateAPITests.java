package com.okex.open.api.test.affiliate;


import com.alibaba.fastjson.JSONObject;
import com.okex.open.api.service.affiliate.AffiliateAPIService;
import com.okex.open.api.service.affiliate.impl.AffiliateAPIServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjusters;



public class AffiliateAPITests extends AffiliateAPIBaseTests {
    private static final Logger LOG = LoggerFactory.getLogger(AffiliateAPITests.class);

    private AffiliateAPIService AffiliateAPI;



    @Before
    public void before() {
        this.config = this.config();
        this.AffiliateAPI = new AffiliateAPIServiceImpl(this.config);
    }
    /**
     * 获取被邀请人返佣信息 detail
     * GET /api/v5/affiliate/invitee/detail
     */
    @Test
    public void getInviteeDetail(){

        JSONObject result = this.AffiliateAPI.getInviteeDetail("");
        toResultString(LOG, "result", result);
    }
    /**
     * 获取用户的节点返佣信息 if-rebate
     * GET /api/v5/users/partner/if-rebate
     */
    @Test
    public void getPartner(){

        JSONObject result = this.AffiliateAPI.getPartner("");
        toResultString(LOG, "result", result);
    }

    /**
     * 获取本月新增被邀请人列表
     * GET /api/v5/affiliate/invitee/list
     */
    @Test
    public void getCurrentMonthInvitees(){
        LocalDate today = LocalDate.now(ZoneOffset.UTC);
        String begin = String.valueOf(today.with(TemporalAdjusters.firstDayOfMonth())
                .atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli());
        String end = String.valueOf(today.plusDays(1)
                .atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli());

        JSONObject result = this.AffiliateAPI.getInviteeList(begin, end, "100");
        toResultString(LOG, "result", result);
    }

}
