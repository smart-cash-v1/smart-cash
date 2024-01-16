package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.domain.StatusFavorite;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/coupon")
@Tag(name = "Coupon", description = "Endpoints Relacionados ao Cupom relacionado as empresas.")
public interface CouponAPI {


    @PostMapping
    @Operation(summary = "Criação do Cupom",
            description = "Este endpoint cria um cupom!")
    @ResponseStatus(code = HttpStatus.CREATED)
    CouponResponse createdCoupon(@RequestBody @Valid CouponRequest couponRequest);

    @GetMapping(value = "/{idCoupon}")
    @Operation(summary = "Retorna o cupom, nome e id da empresa cadastrada!",
            description = "Este endpoint retorna um cupom específico de, uma empresa específica!")
    @ResponseStatus(code = HttpStatus.OK)
    CouponListDTO getCouponById(@PathVariable UUID idCoupon);


    @PatchMapping("/{idCoupon}/status")
    @Operation(summary = "Mudar status do Cupom",
            description = "Este endpoint muda o status de um cupom!")
    @ResponseStatus(HttpStatus.OK)
    void alterarStatusDoCupom(@PathVariable UUID idCoupon);
}
