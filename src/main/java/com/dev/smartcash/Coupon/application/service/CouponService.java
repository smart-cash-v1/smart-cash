package com.dev.smartcash.Coupon.application.service;

import com.dev.smartcash.Coupon.application.api.CouponRequest;
import com.dev.smartcash.Coupon.application.api.CouponResponse;
import com.dev.smartcash.Coupon.application.api.CouponListDTO;

import java.util.UUID;

public interface CouponService {
    CouponResponse newCoupon(CouponRequest couponRequest);
    CouponListDTO getCouponById(UUID idCoupon);
    void mudaStatusDoCoupon(UUID idCoupon);
    void mudaStatusCouponParaNotSaved(UUID idCoupon);
}
