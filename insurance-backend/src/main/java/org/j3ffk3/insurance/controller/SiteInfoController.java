package org.j3ffk3.insurance.controller;

import org.j3ffk3.insurance.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SiteInfoController {

	@Autowired
	SiteInfoService siteInfoService;

	@GetMapping(value = "/api-info", produces = "application/json; charset=UTF-8")
	public String getSiteInfo() {
		return siteInfoService.generateSiteInfo();
	}

}
