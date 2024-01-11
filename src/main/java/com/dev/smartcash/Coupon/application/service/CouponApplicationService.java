package com.dev.smartcash.Coupon.application.service;

import com.dev.smartcash.Coupon.application.api.CouponRequest;
import com.dev.smartcash.Coupon.application.api.CouponResponse;
import com.dev.smartcash.Coupon.application.repository.CouponRepository;
import com.dev.smartcash.Coupon.domain.Coupon;
import com.dev.smartcash.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class CouponApplicationService implements CouponService{

    private final CouponRepository couponRepository;

    @Override
    public CouponResponse newCoupon(CouponRequest couponRequest) {
        log.info("[inicia]  CouponApplicationService - newCoupon");
        Coupon coupon = couponRepository.save(new Coupon(couponRequest));
        log.info("[finaliza]  CouponApplicationService - newCoupon");
        return new CouponResponse(coupon);
    }

    @Override
    public Coupon detailCoupon(UUID idCompanie) {
        log.info("[inicia]  CouponApplicationService - detailCoupon");
        Coupon coupon = couponRepository.getCouponId(idCompanie)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Coupon not found!"));
        log.info("[finaliza]  CouponApplicationService - detailCoupon");
        return coupon;
    }
}
