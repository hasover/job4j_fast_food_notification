package ru.job4j.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.Notification;
import ru.job4j.event.NotificationEvent;
import ru.job4j.repository.NotificationRepository;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void processNotificationEvent(NotificationEvent event) {
        Notification notification = Notification.builder()
                .message(event.getMessage())
                .email(event.getEmail())
                .build();
        notificationRepository.save(notification);
    }
}
