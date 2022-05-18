package com.example.MBankTest.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum Result {
    OK(0L, "Успешно проведен"),
    SERVICE_NOT_AVAILABLE(1L, "Услуга не доступна"),
    INVALID_DETAILS(2L, "Неверные параметры"),
    WRONG_LOGIN_OR_PASSWORD(3L, "Неверный логин/пароль"),
    NOT_UNIQUE_ID(4L, "ID не уникальный"),
    FAIL_PAYMENT(5L, "Ошибка при проведении"),
    UNKNOWN_ERROR(6L, "Неизвестная ошибка при проведении"),
    AMOUNT_GREATER_ZERO(7L, "Не хватает средств на счете"),
    SUPPLIER_ERROR(8L, "Нет такого поставщика");

    Long errorId;

    String description;
}
