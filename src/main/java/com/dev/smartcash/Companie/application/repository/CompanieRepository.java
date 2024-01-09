package com.dev.smartcash.Companie.application.repository;

import com.dev.smartcash.Companie.application.api.CompanieApi;
import com.dev.smartcash.Companie.domain.Companie;

public interface CompanieRepository {
    Companie salva(Companie companie);
}
