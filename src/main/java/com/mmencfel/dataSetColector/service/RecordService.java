package com.mmencfel.dataSetColector.service;

import com.mmencfel.dataSetColector.filter.Filters;
import com.mmencfel.dataSetColector.model.RecordEntity;
import com.mmencfel.dataSetColector.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RecordService {
    private final RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public List<String> getAllSentences(Filters param) {
        Set<Integer> classList = Filters.getClassList(param);
        return recordRepository.getAllSentenceByFilter(classList);
    }

    public void addNewRecord(RecordEntity recordEntity) {
        RecordEntity recordToSave = RecordValueMapper.map(recordEntity);
        recordRepository.save(recordToSave);
    }
}
