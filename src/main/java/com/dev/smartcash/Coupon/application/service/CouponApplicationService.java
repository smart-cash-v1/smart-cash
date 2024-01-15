package com.dev.smartcash.Coupon.application.service;

import com.dev.smartcash.Coupon.application.api.CouponRequest;
import com.dev.smartcash.Coupon.application.api.CouponResponse;
import com.dev.smartcash.Coupon.application.api.CouponListDTO;
import com.dev.smartcash.Coupon.application.repository.CouponRepository;
import com.dev.smartcash.Coupon.domain.Coupon;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public CouponListDTO getCouponById(UUID idCoupon) {
        log.info("[inicia]  CouponApplicationService - getCouponById");
        Coupon coupon = couponRepository.getCouponById(idCoupon);
        log.info("[finaliza]  CouponApplicationService - getCouponById");
        return new CouponListDTO(coupon);
    }

    @Override
    public List<CouponListDTO> getAllCoupons() {
        log.info("[inicia]  CouponApplicationService - getAllCoupons");
        List<Coupon> coupons = couponRepository.getAllCoupons();
        log.info("[finaliza]  CouponApplicationService - getAllCoupons");
        return CouponListDTO.converte(coupons);
    }
}
