package com.codecool.coffeeshopspringrestapi.repository;

import com.codecool.coffeeshopspringrestapi.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findAllByOrderByLastNameAsc(Pageable page);

    @Query("select c from Client c where c.firstName = ?1")
    List<Client> findAllByFirstName(String firstName);


}

