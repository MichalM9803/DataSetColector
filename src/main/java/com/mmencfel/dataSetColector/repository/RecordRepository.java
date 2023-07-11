package com.mmencfel.dataSetColector.repository;

import com.mmencfel.dataSetColector.model.RecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity, Long> {
}
