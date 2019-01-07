package pl.petrusiewicz.moto.loader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import pl.petrusiewicz.moto.model.Attributes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AttributesLoader {

    public static List<Attributes> getAttributesFromFile(File file){
        List<Attributes> attributes = new ArrayList<>();
        try {
            LineIterator lineIterator = FileUtils.lineIterator(file);
            lineIterator.nextLine();
            while (lineIterator.hasNext()){
                String[] raw = lineIterator.nextLine().split(";");
                Attributes attribute = new Attributes();
                attribute.setCode(raw[0]);
                attribute.setIt_IT(raw[1]);
                attribute.setEn_GB(raw[2]);
                attribute.setEn_IE(raw[3]);
                attribute.setPl_PL(raw[4]);
                attribute.setNl_NL(raw[5]);
                attribute.setNl_BE(raw[6]);
                attribute.setNb_NO(raw[7]);
                attribute.setFi_FI(raw[8]);
                attribute.setEn_US(raw[9]);
                attribute.setEs_ES(raw[10]);
                attribute.setDe_DE(raw[11]);
                attribute.setDe_CH(raw[12]);
                attribute.setDe_AT(raw[13]);
                attribute.setDa_DK(raw[14]);
                attribute.setFr_FR(raw[15]);
                attribute.setSv_SE(raw[16]);
                attribute.setCs_CZ(raw[17]);
                attributes.add(attribute);
            }
        } catch (IOException e) {
            return attributes;
        }
        return attributes;
    }

}
