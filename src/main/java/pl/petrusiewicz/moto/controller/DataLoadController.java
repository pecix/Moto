package pl.petrusiewicz.moto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.petrusiewicz.moto.service.AttributesService;
import pl.petrusiewicz.moto.service.OptionsService;
import pl.petrusiewicz.moto.service.ProductService;

@RestController
@RequestMapping("/data")
public class DataLoadController {

    @Autowired
    AttributesService attributesService;
    @Autowired
    OptionsService optionsService;
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity loadData(){
        attributesService.addToDbFromFile();
        optionsService.addToDbFromFile();
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/{code}/{attribute}")
    public ResponseEntity get(@PathVariable String code, @PathVariable String attribute){
        return ResponseEntity.ok().body(productService.get(code, attribute));
    }

    @GetMapping("/{label}/{code}/{attribute}")
    public ResponseEntity getLabel(@PathVariable String label, @PathVariable String code, @PathVariable String attribute){
        return ResponseEntity.ok().body(productService.getLabel(label, code, attribute));
    }
}
