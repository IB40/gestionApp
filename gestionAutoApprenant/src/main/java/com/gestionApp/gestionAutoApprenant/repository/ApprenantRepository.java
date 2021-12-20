package com.gestionApp.gestionAutoApprenant.repository;

import com.gestionApp.gestionAutoApprenant.model.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ApprenantRepository extends JpaRepository<Apprenant,Integer> {
}
