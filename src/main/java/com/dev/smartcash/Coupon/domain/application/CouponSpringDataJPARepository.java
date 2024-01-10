package com.dev.smartcash.Coupon.domain.application;

import com.dev.smartcash.Coupon.domain.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponSpringDataJPARepository extends JpaRepository<Coupon, UUID> {
}
