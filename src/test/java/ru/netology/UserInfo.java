package ru.netology;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Data
@RequiredArgsConstructor
@Value
public class UserInfo {
    private final String login;
    private final String password;
    private final String status;
}