package Lession2_Open_Close_Principle.Example1.BetterCode;

import java.util.List;

public class NotificationSender {

    public void senderNotification(List<NotificationClass> notification){
        for(NotificationClass n : notification) {
            n.sendNotification();
    }
    }
}
