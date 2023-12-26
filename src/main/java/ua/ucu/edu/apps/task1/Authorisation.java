package ua.ucu.edu.apps.task1;

public class Authorisation {
    public MyUser login() {
        return new MyTwitterUser(new TwitterUser());
        // return new MyFacebookUser(new FacebookUser());
    }
}
