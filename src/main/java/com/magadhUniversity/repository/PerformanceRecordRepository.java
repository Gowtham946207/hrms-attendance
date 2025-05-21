package com.magadhUniversity.repository;

import com.magadhUniversity.model.PerformanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for PerformanceRecord entities.
 */
@Repository
public interface PerformanceRecordRepository extends JpaRepository<PerformanceRecord, Long> {

    /**
     * Finds performance records by the employee's ID.
     *
     * @param employeeId the ID of the employee
     * @return a list of performance records for the specified employee
     */
    List<PerformanceRecord> findByEmployeeId(Long employeeId);
}
