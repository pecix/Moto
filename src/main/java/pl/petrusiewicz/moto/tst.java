package pl.petrusiewicz.moto;

import org.springframework.beans.factory.annotation.Autowired;
import pl.petrusiewicz.moto.loader.AttributesLoader;
import pl.petrusiewicz.moto.loader.OptionsLoader;
import pl.petrusiewicz.moto.model.Attributes;
import pl.petrusiewicz.moto.model.Options;
import pl.petrusiewicz.moto.repository.AttributesRepository;

import java.io.File;
import java.util.List;
import java.util.Optional;

public class tst {
    public static void main(String[] args) {


        File file = new File("src\\main\\resources\\attributes.csv");
        File file2 = new File("src\\main\\resources\\options.csv");
        List<Attributes> attributes = AttributesLoader.getAttributesFromFile(file);
        List<Options> options = OptionsLoader.getOptionsFromFile(file2);
        for (Attributes attribute : attributes) {
            System.out.println(attribute);

        }
        System.out.println();
        for (Options option : options) {
            System.out.println(option);
        }

    }
}
