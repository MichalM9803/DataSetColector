package com.mmencfel.dataSetColector.controller;


import com.mmencfel.dataSetColector.model.RecordEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {
    private static final String MESSAGE_SUCCESSFULLY = "ZAPISANO NOWE ZDANIE";

    @PostMapping("/record")
    ResponseEntity<String> saveNewRecord(@RequestBody RecordEntity recordToSave) {
        return ResponseEntity.status(HttpStatus.CREATED).body(MESSAGE_SUCCESSFULLY);
    }

}
