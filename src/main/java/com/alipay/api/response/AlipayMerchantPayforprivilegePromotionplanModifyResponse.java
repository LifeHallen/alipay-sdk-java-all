package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegePromotionPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.promotionplan.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-14 15:37:46
 */
public class AlipayMerchantPayforprivilegePromotionplanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8459213281457131456L;

	/** 
	 * 充值方案信息，返回修改后的充值方案信息
	 */
	@ApiField("promotion_plan")
	private PayForPrivilegePromotionPlanInfo promotionPlan;

	public void setPromotionPlan(PayForPrivilegePromotionPlanInfo promotionPlan) {
		this.promotionPlan = promotionPlan;
	}
	public PayForPrivilegePromotionPlanInfo getPromotionPlan( ) {
		return this.promotionPlan;
	}

}
