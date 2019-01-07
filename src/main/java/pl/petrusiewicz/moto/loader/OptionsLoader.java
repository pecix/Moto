package pl.petrusiewicz.moto.loader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import pl.petrusiewicz.moto.model.Attributes;
import pl.petrusiewicz.moto.model.Options;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OptionsLoader {

    public static List<Options> getOptionsFromFile(File file){
        List<Options> options = new ArrayList<>();
        try {
            LineIterator lineIterator = FileUtils.lineIterator(file);
            lineIterator.nextLine();
            while (lineIterator.hasNext()){
                String[] raw = lineIterator.nextLine().split(";");
                Options option = new Options();
                option.setCode(raw[0]);
                option.setEs_ES(raw[1]);
                option.setNl_NL(raw[2]);
                option.setNl_BE(raw[3]);
                option.setNb_NO(raw[4]);
                option.setIt_IT(raw[5]);
                option.setFr_FR(raw[6]);
                option.setFi_FI(raw[7]);
                option.setEn_US(raw[8]);
                option.setSv_SE(raw[9]);
                option.setEn_IE(raw[10]);
                option.setEn_GB(raw[11]);
                option.setDe_DE(raw[12]);
                option.setDe_CH(raw[13]);
                option.setDe_AT(raw[14]);
                option.setDa_DK(raw[15]);
                option.setCs_CZ(raw[16]);
                option.setPl_PL(raw[17]);
                option.setAttribute(raw[18]);
                option.setSort_order(raw[19]);
                options.add(option);
            }
        } catch (IOException e) {
            return options;
        }
        return options;
    }
}
