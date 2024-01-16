package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.application.service.CouponService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
    public CouponListDTO getCouponById(UUID idCoupon) {
        log.info("[inicia] CouponController - getCouponById");
        CouponListDTO coupon = couponService.getCouponById(idCoupon);
        log.info("[finish] CouponController - getCouponById");
        return coupon;
    }

    @Override
    public List<CouponListDTO> getAllCoupons() {
        log.info("[inicia] CouponController - getAllCoupons");
        List<CouponListDTO> coupons = couponService.getAllCoupons();
        log.info("[finaliza] CouponController - getAllCoupons");
        return coupons;
    }

    @Override
    public CouponDetailResponse getCompanieId(UUID idCompanie) {
        log.info("[inicia] CouponController - getCompanieCouponId");
        log.info("[idCompanie]{}", idCompanie);
        CouponDetailResponse couponDetail = couponService.getCompanieId(idCompanie);
        log.info("[finaliza] CouponController - getCompanieCouponId");
        return couponDetail;
    }

    @Override
    public void deleteCouponById(UUID idCoupon) {
        log.info("[inicia] CouponController - deleteCouponById");
        log.info("[idCoupon] {}", idCoupon);
        couponService.deleteCouponById(idCoupon);
        log.info("[finaliza] CouponController - deleteCouponById");
    }
}
