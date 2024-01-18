package com.dev.smartcash.Coupon.infra;


import com.dev.smartcash.Coupon.domain.Coupon;
import com.dev.smartcash.Coupon.application.repository.CouponRepository;
import com.dev.smartcash.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
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

    @Override
    public List<Coupon> getAllCoupons() {
        log.info("[inicia] CouponInfraRepository - getAllCoupons");
        List<Coupon> generalCoupon = couponSpringDataJPARepository.findAll();
        log.info("[finaliza] CouponInfraRepository - getAllCoupons");
        return generalCoupon;
    }

    @Override
    public Coupon getCompanieId(UUID idCompanie) {
        log.info("[inicia] CouponInfraRepository - getCompanieCouponId");
        Coupon couponCompanie = couponSpringDataJPARepository.findByIdCompanie(idCompanie)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Coupon not found!"));
        log.info("[inicia] CouponInfraRepository - getCompanieCouponId");
        return couponCompanie;
    }

    @Override
    public void deleteCouponById(Coupon coupon) {
        log.info("[inicia] CouponInfraRepository - deleteCouponById");
        couponSpringDataJPARepository.delete(coupon);
        log.info("[finaliza] CouponInfraRepository - deleteCouponById");
    }

    @Override
    public Page<Coupon> buscaTodosCouponsPaginado(Pageable pageable) {
        log.info("[inicia] CouponInfraRepository - buscaTodosCouponsPaginado");
        Page<Coupon> todosCoupons = couponSpringDataJPARepository.findAll(pageable);
        log.info("[finaliza] CouponInfraRepository - buscaTodosCouponsPaginado");
        return todosCoupons;
    }
}
