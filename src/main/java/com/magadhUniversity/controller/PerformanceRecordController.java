package com.magadhUniversity.controller;

import com.magadhUniversity.model.PerformanceRecord;
import com.magadhUniversity.service.PerformanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for handling performance record related requests.
 */
@Controller
@RequestMapping("/performance") //defines the controller and base URL path
public class PerformanceRecordController {

    @Autowired  //combine the service layer to the controller
    private PerformanceRecordService performanceRecordService;

    /**
     * Displays the list of performance records.
     * @param model the model to add attributes to
     * @return the name of the view to render
     */
    @GetMapping
    //get and post mapping used for handles the specific HTTP get and post request
    public String showPerformancePage(Model model) {
         List<PerformanceRecord> performanceRecords = performanceRecordService.getAllPerformanceRecords();
         //we are using assignment operator t set the variable
        model.addAttribute("performanceRecords", performanceRecords);
        //name of the attribute and then value of the attribute
        return "list_performance";
    }

    /**
     * Displays the form to create a new performance record.
     * @param model the model to add attributes to
     * @return the name of the view to render
     */
    @GetMapping("/create")
    public String createPerformanceRecordForm(Model model) {
        model.addAttribute("performanceRecord", new PerformanceRecord());
        return "create_performance";
    }

    /**
     * Handles the creation of a new performance record.
     * @param performanceRecord the performance record to create
     * @return a redirect URL to the performance page
     */
    @PostMapping("/create")
    public String createPerformanceRecord(@ModelAttribute PerformanceRecord performanceRecord) {
        performanceRecordService.savePerformanceRecord(performanceRecord);
        return "redirect:/performance";
    }
// @ModelAttribute is used to request parameters to a model object and pass it to the view.

    /**
     * Displays performance records for a specific employee.
     * @param id the ID of the employee
     * @param model the model to add attributes to
     * @return the name of the view to render
     */
    @GetMapping("/view/{id}")
    public String viewPerformanceRecord(@PathVariable Long id, Model model) {
        PerformanceRecord performanceRecord = performanceRecordService.getPerformanceRecordById(id);
        model.addAttribute("performance", performanceRecord);
        return "view_performance";
    }


    /**
     * Displays the form to update a performance record.
     * @param id the ID of the performance record to update
     * @param model the model to add attributes to
     * @return the name of the view to render
     */
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        PerformanceRecord performanceRecord = performanceRecordService.getPerformanceRecordById(id);
        model.addAttribute("performance", performanceRecord);
        return "update_performance";
    }
    @PostMapping("/update/{id}")
    public String updatePerformanceRecord(@PathVariable Long id, @ModelAttribute PerformanceRecord performanceRecord) {
        performanceRecordService.updatePerformanceRecord(id, performanceRecord.getEmployeeId(), performanceRecord.getDate().toString(), performanceRecord.getDetails(), performanceRecord.getRating());
        return "redirect:/performance";
    }
// @PathVariable is used to extract values from the URl of a request

    /**
     * Handles the deletion of a performance record.
     * @param id the ID of the performance record to delete
     * @return a redirect URL to the performance page
     */
    @PostMapping("/delete/{id}")
    public String deletePerformanceRecord(@PathVariable Long id) {
        performanceRecordService.deletePerformanceRecord(id);
        return "redirect:/performance";
    }
}
