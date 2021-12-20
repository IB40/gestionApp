package com.gestionApp.gestionAutoApprenant.service;

import com.gestionApp.gestionAutoApprenant.model.Apprenant;
import com.gestionApp.gestionAutoApprenant.repository.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApprenantServiceImpl implements ApprenantService{
    @Autowired
    private ApprenantRepository apprenantRepository;
    @Override
    public Apprenant save(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    @Override
    public List<Apprenant> listeApprenant() {
        return apprenantRepository.findAll();
    }

    @Override
    public Apprenant apprenantById(Integer id) {
        return apprenantRepository.findById(id).get();
    }

    @Override
    public Apprenant update(Integer id, Apprenant apprenant) {
        Apprenant APP = apprenantRepository.findById(id).get();
        APP.setPrenom(apprenant.getPrenom());
        APP.setNom(apprenant.getNom());
        APP.setEmail(apprenant.getEmail());
        APP.setNumero(apprenant.getNumero());
        return apprenantRepository.save(APP);

    }

    @Override
    public void delete(Integer id) {
        apprenantRepository.deleteById(id);

    }

    @Override
    public List<Apprenant> listByGroup() {
        return null;
    }
}
