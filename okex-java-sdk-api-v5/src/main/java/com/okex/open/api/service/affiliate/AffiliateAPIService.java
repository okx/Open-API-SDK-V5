package com.okex.open.api.service.affiliate;

import com.alibaba.fastjson.JSONObject;
import com.okex.open.api.bean.earn.param.Cancel;
import com.okex.open.api.bean.earn.param.Purchase;
import com.okex.open.api.bean.earn.param.Redeem;

public interface AffiliateAPIService {

    /**
     * 获取被邀请人返佣详情
     * GET /api/v5/affiliate/invitee/detail
     *
     * @param uid 被邀请人 UID
     */
    JSONObject getInviteeDetail(String uid);

    /**
     * 获取用户的节点返佣信息
     * GET /api/v5/users/partner/if-rebate
     *
     * @param apiKey 用户 API Key
     */
    JSONObject getPartner(String apiKey);

    /**
     * 获取被邀请人列表
     * GET /api/v5/affiliate/invitee/list
     *
     * @param begin 开始时间，Unix 时间戳（毫秒）
     * @param end   结束时间，Unix 时间戳（毫秒）
     * @param limit 返回条数，最大 100
     */
    JSONObject getInviteeList(String begin, String end, String limit);
}
