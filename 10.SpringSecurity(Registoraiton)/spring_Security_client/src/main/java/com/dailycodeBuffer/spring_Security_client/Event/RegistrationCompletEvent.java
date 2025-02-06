package com.dailycodeBuffer.spring_Security_client.Event;

import com.dailycodeBuffer.spring_Security_client.Entity.User;
import jdk.jfr.SettingDefinition;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class RegistrationCompletEvent extends ApplicationEvent {

    private User user;
    private  String applicationUrl;

    public RegistrationCompletEvent(User user,String applicationUrl) {
        super(user);
        this.user=user;
        this.applicationUrl=applicationUrl;
    }
}
