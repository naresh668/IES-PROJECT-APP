package com.ashokit.ies.ar.dao;

import java.io.Serializable;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.ies.ar.entity.UserEntity;

public interface UserRepository    extends JpaRepository<UserEntity, Serializable>{


	
	

}
