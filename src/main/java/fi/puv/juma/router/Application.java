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


	@Bean
	public CommandLineRunner demo(WifiRepository repository) {
		return (args) -> {
			Wifi w = new Wifi();
			w.setCrypt(1);
			Instant instant = Instant.now(); //fix timezone
			ZoneId zoneId = ZoneId.of("Europe/Helsinki");
			ZonedDateTime zdt = ZonedDateTime.ofInstant( instant , zoneId );
			w.setTimestamp(new Timestamp(zdt.toInstant().getEpochSecond() * 1000L));	  			
			repository.save(w);
			
			
			/*			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Customer customer = repository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (Customer bauer : repository.findByLastName("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");
			*/
		};
	}
	
}