package com.example.testmodule4.controller;

import com.example.testmodule4.service.OderDTO;
import com.example.testmodule4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public String showDonHangPage(Model model) {
        model.addAttribute("donHangList", orderService.getTopDonHangs(10));
        return "Order";
    }

    @GetMapping("/order/filter")
    public String filterDonHang(
            @RequestParam("startDate") String startDateStr,
            @RequestParam("endDate") String endDateStr,
            @RequestParam("limit") int limit,
            Model model) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = sdf.parse(startDateStr);
            Date endDate = sdf.parse(endDateStr);
            List<OderDTO> donHangList = orderService.getTopDonHangs(limit);

            model.addAttribute("donHangList", donHangList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Order";
    }
}
