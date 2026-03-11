package com.gilded.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilded.model.Receipt;
import com.gilded.repository.ReceiptRepository;

@Service
public class GildedService {
    @Autowired
    ReceiptRepository receiptRepository;

    public List<Receipt> getReceipts() {
        return receiptRepository.findAll();
    }

    public void saveReceipt(Receipt receipt) {
        receiptRepository.save(receipt);
    } 
}
