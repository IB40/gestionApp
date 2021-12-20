package com.gestionApp.gestionAutoApprenant.service;

import com.gestionApp.gestionAutoApprenant.model.Apprenant;

import java.util.List;

public interface ApprenantService {

    Apprenant save(Apprenant apprenant);
    List<Apprenant> listeApprenant();
    Apprenant apprenantById(Integer id);
    Apprenant update(Integer id, Apprenant apprenant );
    void delete(Integer id);
    List<Apprenant> listByGroup();
}
