package com.dev.smartcash.Coupon.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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


    @PatchMapping("/{idCoupon}/status/saved")
    @Operation(summary = "Mudar status do Cupom para SAVED",
            description = "Este endpoint muda o status de um cupom para SAVED!")
    @ResponseStatus(HttpStatus.OK)
    void alterarStatusParaSaved(@PathVariable UUID idCoupon);

    @PatchMapping("/{idCoupon}/status/not_saved")
    @Operation(summary = "Mudar status do Cupom para NOT_SAVED",
            description = "Este endpoint muda o status de um cupom para NOT_SAVED!")
    @ResponseStatus(HttpStatus.OK)
    void alterarStatusParaNotSaved(@PathVariable UUID idCoupon);

}
