package fi.puv.juma.router.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fi.puv.juma.router.model.Upstream;

public interface UpstreamRepository extends CrudRepository<Upstream, Integer>{
	List<Upstream> findById(int id);
}