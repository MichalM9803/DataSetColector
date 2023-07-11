package com.mmencfel.dataSetColector.repository;

import com.mmencfel.dataSetColector.model.RecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity, Long> {
    @Query("SELECT m.sentence FROM RecordEntity m")
    List<String> getAllSentence();
}
