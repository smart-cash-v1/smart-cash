package com.dev.smartcash.Produto.infra;

import com.dev.smartcash.Coupon.application.repository.CouponRepository;
import com.dev.smartcash.Produto.application.repository.ProdutoUsadoRepository;
import com.dev.smartcash.Produto.domain.ProdutoUsado;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProdutoUsadoApplicationRepository implements ProdutoUsadoRepository {
    private final ProdutoUsadoSpringDataJPARepository produtoUsadoSpringDataJPARepository;

    @Override
    public ProdutoUsado salva(ProdutoUsado produtoUsado) {
        log.info("[inicia] ProdutoUsadoApplicationRepository - salva");
        produtoUsadoSpringDataJPARepository.save(produtoUsado);
        log.info("[finaliza] ProdutoUsadoApplicationRepository - salva");
        return produtoUsado;
    }
}
