package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-09 13:41:18
 */
public class AlipayOpenMiniInnerbaseinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8748538624542756225L;

	/** 
	 * 小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

}
