package pl.petrusiewicz.moto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.petrusiewicz.moto.loader.OptionsLoader;
import pl.petrusiewicz.moto.model.Options;
import pl.petrusiewicz.moto.repository.OptionsRepository;

import java.io.File;
import java.util.List;

@Service
public class OptionsService {

    @Autowired
    OptionsRepository repository;

    public void addToDbFromFile(){
        File file = new File("src\\main\\resources\\options.csv");
        List<Options> options = OptionsLoader.getOptionsFromFile(file);
        repository.saveAll(options);
    }
}
