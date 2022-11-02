package com.luv2code.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luv2code.springboot.cruddemo.entity.Employee;


/*
 * Podsetnik za Spring Data JPA:
 * 
 * Spring Data JPA ima vec predefinisane metode ( findAll, findById, save/merge, delete) i tehnicki za ovakve situacije nije potrebno da se pise bilo kakav DAO kod
 * 
 * Bice dovoljno samo proslediti objekat/ entity type i key/PK , takodje JpaRepository provajduje @Transactinal tako da se to moze skloniti iz metoda unutar Service
 * 
 */

//@RepositoryRestResource(path = "members") sad ce path biti localhost:8080/magic-api/members, imas objasnjeno u recap fajlu
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// to je to, ne mora nista vise da se pise, samo obrati paznju da je sve podeseno kako treba u Service-u :)

}
