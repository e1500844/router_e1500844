package fi.puv.juma.router.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fi.puv.juma.router.model.Wifi;

public interface WifiRepository extends CrudRepository<Wifi, Integer>{
	List<Wifi> findById(int id);
}
