package com.dev.smartcash.Coupon.domain.application;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/coupon")
@Tag(name = "Coupon", description = "Endpoints Relacionados ao Cupom relacionado as empresas.")
public interface CouponAPI {


    @PostMapping
    CouponResponse createdCoupon(@RequestBody @Valid CouponRequest couponRequest);

}
