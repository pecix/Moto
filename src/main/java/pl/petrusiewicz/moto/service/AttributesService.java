package pl.petrusiewicz.moto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.petrusiewicz.moto.loader.AttributesLoader;
import pl.petrusiewicz.moto.model.Attributes;
import pl.petrusiewicz.moto.repository.AttributesRepository;

import java.io.File;
import java.util.List;

@Service
public class AttributesService {

    @Autowired
    AttributesRepository repository;

    public void addToDbFromFile(){
        File file = new File("src\\main\\resources\\attributes.csv");
        List<Attributes> attributes = AttributesLoader.getAttributesFromFile(file);
        repository.saveAll(attributes);
    }
}
