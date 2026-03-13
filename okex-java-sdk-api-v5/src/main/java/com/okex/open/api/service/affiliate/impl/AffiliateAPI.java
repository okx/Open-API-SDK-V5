package com.okex.open.api.service.affiliate.impl;


import com.alibaba.fastjson.JSONObject;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface AffiliateAPI {

    /**
     * 获取被邀请人返佣详情
     * GET /api/v5/affiliate/invitee/detail
     */
    @GET("/api/v5/affiliate/invitee/detail")
    Call<JSONObject> getInviteeDetail(@Query("uid") String uid);

    /**
     * 获取用户的节点返佣信息
     * GET /api/v5/users/partner/if-rebate
     */
    @GET("/api/v5/users/partner/if-rebate")
    Call<JSONObject> getPartner(@Query("apiKey") String apiKey);

    /**
     * 获取被邀请人列表，支持按时间范围过滤
     * GET /api/v5/affiliate/invitee/list
     */
    @GET("/api/v5/affiliate/invitee/list")
    Call<JSONObject> getInviteeList(@Query("begin") String begin, @Query("end") String end, @Query("limit") String limit);
}
