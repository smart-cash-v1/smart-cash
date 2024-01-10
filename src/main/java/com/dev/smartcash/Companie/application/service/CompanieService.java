package com.dev.smartcash.Companie.application.service;

import com.dev.smartcash.Companie.application.api.CompanieListResponse;
import com.dev.smartcash.Companie.application.api.CompanieRequest;
import com.dev.smartcash.Companie.application.api.CompanieResponse;

import java.util.List;

public interface CompanieService {
    CompanieResponse cadastraCompanie(CompanieRequest companieRequest);

    List<CompanieListResponse> buscaTodasCompanie();
}
