package com.dev.smartcash.Coupon.domain.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequiredArgsConstructor
@RestController
public class CouponController  implements CouponAPI{

    private final CouponService couponService;

    @Override
    public CouponResponse createdCoupon(CouponRequest couponRequest) {
        log.info("[inicia] CouponController - createdCoupon");
        CouponResponse couponCreated = couponService.newCoupon(couponRequest);
        log.info("[finaliza] CouponController - createdCoupon");
        return couponCreated;
    }
}
