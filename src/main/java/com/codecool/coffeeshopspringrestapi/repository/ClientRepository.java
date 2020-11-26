package com.codecool.coffeeshopspringrestapi.repository;

import com.codecool.coffeeshopspringrestapi.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
