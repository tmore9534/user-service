package com.pocketmoney.userservice.deserializer;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pocketmoney.userservice.models.UserInfoDto;

public class UserInfoDeserializer implements Deserializer<UserInfoDto> {

    @Override
    public void close() {
    }

    @Override
    public void configure(Map<String, ?> arg0, boolean arg1) {
    }

    @Override
    public UserInfoDto deserialize(String topic, byte[] data) {
        ObjectMapper objectMapper = new ObjectMapper();

        UserInfoDto user = null;
        try {
            user = objectMapper.readValue(data, UserInfoDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;

    }
}
