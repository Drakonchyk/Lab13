package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;

public class MyTwitterUser implements MyUser {
    private final TwitterUser user;
    public MyTwitterUser(TwitterUser user) { this.user = user; }
    @Override
    public String getEmail() { return user.getUserMail(); }
    @Override
    public String getCountry() { return user.getCountry(); }

    @Override
    public LocalDateTime getLastVisit() { return user.getLastActiveTime(); }
}