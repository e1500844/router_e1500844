package fi.puv.juma.router.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fi.puv.juma.router.model.Upstream;
import fi.puv.juma.router.repository.UpstreamRepository;

@RestController
public class UpstreamController {
	@Autowired
	private UpstreamRepository repository;
	
	private static final Logger log = LoggerFactory.getLogger(UpstreamController.class);
	
    @RequestMapping(value = "/upstream", method = RequestMethod.GET)
    public Upstream get(@RequestParam(value="id", defaultValue="1") int id){
    	return repository.findOne(id);
    }
    
    @RequestMapping(value = "/upstream", method = RequestMethod.POST)
    public @ResponseBody Upstream addUpstream(@RequestBody Upstream jsonUpstream){
    	repository.save(jsonUpstream);
        return jsonUpstream;
    }
    
	@RequestMapping(value = "/upstream", method = RequestMethod.DELETE)
	public void deleteupstream(@RequestBody Upstream jsonUpstream) {
		repository.delete(jsonUpstream);
		// do business logic
	}

	@RequestMapping(value = "/upstream", method = RequestMethod.PUT)
	public @ResponseBody Upstream updateUpstream(@RequestBody Upstream jsonUpstream) {
		repository.save(jsonUpstream);
		return jsonUpstream;
	}
	
	@RequestMapping(value = "/upstream/all", method = RequestMethod.GET)
	public Iterable<Upstream> get() {
		return repository.findAll();
	}
    
}
