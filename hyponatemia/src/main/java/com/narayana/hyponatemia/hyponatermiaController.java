package com.narayana.hyponatemia;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hyponatermiaController {
	@Autowired
	hypotermiaRepository hypotermiarepository;
	
	protected Logger logger = Logger
			.getLogger(hyponatermiaController.class.getName());
	
	@RequestMapping("/hyponatemia/{serumSodium}")
	public String hyponatemia(@PathVariable("serumSodium") String serumSodium) {
		logger.info("accounts-changed byId() invoked: " + serumSodium);
		String retVal = hypotermiarepository.gethyponatemia(serumSodium);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
