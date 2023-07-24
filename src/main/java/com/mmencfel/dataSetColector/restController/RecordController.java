package com.mmencfel.dataSetColector.restController;


import com.mmencfel.dataSetColector.filter.Filters;
import com.mmencfel.dataSetColector.model.RecordEntity;
import com.mmencfel.dataSetColector.service.RecordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordController {
    private static final String MESSAGE_SUCCESSFULLY = "ZAPISANO NOWE ZDANIE";
    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/record")
    ResponseEntity<List<String>> getAllSentences(@RequestParam(name = "filter") Filters param){
        List<String> result = recordService.getAllSentences(param);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/record")
    ResponseEntity<String> saveNewRecord(@RequestBody RecordEntity recordToSave) {
        recordService.addNewRecord(recordToSave);
        return ResponseEntity.status(HttpStatus.CREATED).body(MESSAGE_SUCCESSFULLY);
    }

}
