package com.example.MBankTest.service.base;

import java.util.List;

public interface ReadService<T> {
    T getById(Long id);

    List<T> findAll();
}
