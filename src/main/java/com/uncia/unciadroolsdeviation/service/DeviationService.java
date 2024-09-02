package com.uncia.unciadroolsdeviation.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncia.unciadroolsdeviation.model.Participant;
import com.uncia.unciadroolsdeviation.model.Rate;

@Service
public class DeviationService {

	@Autowired
	private KieContainer kieContainer;

	public Rate getRate(Participant applicantRequest) {
		Rate rate = new Rate();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.setGlobal("rate", rate);
//		kieSession.insert(rate);
		kieSession.insert(applicantRequest);
		kieSession.fireAllRules();
		kieSession.dispose();
		return rate;
	}
}