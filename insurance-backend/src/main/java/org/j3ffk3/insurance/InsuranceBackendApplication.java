package org.j3ffk3.insurance;

import javax.annotation.PostConstruct;

import org.j3ffk3.insurance.entity.PlanInfo;
import org.j3ffk3.insurance.repository.PlanInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsuranceBackendApplication {
	@Autowired
	PlanInfoRepository planInfoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(InsuranceBackendApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		planInfoRepository.save(new PlanInfo("LF001", "AA人壽-幸福壽險", "壽險", "低保費就能擁有高保障"));
		planInfoRepository.save(new PlanInfo("IPA01", "BB人壽-全能意外", "意外險", "依據健保定義之重大傷病為理賠依據"));
		planInfoRepository.save(new PlanInfo("HL001", "CC人壽-保證陪", "健康醫療保險", "兼具壽險與重大傷病保障"));
		planInfoRepository.save(new PlanInfo("IN001", "DD人壽-發財險", "投資型保險", "主要投資標的為股票與貴金屬"));
		planInfoRepository.save(new PlanInfo("AN001", "EE人壽-樂領年金", "年金險", "享有滿期金，回饋年繳應繳保險費總額之10%"));
		planInfoRepository.save(new PlanInfo("LF002", "FF人壽-小額終老", "壽險", "最高承保至86歲"));
		planInfoRepository.save(new PlanInfo("IPA02", "GG人壽-保平安", "意外險", "保障終身"));
		planInfoRepository.save(new PlanInfo("HL002", "HH人壽-超健康", "健康醫療保險", "無理賠紀錄每年回饋一筆定額回饋金"));
		planInfoRepository.save(new PlanInfo("IN002", "II人壽-包你發", "投資型保險", "主要投資標的為美元外匯與債券"));
		planInfoRepository.save(new PlanInfo("AN002", "JJ人壽-領到飽", "年金險", "享有滿期金，回饋年繳應繳保險費總額之20%"));
	}

}
