package ru.gb.spring.seminar03.example3_sem3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.spring.seminar03.example3_sem3.domain.User;
import ru.gb.spring.seminar03.example3_sem3.services.DataProcessingService;

import java.util.ArrayList;
import java.util.List;

@RestController("/tasks")
public class TaskController {

    @Autowired
    private DataProcessingService service;

    @GetMapping("/tasks/")
    public List<String> getAllTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");

        return tasks;
    }

    @GetMapping("/tasks/sort") //localhost:8080/tasks/sort
    public List<User> sortUsersByAge() {
        return service.getRepository().sortUsersByAge(service.getRepository().getUsers());
    }

    // метод filterUsersByAge
    // подсказка @GetMapping("/filter/{age}")

    // метод calculateAverageAge
    // подсказка @GetMapping("/calc")
}


