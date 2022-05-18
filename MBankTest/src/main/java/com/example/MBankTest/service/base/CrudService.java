package com.example.MBankTest.service.base;

public interface CrudService<T> extends ReadService<T> {
    T saveOrUpdate(T t);

    T delete(Long id);
}
