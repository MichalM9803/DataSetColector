package com.mmencfel.dataSetColector.service;

import com.mmencfel.dataSetColector.model.RecordEntity;
import com.mmencfel.dataSetColector.repository.RecordRepository;
import org.springframework.stereotype.Service;

@Service
public class RecordService {
    private final RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public void addNewRecord(RecordEntity recordEntity){
        RecordValueMapper.map(recordEntity);
        recordRepository.save(recordEntity);
    }
}
