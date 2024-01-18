package com.dev.smartcash.Coupon.application.repository;


import com.dev.smartcash.Coupon.domain.Coupon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CouponRepository {
    Coupon save(Coupon coupon);
    List<Coupon> getAllCoupons();
    Coupon getCompanieId(UUID idCompanie);
    void deleteCouponById(Coupon coupon);
    Optional<Coupon> getCouponById(UUID idCoupon);
    Page<Coupon> buscaTodosCouponsPaginado(Pageable pageable);
}
