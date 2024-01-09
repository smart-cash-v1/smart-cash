package com.dev.smartcash.Companie.application.service;

import com.dev.smartcash.Companie.application.api.CompanieRequest;
import com.dev.smartcash.Companie.application.api.CompanieResponse;

public interface CompanieService {
    CompanieResponse cadastraCompanie(CompanieRequest companieRequest);
}
