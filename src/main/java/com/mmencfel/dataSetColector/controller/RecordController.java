package com.mmencfel.dataSetColector.controller;


import com.mmencfel.dataSetColector.model.RecordEntity;
import com.mmencfel.dataSetColector.service.RecordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {
    private static final String MESSAGE_SUCCESSFULLY = "ZAPISANO NOWE ZDANIE";
    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @PostMapping("/record")
    ResponseEntity<String> saveNewRecord(@RequestBody RecordEntity recordToSave) {
        recordService.addNewRecord(recordToSave);
        return ResponseEntity.status(HttpStatus.CREATED).body(MESSAGE_SUCCESSFULLY);
    }

}
