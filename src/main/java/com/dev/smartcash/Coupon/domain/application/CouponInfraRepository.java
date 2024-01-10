package com.dev.smartcash.Coupon.domain.application;


import com.dev.smartcash.Coupon.domain.Coupon;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class CouponInfraRepository implements CouponRepository{

    private final CouponSpringDataJPARepository couponSpringDataJPARepository;

    @Override
    public Coupon save(Coupon coupon) {
        log.info("[inicia] CouponInfraRepository - save");
        couponSpringDataJPARepository.save(coupon);
        log.info("[finaliza] CouponInfraRepository - save");
        return coupon;
    }
}
