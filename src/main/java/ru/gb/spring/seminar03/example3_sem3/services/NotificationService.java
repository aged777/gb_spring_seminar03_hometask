package ru.gb.spring.seminar03.example3_sem3.services;

import org.springframework.stereotype.Service;
import ru.gb.spring.seminar03.example3_sem3.domain.User;

/**
 * Класс NotificationService нужен для отправки сообщений либо в консоль, либо в БД,
 * либо логи в файл пишет и т.д.
 */
@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}
