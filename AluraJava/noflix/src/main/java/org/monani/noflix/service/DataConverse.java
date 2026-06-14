package org.monani.noflix.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverse implements IDataConverse {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> Class) {
        try {
            return mapper.readValue(json, Class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
