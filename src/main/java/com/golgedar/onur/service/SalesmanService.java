package com.golgedar.onur.service;

import com.golgedar.onur.entity.Salesman;
import com.golgedar.onur.repository.SalesmanRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesmanService {

    @Autowired
    private SalesmanRepository salesmanRepository;

    @Transactional
    public Salesman save(Salesman salesman) {
        return salesmanRepository.save(salesman);
    }

    public List<Salesman> findAll() {
        return salesmanRepository.findAll();
    }
}
