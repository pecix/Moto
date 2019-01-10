package pl.petrusiewicz.moto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.petrusiewicz.moto.model.Attributes;

@Repository
public interface AttributesRepository extends CrudRepository<Attributes, Integer> {

    Attributes findByCode(String code);
}
