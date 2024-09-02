package com.uncia.unciadroolsdeviation.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeviationConfig {

//	private static final KieServices kieServices = KieServices.Factory.get();
//	private static final String RULES_CUSTOMER_RULES_DRL = "rules/deviation.drl";
//	 
//	   @Bean
//	     public KieContainer kieContainer() {
//	         KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//	         kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_CUSTOMER_RULES_DRL));
//	         KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
//	         kb.buildAll();
//	         KieModule kieModule = kb.getKieModule();
//	         KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//	         return kieContainer;
//	     }
	
	private static final KieServices kieServices = KieServices.Factory.get();
//	private static final String RULES_CUSTOMER_RULES_DRL = "rules/deviation.xlsx";
//	private static final String RULES_CUSTOMER_RULES_DRL = "rules/deviationNew.xlsx";
	private static final String RULES_CUSTOMER_RULES_DRL = "rules/deviation.drl";
	 
	   @Bean
	     public KieContainer kieContainer() {
	         KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
	         kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_CUSTOMER_RULES_DRL));
	         KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
	         kb.buildAll();
	         KieModule kieModule = kb.getKieModule();
	         KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//	         System.out.println(new DroolsBeanFactory().getDrlFromExcel("net/cloudburo/drools/rules/DroolsDiscount.xlsx"));
//	         System.out.println(new DroolsBeanFactory().getDrlFromExcel("rules/DroolsDiscount.xlsx"));
	         return kieContainer;
	     }
	   
}
