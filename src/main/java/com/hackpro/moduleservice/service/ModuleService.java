package com.hackpro.moduleservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackpro.moduleservice.entity.ModuleInfo;
import com.hackpro.moduleservice.repository.ModuleRepository;

@Service
@Transactional
public class ModuleService {
      
	@Autowired
	private ModuleRepository moduleRepo;
	
	public void saveModuleInfo(ModuleInfo tasks)
	{
		moduleRepo.save(tasks);	
	}
	
	public List<ModuleInfo> getAllModules()
	{
		return  moduleRepo.findAll();	
	}

	public ModuleInfo findByModuleId(long moduleId)
	{
		return  moduleRepo.findByModuleId(moduleId);
	}

}
