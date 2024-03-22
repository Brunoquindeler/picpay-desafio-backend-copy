package br.com.brunoquindeler.picpaydesafiobackend.notification;

import br.com.brunoquindeler.picpaydesafiobackend.transaction.Transaction;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final NotificationProducer notificationProducer;

    public NotificationService(NotificationProducer notificationProducer) {
        this.notificationProducer = notificationProducer;
    }
    public void notify(Transaction transaction) {
    notificationProducer.sendNotification(transaction);
    }
}
