package fi.puv.juma.router.controller;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fi.puv.juma.router.model.Wifi;
import fi.puv.juma.router.repository.WifiRepository;

@RestController
public class WifiController {
	@Autowired
	private WifiRepository repository;
	private static final Logger log = LoggerFactory.getLogger(WifiController.class);

	// chrome-extension://bljmokabgbdkoefbmccaeficehkmlnao/RestClient.html#RequestPlace:default
	// {"crypt":0,"flag":0,"iface_":"wlan0","misc":382,"missedbeacon":0,"nwid":0,"qlevel":-62,"qlink":48,"retry":1,"snr":-256,"status":"0000","timestamp":1488736842000,"we22":null}

	@RequestMapping("/test")
	public String test(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "{\"id\":\"hello\"}";
	}

	@RequestMapping(value = "/wifi", method = RequestMethod.GET)
	public Wifi get(@RequestParam(value = "id", defaultValue = "2") int id) {
		return repository.findOne(id);
	}

	@RequestMapping(value = "/wifi", method = RequestMethod.POST)
	public @ResponseBody Wifi addWifi(@RequestBody Wifi jsonWifi) {
		repository.save(jsonWifi);
		return jsonWifi;
	}

	@RequestMapping(value = "/wifi", method = RequestMethod.DELETE)
	public void deleteWifi(@RequestBody Wifi jsonWifi) {
		repository.delete(jsonWifi);
		// do business logic
	}

	@RequestMapping(value = "/wifi", method = RequestMethod.PUT)
	public @ResponseBody Wifi updateWifi(@RequestBody Wifi jsonWifi) {
		repository.save(jsonWifi);
		return jsonWifi;
	}
	
	@RequestMapping(value = "/wifi/all", method = RequestMethod.GET)
	public Iterable<Wifi> get() {
		return repository.findAll();
	}

}
