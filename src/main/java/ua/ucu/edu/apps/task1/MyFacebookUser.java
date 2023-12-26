package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;

public class MyFacebookUser implements MyUser {
    private final FacebookUser user;

    public MyFacebookUser(FacebookUser user) { this.user = user; }
    @Override
    public String getEmail() { return user.getEmail(); }
    @Override
    public String getCountry() { return user.getUserCountry(); }
    @Override
    public LocalDateTime getLastVisit() { return user.getUserActiveTime().atStartOfDay(); }
}