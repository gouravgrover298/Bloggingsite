package com.example.controller;

import com.example.model.Report;
import com.example.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping
    public ResponseEntity<String> reportPost(@RequestBody Report report) {
        reportService.reportPost(report);
        return ResponseEntity.ok("Report submitted successfully");
    }
}
