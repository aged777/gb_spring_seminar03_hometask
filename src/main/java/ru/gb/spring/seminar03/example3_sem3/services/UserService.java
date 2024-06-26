package ru.gb.spring.seminar03.example3_sem3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.spring.seminar03.example3_sem3.domain.User;

/**
 * Класс UserService - это центральный сервис, он будет взаимодействовать с друругими сервисами,
 * такими как RegistrationService, DataProcessingService и т.д.
 */
@Service
public class UserService {

    @Autowired
    private NotificationService notificationService;

    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        // Отправляем уведомление о создании нового пользователя
        notificationService.notifyUser(user);

        return user;
    }

}
