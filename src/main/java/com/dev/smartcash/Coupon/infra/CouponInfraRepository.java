package com.dev.smartcash.Coupon.infra;


import com.dev.smartcash.Coupon.domain.Coupon;
import com.dev.smartcash.Coupon.application.repository.CouponRepository;
import com.dev.smartcash.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
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
    public Coupon getCouponById(UUID idCoupon) {
        log.info("[inicia] CouponInfraRepository - getCouponId");
        Coupon coupon = (Coupon) couponSpringDataJPARepository.findByIdCoupon(idCoupon)
                        .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Coupon not found!"));
        log.info("[finaliza] CouponInfraRepository - getCouponId");
        return coupon;
    }

    @Override
    public List<Coupon> getAllCoupons() {
        log.info("[inicia] CouponInfraRepository - getAllCoupons");
        List<Coupon> generalCoupon = couponSpringDataJPARepository.findAll();
        log.info("[finaliza] CouponInfraRepository - getAllCoupons");
        return generalCoupon;
    }
}