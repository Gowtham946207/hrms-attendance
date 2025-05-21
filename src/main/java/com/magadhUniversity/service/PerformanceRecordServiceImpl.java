package com.magadhUniversity.service;

import com.magadhUniversity.model.PerformanceRecord;
import com.magadhUniversity.repository.PerformanceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of the PerformanceRecordService interface.
 */
@Service
public class PerformanceRecordServiceImpl implements PerformanceRecordService {

    @Autowired
    private PerformanceRecordRepository performanceRecordRepository;

    @Override
    public PerformanceRecord createPerformanceRecord(PerformanceRecord performanceRecord) {
        return performanceRecordRepository.save(performanceRecord);
    }

    @Override
    public List<PerformanceRecord> getAllPerformanceRecords() {
        return performanceRecordRepository.findAll();
    }

    @Override
    public List<PerformanceRecord> getPerformanceRecords(Long employeeId) {
        return performanceRecordRepository.findByEmployeeId(employeeId);
    }

    @Override
    public PerformanceRecord getPerformanceRecordById(Long id) {
        return performanceRecordRepository.findById(id).orElse(null);
    }

    @Override
    public void savePerformanceRecord(PerformanceRecord performanceRecord) {
        performanceRecordRepository.save(performanceRecord);
    }

    @Override
    public void deletePerformanceRecordById(Long id) {
        if (performanceRecordRepository.existsById(id)) {
            performanceRecordRepository.deleteById(id);
        } else {
            throw new RuntimeException("Performance record not found with ID: " + id);
        }
    }

    @Override
    public void createPerformanceRecords(Model model) {
        List<PerformanceRecord> records = performanceRecordRepository.findAll();
        model.addAttribute("performanceRecords", records);
    }

    @Override public void updatePerformanceRecord(Long id, Long employeeId, String date, String details, int rating)
    {
        PerformanceRecord performanceRecord = performanceRecordRepository.findById(id).orElse(null);
        if (performanceRecord != null) {
            performanceRecord.setEmployeeId(employeeId);
            performanceRecord.setDate(LocalDate.parse(date));
            performanceRecord.setDetails(details);
            performanceRecord.setRating(rating);
            performanceRecordRepository.save(performanceRecord);
        }
        else
        {
            throw new RuntimeException("Performance record not found with ID: " + id);
        }
    }

    @Override
    public void deletePerformanceRecord(Long id) {
        Optional<PerformanceRecord> performanceRecord = performanceRecordRepository.findById(id);
        if (performanceRecord.isPresent()) {
            performanceRecordRepository.deleteById(id);
        } else {
            throw new RuntimeException("Performance record not found with ID: " + id);
        }
    }
}
