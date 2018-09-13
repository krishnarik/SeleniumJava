package Part2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDmo {
	
	private static Logger log = LogManager.getLogger(log4jDmo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		log.debug("Log4j debug message test.");
		log.info("Log4j info message test.");
		log.warn("Log4j warn message test.");
		log.error("Log4j error message test.");
		log.fatal("Log4j fatal message test.");

	}

}
