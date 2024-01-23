package com.dev.smartcash.Produto.infra;

import com.dev.smartcash.Produto.domain.ProdutoUsado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoUsadoSpringDataJPARepository extends JpaRepository<ProdutoUsado, UUID> {
}
