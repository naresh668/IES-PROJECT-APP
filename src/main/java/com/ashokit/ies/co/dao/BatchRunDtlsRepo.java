package com.ashokit.ies.co.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.co.entity.BatchRunDtlsEntity;

@Repository
public interface BatchRunDtlsRepo extends JpaRepository<BatchRunDtlsEntity,Serializable> {

}
