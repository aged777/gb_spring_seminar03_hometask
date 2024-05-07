package ru.gb.spring.seminar03.example3_sem3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Класс RegistrationService - это сервис регистрации пользователей
 */
@Service
public class RegistrationService {

    @Autowired
    private DataProcessingService dataProcessingService;

    // Поля UserService, NotificationService
    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public UserService getUserService() {
        return userService;
    }


    public NotificationService getNotificationService() {
        return notificationService;
    }


    // Метод processingRegistration
}
