package com.mmencfel.dataSetColector.repository;

import com.mmencfel.dataSetColector.model.RecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity, Long> {
    @Query("SELECT r.sentence FROM RecordEntity r where r.sentenceClass in :classList")
    List<String> getAllSentenceByFilter(@Param("classList") Set<Integer> classList);
}
