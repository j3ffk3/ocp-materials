package org.j3ffk3.insurance.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SiteInfoServiceTest {

	@Autowired
	SiteInfoService siteInfoService;

	@Test
	void generateSiteInfoTest() {
		assertEquals(siteInfoService.generateSiteInfo().substring(5, 54),
				"made this API, this is a mini insurance query API");
	}
}
