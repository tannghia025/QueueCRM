package com.javabackend.javabacked.repository;


import com.javabackend.javabacked.model.ProductOB;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductOBResprository {
    public List<ProductOB> findAll() {

        List<ProductOB> list = new ArrayList<ProductOB>();
        list.add(new ProductOB(1, "Loa kéo Karaoke Dalton TS-15G600X 600W", 1, 8250000));
        list.add(new ProductOB(3, "Loa điện Karaoke Birici MX-700 450W", 1, 76000000));
        list.add(new ProductOB(5, "Loa Tháp Samsung MX-T70/XV", 1, 158500000));
        list.add(new ProductOB(7, "Loa kéo Karaoke Mobell K1501 800W", 1, 6650000));
        list.add(new ProductOB(2, "Samsung Smart TV QLED 4K 55\" QA55Q60T Mới 2020", 2, 17400000));
        list.add(new ProductOB(4, "Samsung Smart TV 4K 55\" UA55TU8100 Mới 2020", 2, 12900000));
        list.add(new ProductOB(6, "Samsung Smart TV 32\" UA32T4500 Mới 2020", 2, 6100000));
        list.add(new ProductOB(8, "Smart Tivi Samsung 32 inch UA32T4300", 2, 5450000));
        list.add(new ProductOB(10, "LG Smart TV 4K 49\" 49UM7400PTA", 2, 10490000));
        list.add(new ProductOB(9, "Toshiba Inverter 233 lít GR-A28VM(UKG1) Mới 2020", 3, 5890000));
        list.add(new ProductOB(11, "Aqua Inverter 186 lít AQR-T219FA(PB) Mới 2020", 3, 4990000));
        list.add(new ProductOB(13, "LG Inverter 393 lít GN-B422WB", 3, 7500000));
        list.add(new ProductOB(15, "Sharp Inverter 150 lít SJ-X176E-SL", 3, 4990000));
        list.add(new ProductOB(17, "Nồi cơm điện tử Kangaroo 1.8 lít KG595", 4, 1390000));
        list.add(new ProductOB(12, "Nồi cơm điện cao tần Midea 1.5 lít MB-HS4008", 4, 3990000));
        list.add(new ProductOB(14, "Nồi cơm nắp rời Delites 1.8 lít RC-10W003", 4, 430000));
        list.add(new ProductOB(16, "Nồi cơm nắp gài HappyCook 1.8 lít HCJ-1822", 4, 400000));
        list.add(new ProductOB(18, "Nồi cơm nắp gài Hommy 1.8 lít", 4, 488000));
        list.add(new ProductOB(19, "Điện thoại Samsung Galaxy S20+", 5, 2399000));
        list.add(new ProductOB(21, "Điện thoại Samsung Galaxy Note 20 Ultra 5G", 5, 21880000));
        list.add(new ProductOB(23, "Điện thoại Samsung Galaxy A21s (3GB/32GB)", 5, 5290000));
        list.add(new ProductOB(25, "Điện thoại Samsung Galaxy A51 (8GB/128GB)", 5, 5290000));
        list.add(new ProductOB(19, "Điện thoại Samsung Galaxy A31", 5, 6400000));
        return list;
    }

}
