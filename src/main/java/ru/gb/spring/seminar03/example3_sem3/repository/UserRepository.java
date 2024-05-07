package ru.gb.spring.seminar03.example3_sem3.repository;

import org.springframework.stereotype.Repository;
import ru.gb.spring.seminar03.example3_sem3.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Основная задача класса UserRepository - быть хранилищем для пользователей
 */

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
