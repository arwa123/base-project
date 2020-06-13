package com.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.Entity1;


@Repository
public interface Repository1 extends JpaRepository<Entity1, Long> {

}
