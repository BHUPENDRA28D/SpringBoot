package com.devtiro.quickstart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
    @Value("${myapp.name}")
    String appName;
    @Value("${myapp.version}")
    String appVersion;
  @Value("${myapp.description}")   String description;

    public MyApp(String appName, String appVersion, String description) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.description = description;
    }

    public MyApp() {
        super();
        // TODO Auto generated constructor


    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
