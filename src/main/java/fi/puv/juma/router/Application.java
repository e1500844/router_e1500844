package fi.puv.juma.router;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import SwaggerConfig.SwaggerConfig;
import fi.puv.juma.router.model.Wifi;
import fi.puv.juma.router.repository.WifiRepository;

//Sovellus käynnistetään tästä applikaationa. 
//Sovellus käynnistää tomcat palvelimen oletuksena porttiin localhost:8080
/*Kun sovelluksen käynnistää se etsii
 * 
 */
@SpringBootApplication
@Import (SwaggerConfig.class)
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
}