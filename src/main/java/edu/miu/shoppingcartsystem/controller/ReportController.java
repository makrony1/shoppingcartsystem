package edu.miu.shoppingcartsystem.controller;

import edu.miu.shoppingcartsystem.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import edu.miu.shoppingcartsystem.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/reports")
@CrossOrigin
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping(path = "/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> downloadInvoice1() throws JRException, IOException {
        return reportService.downloadInvoice1();

    }
}
