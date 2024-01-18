package com.dev.smartcash.Coupon.domain;

import com.dev.smartcash.Coupon.application.api.CouponRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NotNull
    @Size(min = 10, max = 350, message = "O campo deve ter entre 10 e 350 caracteres")
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
