package com.magadhUniversity.service;

import com.magadhUniversity.model.PerformanceRecord;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Service interface for handling operations related to performance records.
 */
public interface PerformanceRecordService {

    PerformanceRecord createPerformanceRecord(PerformanceRecord performanceRecord);

    List<PerformanceRecord> getAllPerformanceRecords();

    List<PerformanceRecord> getPerformanceRecords(Long employeeId);

    PerformanceRecord getPerformanceRecordById(Long id);

    void savePerformanceRecord(PerformanceRecord performanceRecord);

    void deletePerformanceRecordById(Long id);

    void createPerformanceRecords(Model model);

    void updatePerformanceRecord(Long id, Long employeeId, String date, String details, int rating);

    void deletePerformanceRecord(Long id);
}
