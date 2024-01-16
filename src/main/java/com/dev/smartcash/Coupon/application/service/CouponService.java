package com.dev.smartcash.Coupon.application.service;

import com.dev.smartcash.Coupon.application.api.CouponDetailResponse;
import com.dev.smartcash.Coupon.application.api.CouponRequest;
import com.dev.smartcash.Coupon.application.api.CouponResponse;
import com.dev.smartcash.Coupon.application.api.CouponListDTO;

import java.util.List;
import java.util.UUID;

public interface CouponService {
    CouponResponse newCoupon(CouponRequest couponRequest);
    CouponListDTO getCouponById(UUID idCoupon);
    List<CouponListDTO> getAllCoupons();
    CouponDetailResponse getCompanieId(UUID idCompanie);
    void deleteCouponById(UUID idCoupon);
}
