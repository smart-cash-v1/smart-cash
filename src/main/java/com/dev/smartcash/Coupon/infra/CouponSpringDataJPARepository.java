package com.dev.smartcash.Coupon.infra;

import com.dev.smartcash.Coupon.domain.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CouponSpringDataJPARepository extends JpaRepository<Coupon, UUID> {
    Optional<Object> findByIdCoupon(UUID idCoupon);
    Optional<Coupon> findByIdCompanie(UUID idCompanie);
    Optional<Coupon> findByIdCoupon(UUID idCoupon);

}
