package com.gilded.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gilded.model.Receipt;
import com.gilded.service.GildedService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/gilded")
public class GildedController {
    @Autowired
    GildedService gildedService;

    @GetMapping("/receipts")
    public List<Receipt> getReceipts() {
        System.out.println(gildedService.getReceipts());
        return gildedService.getReceipts();
    }
    
    @PostMapping("/receipts")
    public Receipt postReceipt(@RequestBody Receipt receipt) {
        return gildedService.saveReceipt(receipt);
    }

    @DeleteMapping("/receipts/{id}")
    public void deleteReceipt(@PathVariable long id) {
        gildedService.deleteReceipt(id);
    }

    @PutMapping("/receipts")
    public void updateReceipt(@RequestBody Receipt receipt) {
        gildedService.updateReceipt(receipt);
    }
}
