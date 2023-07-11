package com.mmencfel.dataSetColector.service;

import com.mmencfel.dataSetColector.model.RecordEntity;
import com.mmencfel.dataSetColector.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {
    private final RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<String> getAllSentences(){
        return recordRepository.getAllSentence();
    }
    public void addNewRecord(RecordEntity recordEntity) {
        RecordEntity recordToSave = RecordValueMapper.map(recordEntity);
        recordRepository.save(recordToSave);
    }
}
