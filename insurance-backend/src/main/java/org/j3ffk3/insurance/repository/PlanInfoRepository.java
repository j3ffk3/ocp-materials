package org.j3ffk3.insurance.repository;

import org.j3ffk3.insurance.entity.PlanInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanInfoRepository extends CrudRepository<PlanInfo, Long> {

}
