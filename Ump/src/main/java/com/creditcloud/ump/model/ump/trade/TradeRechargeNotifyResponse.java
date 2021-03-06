/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.trade;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class TradeRechargeNotifyResponse extends BaseResponse{
    
    private String order_id;
    
    private String mer_date;

    public TradeRechargeNotifyResponse() {
        super(CmdIdRspType.RECHARGE_NOTIFY_RSP);
    }
    
    public TradeRechargeNotifyResponse(String mer_id, 
                                       String ret_code, 
                                       String order_id, 
                                       String mer_date) {
        super(CmdIdRspType.RECHARGE_NOTIFY_RSP, mer_id, ret_code, null);
        this.order_id = order_id;
        this.mer_date = mer_date;
    }
    
    
}
