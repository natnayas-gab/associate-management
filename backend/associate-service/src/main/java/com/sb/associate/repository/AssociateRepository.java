package com.sb.associate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.associate.entity.Associate;

@Repository
public interface AssociateRepository extends JpaRepository<Associate, Long> {

}
