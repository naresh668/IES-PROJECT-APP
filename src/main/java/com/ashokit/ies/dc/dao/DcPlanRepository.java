package com.ashokit.ies.dc.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.dc.entity.DcCasesEntity;
import com.ashokit.ies.dc.entity.DcPlanEntity;

public interface DcPlanRepository extends JpaRepository<DcPlanEntity,Serializable> {

}
