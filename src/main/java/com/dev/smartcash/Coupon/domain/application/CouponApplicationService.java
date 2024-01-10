package com.dev.smartcash.Coupon.domain.application;

import com.dev.smartcash.Coupon.domain.Coupon;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class CouponApplicationService implements CouponService{

    private final CouponRepository couponRepository;

    @Override
    public CouponResponse newCoupon(CouponRequest couponRequest) {
        log.info("[inicia]  CouponApplicationService - newCoupon ");
        Coupon coupon = couponRepository.save(new Coupon(couponRequest));
        log.info("[finaliza]  CouponApplicationService - newCoupon ");
        return new CouponResponse(coupon);
    }
}
