package com.dev.smartcash.Coupon.domain;

import com.dev.smartcash.Coupon.application.api.CouponRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCoupon", updatable = false, unique = true, nullable = false)
    private UUID idCoupon;

    @Column(columnDefinition = "uuid", name = "companie",  nullable = false)
    private UUID idCompanie;
    @NotBlank
    private String name;
    private String descricaoCoupon;
    @Enumerated(EnumType.STRING)
    private StatusFavorite status;

    public Coupon(CouponRequest couponRequest) {
        this.idCompanie = couponRequest.getIdCompanie();
        this.name = couponRequest.getName();
        this.descricaoCoupon = couponRequest.getDescricaoCoupon();
        this.status = StatusFavorite.NOT_SAVED;
    }

    public void setStatus(StatusFavorite newStatus) {
        this.status = newStatus;

    }
}
