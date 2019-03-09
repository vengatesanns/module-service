package com.hackpro.moduleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackpro.moduleservice.entity.ModuleInfo;

@Repository
public interface ModuleRepository extends JpaRepository<ModuleInfo,Long> {
	
	ModuleInfo findByModuleId(long id);

}
