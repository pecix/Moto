package pl.petrusiewicz.moto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsRepository extends CrudRepository<OptionsRepository, Integer> {
}
