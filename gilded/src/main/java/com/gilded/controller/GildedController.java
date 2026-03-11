package com.gilded.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gilded.model.Receipt;
import com.gilded.service.GildedService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/gilded")
public class GildedController {
    @Autowired
    GildedService gildedService;

    @GetMapping("/gilded/receipts")
    public List<Receipt> getReceipts() {
        return gildedService.getReceipts();
    }
    
    @PostMapping("/gilded/receipts")
    public void postReceipt(@RequestBody Receipt receipt) {
        gildedService.saveReceipt(receipt);
    }
}
