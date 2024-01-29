package com.projectz.projectz.formdata;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FormSubmitHandling {

    public void FormDataHandling(){

    }
    //@ModelAttribute("ProductImages") FileData files,@ModelAttribute("ProductInformation") ProductDetail info
    @PostMapping(value = "/submitform", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> handleFormdata(@ModelAttribute ProductDetail form){

        String url = "http://localhost:8080/submitdata";

        return ResponseEntity.ok("Data received successfully");
    }
}
