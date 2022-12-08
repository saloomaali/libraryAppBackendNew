package com.NeST.libraryAppBackend1.dao;

import com.NeST.libraryAppBackend1.model.Register;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.servlet.Registration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegisterDao extends CrudRepository<Register, Integer> {

    @Query(value = "SELECT `id`, `address`, `adhar_card_no`, `confirm_password`, `dob`, `email_id`, `name`, `password`, `phn_no`, `pin_code`, `username` FROM `register` WHERE `username` = :username  AND `password` = :password",nativeQuery = true)
    List<Register> getUser(String username, String password);
}
