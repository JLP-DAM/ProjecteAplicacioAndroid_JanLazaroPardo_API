package com.gilded.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.gilded.model.Receipt;
import com.gilded.model.User;
import com.gilded.repository.ReceiptRepository;
import com.gilded.repository.UserRepository;

@Service
public class GildedService {
    @Autowired
    ReceiptRepository receiptRepository;

    @Autowired
    UserRepository userRepository;

    public List<Receipt> getReceipts() {
        return receiptRepository.findAll();
    }

    public Receipt postReceipt(Receipt receipt) {
        return receiptRepository.save(receipt);
    }

    public void deleteReceipt(long id) {
        receiptRepository.deleteById(id);
    }

    public void updateReceipt(Receipt receipt) {
        receiptRepository.save(receipt);
    }

    public User getUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    public User postUser(User user) {
        return userRepository.save(user);
    }
}
