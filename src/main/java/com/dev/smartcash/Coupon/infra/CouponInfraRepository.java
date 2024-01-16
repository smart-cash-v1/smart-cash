package com.dev.smartcash.Coupon.infra;


import com.dev.smartcash.Coupon.domain.Coupon;
import com.dev.smartcash.Coupon.application.repository.CouponRepository;
import com.dev.smartcash.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class CouponInfraRepository implements CouponRepository {

    private final CouponSpringDataJPARepository couponSpringDataJPARepository;

    @Override
    public Coupon save(Coupon coupon) {
        log.info("[inicia] CouponInfraRepository - save");
        couponSpringDataJPARepository.save(coupon);
        log.info("[finaliza] CouponInfraRepository - save");
        return coupon;
    }
    @Override
    public Optional<Coupon> getCouponById(UUID idCoupon) {
        log.info("[inicia] CouponInfraRepository - getCouponId");
        Optional<Coupon> coupon = couponSpringDataJPARepository.findByIdCoupon(idCoupon);
        log.info("[finaliza] CouponInfraRepository - getCouponId");
        return coupon;
    }
}