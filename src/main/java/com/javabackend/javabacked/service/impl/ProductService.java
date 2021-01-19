package com.javabackend.javabacked.service.impl;


import com.javabackend.javabacked.model.ProductOB;
import com.javabackend.javabacked.repository.ProductOBResprository;
import com.javabackend.javabacked.service.IProductOBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductOBService {

    @Autowired
    private ProductOBResprository obResprository;

    @Override
    public List<ProductOB> findAll() {
        return obResprository.findAll();
    }
}
