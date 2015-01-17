/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.coupon.api;

import com.creditcloud.coupon.model.CouponPackage;
import com.creditcloud.coupon.model.CouponPlacement;
import com.creditcloud.coupon.model.CouponStatus;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import javax.ejb.Remote;

/**
 * 与奖券相关的只读查询接口
 *
 * @author sobranie
 */
@Remote
public interface CouponQueryService {

    /**
     * 分页列出所有的奖券包
     * 
     * @param pageInfo
     * @return 
     */
    PagedResult<CouponPackage> listCouponPackage(PageInfo pageInfo);
    
    /**
     * 分页列出某个人的所有奖券.
     * 
     * 第一排序是状态，第二排序是获得时间
     * 
     * @param userId
     * @param pageInfo
     * @return 
     */
    PagedResult<CouponPlacement> listUserPlacement(String userId, PageInfo pageInfo);
    
    /**
     * 按照给定状态分页列出某个人的奖券.
     * 
     * 排序按照获得时间倒序
     * 
     * @param userId
     * @param statusList
     * @param pageInfo
     * @return 
     */
    PagedResult<CouponPlacement> listUserPlacementByStatus(String userId, PageInfo pageInfo, CouponStatus... statusList);
    
}
