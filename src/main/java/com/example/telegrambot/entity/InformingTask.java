package com.example.telegrambot.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity // указывает Hibernate,что таблицу нужно хранить в базе данных
@Data
@EqualsAndHashCode
@NoArgsConstructor// конструктор без параметров
@AllArgsConstructor//консктруктор, использующий все поля класса
@Table(name = "Informing_task") //задаем имя таблицы в БД

public class InformingTask {

    //индефикатор напоминаний
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //задача которую нужно запланировать
    @Column(name = "message", nullable = false) //маппим колонки таблицы на поля класса
    private String message;

    //индификатор пользователя
    @Column(name = "chat_id", nullable = false)
    private long chatId;

    //дата и время планируемой задачи
    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;
}
