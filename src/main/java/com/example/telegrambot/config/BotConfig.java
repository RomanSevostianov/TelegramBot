package com.example.telegrambot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.pengrad.telegrambot.TelegramBot;

@Configuration
public class BotConfig {

    private final String token;

    public BotConfig(@Value ("${telegram.ReminderGoodSkyBot}") String token) {
        this.token = token;
    }
    @Bean
    public TelegramBot telegramBot() {
        TelegramBot telegramBot = new TelegramBot(token);
        return telegramBot;
    }
}
