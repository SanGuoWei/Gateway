/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.service.misc.WechatInfoService;
import javax.ejb.Remote;

/**
 *
 * wrap client customized requirements from CreditMarket
 *
 * @author rooseek
 */
@Remote
public interface MarketCustomizeService extends WechatInfoService{
}
