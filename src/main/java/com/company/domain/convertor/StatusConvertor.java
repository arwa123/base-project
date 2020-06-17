package com.company.domain.convertor;

import com.company.enums.Status;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class StatusConvertor implements AttributeConverter<Status, String> {


    @Override
    public String convertToDatabaseColumn(Status status) {

        return Status.getStringValue(status);
    }

    @Override
    public Status convertToEntityAttribute(String dbData) {

        return Status.getEnum(dbData);
    }
}