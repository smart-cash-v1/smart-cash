package com.dev.smartcash.Coupon.application.service;

import com.dev.smartcash.Coupon.application.api.CouponRequest;
import com.dev.smartcash.Coupon.application.api.CouponResponse;
import com.dev.smartcash.Coupon.domain.Coupon;

import java.util.UUID;

public interface CouponService {
    CouponResponse newCoupon(CouponRequest couponRequest);
    Coupon detailCoupon(UUID idCompanie);
}
