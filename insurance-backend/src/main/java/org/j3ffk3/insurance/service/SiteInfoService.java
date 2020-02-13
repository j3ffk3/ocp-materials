package org.j3ffk3.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class SiteInfoService {

	@Autowired
	private Environment env;

	public String generateSiteInfo() {
		return env.getProperty("AUTHOR") + " made this API, this is a mini insurance query API [you knows what is Image Change Trigger]";
	}
}
