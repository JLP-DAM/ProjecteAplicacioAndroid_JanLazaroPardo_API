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

    public Receipt saveReceipt(Receipt receipt) {
        return receiptRepository.save(receipt);
    }

    public void deleteReceipt(long id) {
        receiptRepository.deleteById(id);
    }

    public void updateReceipt(Receipt receipt) {
        receiptRepository.save(receipt);
    }
}
