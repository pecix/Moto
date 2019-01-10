package pl.petrusiewicz.moto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.petrusiewicz.moto.model.Product;
import pl.petrusiewicz.moto.model.SimpleProduct;

@Service
public class ProductService {

    @Autowired
    AttributesService attributesService;
    @Autowired
    OptionsService optionsService;

    public Product get(String code, String attribute) {
        Product product = new Product();
        product.setAttributes(attributesService.findByCode(code));
        product.setOptions(optionsService.findByAttributeAndCode(code, attribute));
        return product;
    }

    public SimpleProduct getLabel(String label, String code, String attribute) {
        Product product = get(code, attribute);
        SimpleProduct simpleProduct = new SimpleProduct();
        if (label.equalsIgnoreCase("it_IT")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getIt_IT());
            simpleProduct.setOptions(product.getOptions().getIt_IT());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("en_GB")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getEn_GB());
            simpleProduct.setOptions(product.getOptions().getEn_GB());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("pl_PL")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getPl_PL());
            simpleProduct.setOptions(product.getOptions().getPl_PL());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("nl_NL")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getNl_NL());
            simpleProduct.setOptions(product.getOptions().getNl_NL());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("nl_BE")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getNl_BE());
            simpleProduct.setOptions(product.getOptions().getNl_BE());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("nb_NO")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getNb_NO());
            simpleProduct.setOptions(product.getOptions().getNb_NO());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("fi_FI")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getFi_FI());
            simpleProduct.setOptions(product.getOptions().getFi_FI());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("en_US")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getEn_US());
            simpleProduct.setOptions(product.getOptions().getEn_US());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("es_ES")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getEs_ES());
            simpleProduct.setOptions(product.getOptions().getEs_ES());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("de_DE")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getDe_DE());
            simpleProduct.setOptions(product.getOptions().getDe_DE());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("de_CH")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getDe_CH());
            simpleProduct.setOptions(product.getOptions().getDe_CH());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("de_AT")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getDe_AT());
            simpleProduct.setOptions(product.getOptions().getDe_AT());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("da_DK")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getDa_DK());
            simpleProduct.setOptions(product.getOptions().getDa_DK());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("fr_FR")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getFr_FR());
            simpleProduct.setOptions(product.getOptions().getFr_FR());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("sv_SE")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getSv_SE());
            simpleProduct.setOptions(product.getOptions().getSv_SE());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("cs_CZ")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getCs_CZ());
            simpleProduct.setOptions(product.getOptions().getCs_CZ());
            return simpleProduct;
        } else if (label.equalsIgnoreCase("en_IE")) {
            simpleProduct.setLabel(label);
            simpleProduct.setAttributes(product.getAttributes().getEn_IE());
            simpleProduct.setOptions(product.getOptions().getEn_IE());
            return simpleProduct;
        }
        return null;
    }
}
