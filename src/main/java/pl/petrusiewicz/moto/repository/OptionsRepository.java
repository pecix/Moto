package pl.petrusiewicz.moto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.petrusiewicz.moto.model.Options;

@Repository
public interface OptionsRepository extends CrudRepository<Options, Integer> {

    Options findByAttributeAndCode(String attribute, String code);

}
