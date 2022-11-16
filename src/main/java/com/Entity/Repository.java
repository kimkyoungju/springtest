package com.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

public interface Repository extends JpaRepository<MemberEntityTest,Integer> {

}
