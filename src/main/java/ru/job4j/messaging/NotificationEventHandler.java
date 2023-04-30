package ru.job4j.messaging;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j.event.NotificationEvent;
import ru.job4j.service.NotificationService;

@Service
@RequiredArgsConstructor
public class NotificationEventHandler {
    private final NotificationService notificationService;

    @KafkaListener(topics = "${kafka.topic.notifications}")
    public void handleNewNotification(NotificationEvent event) {
        notificationService.processNotificationEvent(event);
    }
}
