package com.demo.spring_boot_unit_test.dto;

/**
 * @author Mertcan Özarslan
 */
public record PersonDto(
        Integer personId,
        String personName,
        String personCity
) {
}
