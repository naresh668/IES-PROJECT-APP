package com.ashokit.ies.ed.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.ed.entity.EligibilityDetailsEntity;




@Repository
public interface EligibilityDetailsRepo extends JpaRepository<EligibilityDetailsEntity, Serializable> {

}
