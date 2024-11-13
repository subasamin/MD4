package com.example.testmodule4.service;

import com.example.testmodule4.repository.IOrderRepository;
import com.example.testmodule4.model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private IOrderRepository iOrderRepository;

    public List<Order> findByDateBetween(Date startDate, Date endDate){
        return iOrderRepository.findByDateBetween(startDate,endDate);
    }
    public List<OderDTO> getTopDonHangs(int limit) {
        return iOrderRepository.findAll()
                .stream()
                .map(oder -> {
                    // Tính tổng tiền
                    double price = Double.parseDouble(oder.getProduct().getPrice());
                    double total = price * oder.getQuantity();
                    return new OderDTO(
                            oder.getId(),
                            oder.getProduct().getName(),
                            oder.getProduct().getPrice(),
                            oder.getProduct().getCategory().getName(),
                            oder.getDatePrice(),
                            oder.getQuantity(),
                            total
                    );
                })
                .sorted((d1, d2) -> Double.compare(d2.getTotalPrice(), d1.getTotalPrice()))
                .limit(limit)
                .toList();
    }
}
