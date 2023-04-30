package ru.job4j.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
