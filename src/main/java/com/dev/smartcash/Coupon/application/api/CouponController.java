package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.application.service.CouponService;
import com.dev.smartcash.Coupon.domain.Coupon;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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

    @Override
    public CouponResponseDTO detailCoupon(UUID idCompanie) {
        log.info("[inicia] CouponController - detailCoupon");
        Coupon coupon = couponService.detailCoupon(idCompanie);
        log.info("[finish] CouponController - detailCoupon");
        return new CouponResponseDTO(coupon);
    }
}
