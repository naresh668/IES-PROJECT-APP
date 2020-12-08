package com.ashokit.ies.dc.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.dc.entity.DcCasesEntity;

public interface DcCaseRepository extends JpaRepository<DcCasesEntity,Serializable> {

}
