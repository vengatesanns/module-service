package com.hackpro.moduleservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackpro.moduleservice.entity.ModuleInfo;
import com.hackpro.moduleservice.service.ModuleService;

@RestController
@RequestMapping("/home/module")
public class ModuleController {
	
	@Autowired
	private ModuleService moduleService;
	
	@Autowired
	private Environment environment;
	
	
	@PostMapping("/saveModules")
	public void saveModulesInfo(@RequestBody ModuleInfo modules)
	{
		moduleService.saveModuleInfo(modules);
	}

	
	@GetMapping("/getAllModules")
	public List<ModuleInfo> getModulesList()
	{
		return moduleService.getAllModules();
	}

	
	@GetMapping("/findByModuleId/{id}")
	public ModuleInfo findByModuleId(@PathVariable("id") long id)
	{
		ModuleInfo moduleInfo = moduleService.findByModuleId(id);
		moduleInfo.setPortNo(environment.getProperty("local.server.port"));
		return moduleInfo;
	}
}
