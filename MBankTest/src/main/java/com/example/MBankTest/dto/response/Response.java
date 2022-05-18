package com.example.MBankTest.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlRootElement(name = "response")
public class Response {
    String idPayment;

    Long code;

    String description;
}
