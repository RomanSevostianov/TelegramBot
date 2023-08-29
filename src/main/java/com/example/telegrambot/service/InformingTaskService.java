package com.example.telegrambot.service;

import com.example.telegrambot.entity.InformingTask;
import com.example.telegrambot.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InformingTaskService {

    private final TaskRepository taskRepository;

    //метод сохранения данных в БД
    public void save(InformingTask informingTask) {
        taskRepository.save(informingTask);
    }

}
