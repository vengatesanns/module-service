package com.hackpro.moduleservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="modules_info")
public class ModuleInfo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long moduleId;
	
	private String moduleName;
	
	private String moduleDescription;
	
	private String reportingPerson;
	
	@Transient
	private String portNo;

	public long getModuleId() {
		return moduleId;
	}

	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleDescription() {
		return moduleDescription;
	}

	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}

	public String getReportingPerson() {
		return reportingPerson;
	}

	public void setReportingPerson(String reportingPerson) {
		this.reportingPerson = reportingPerson;
	}

	public String getPortNo() {
		return portNo;
	}

	public void setPortNo(String portNo) {
		this.portNo = portNo;
	}
	
	

}
