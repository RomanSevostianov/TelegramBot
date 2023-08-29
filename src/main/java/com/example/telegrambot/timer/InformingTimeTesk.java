package com.example.telegrambot.timer;

import com.example.telegrambot.repository.TaskRepository;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import org.springframework.scheduling.annotation.Scheduled;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class InformingTimeTesk {

    private  TaskRepository taskRepository;
    private TelegramBot telegramBot;

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void task() {

        taskRepository.findAllByNotificationDateTime(
                LocalDateTime.now().truncatedTo(
                        ChronoUnit.MINUTES)
        ).forEach(informingTask -> {
            telegramBot.execute(
                    new SendMessage(informingTask.getChatId(),
                            "Вы просили напомнить о задаче: " + informingTask.getMessage()));
            taskRepository.delete(informingTask);
        });
    }

}
