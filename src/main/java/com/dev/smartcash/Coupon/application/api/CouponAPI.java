package com.dev.smartcash.Coupon.application.api;

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
    @Operation(summary = "Cadastra Cupom",
            description = "Este endpoint cria um cupom")
    @ResponseStatus(code = HttpStatus.CREATED)
    CouponResponse createdCoupon(@RequestBody @Valid CouponRequest couponRequest);

    @GetMapping(value = "/{idCoupon}")
    @Operation(summary = "Retorna o cupom, nome e id da empresa cadastrada",
            description = "Este endpoint retorna um cupom específico de, uma empresa específica.")
    @ResponseStatus(code = HttpStatus.OK)
    CouponListDTO getCouponById(@PathVariable UUID idCoupon);

    @GetMapping(value = "/all-coupons")
    @Operation(summary = "Retorna uma Lista de Cupons",
            description = "Este endpoint retorna Todos os Cupons Cadastrados.")
    @ResponseStatus(code = HttpStatus.OK)
    List<CouponListDTO> getAllCoupons();


    @GetMapping(value = "/all-coupons/{idCompanie}")
    @Operation(summary = "Retorna uma Lista de Cupons de uma empresa",
            description = "Este endpoint retorna Todos os Cupons de uma empresa Cadastrados.")
    @ResponseStatus(code = HttpStatus.OK)
    CouponDetailResponse getCompanieId(@PathVariable UUID idCompanie);


    @DeleteMapping(value = "/coupon/{idCoupon}")
    @Operation(summary = "Endpoint para exclusão de um cupom passando o ID.",
            description = "Este endpoint exclui um cupom passando o idCoupon ")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteCouponById(@PathVariable UUID idCoupon);

    @PatchMapping("/{idCoupon}/status")
    @Operation(summary = "Mudar status do Cupom",
            description = "Este endpoint muda o status de um cupom!")
    @ResponseStatus(HttpStatus.OK)
    void alterarStatusDoCupom(@PathVariable UUID idCoupon);
}
