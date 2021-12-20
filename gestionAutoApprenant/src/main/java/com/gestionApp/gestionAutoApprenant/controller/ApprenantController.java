package com.gestionApp.gestionAutoApprenant.controller;


import com.gestionApp.gestionAutoApprenant.model.Apprenant;
import com.gestionApp.gestionAutoApprenant.service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/odc")
public class ApprenantController {
    @Autowired
    public ApprenantService apprenantService;
    @PostMapping(value = "/saveApprenant")
    public Apprenant save(@RequestBody Apprenant apprenant) {
        return apprenantService.save(apprenant);
    }

    @GetMapping(value ="/listeApprenant")
    public List<Apprenant> listeApprenant() {
        return apprenantService.listeApprenant();
    }

    @DeleteMapping(value = "/deleteApprenant/{id}")
    public void delete(@PathVariable("id") Integer id) {
        apprenantService.delete(id);
    }

    @PutMapping(value ="/updateApprenant/{id}")
    public Apprenant update(@PathVariable("id") Integer id, @RequestBody Apprenant apprenant) {
        return apprenantService.update(id, apprenant);
    }

    @GetMapping(value ="/apprenantById/{id}")
    public Apprenant apprenantById(@PathVariable("id") Integer id) {
        return apprenantService.apprenantById(id);
    }



}
