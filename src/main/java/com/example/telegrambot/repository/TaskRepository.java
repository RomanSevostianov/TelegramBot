package com.example.telegrambot.repository;

import com.example.telegrambot.entity.InformingTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository extends JpaRepository<InformingTask, Long> {

    //поиск напоминаний по дате
    List<InformingTask> findAllByNotificationDateTime(LocalDateTime localDateTime);
}
