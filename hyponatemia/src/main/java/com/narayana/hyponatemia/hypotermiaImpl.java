package com.narayana.hyponatemia;

import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

@Repository
public class hypotermiaImpl implements hypotermiaRepository {
	protected Logger logger = Logger
			.getLogger(hypotermiaImpl.class.getName());

	public String gethyponatemia(String serumSodium) {
		// TODO Auto-generated method stub
				logger.info("hypotermiaImpl byId() invoked: " + serumSodium);
				//Logger.getLogger(StubAccountRepository.class).info("Pradeep: " + serumSodium);
			if(Integer.parseInt(serumSodium)<135) {
				logger.info("hypotermiaImpl byId() invoked: " + serumSodium);
				//Logger.getLogger(StubAccountRepository.class).info("Pradeep1: " + serumSodium);
				return "hyponatemia";
					}
			else {
				logger.info("hypotermiaImpl byId() invoked: " + serumSodium);
			//	Logger.getLogger(StubAccountRepository.class).info("Pradeep2: " + serumSodium);
				return "nonhyponatemia";
			}
	}

}