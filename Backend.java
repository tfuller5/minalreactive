package netflixapp;

import reactive.User;

import java.util.ArrayList;
import java.util.List;

public class Backend {
    //create NetflixSubscriber
    public static NetflixSubscriber netflixSubscriber = new NetflixSubscriber();
    public static void watchingAVideo(String filmName, int rating) {
        // 1. is the film can be downloaded
        // film class has a new attribute: FilmFile
        // store a arraylist of user objects
        // store a arraylist of films, each with a filmfile attached
        System.out.println("watching........");
    }

    public static void login(User user) {
        ArrayList<UserDetails> users = new ArrayList<>();
        users.add(new UserDetails("tom", "123", false));
        users.add(new UserDetails("minal", "1234", false));
        users.add(new UserDetails("steve", "cats", true));
        users.add(new UserDetails("john", "dogs", false));
        users.add(new UserDetails("cliff", "mountains", false));
        //see if username and password typed matches someone in db
        boolean correctInput = users.stream().anyMatch(
                userDetails -> user.getUsername().equals(userDetails.username)
                        && user.getPassword().equals(userDetails.password)
                );
        if (correctInput) {
            System.out.println("very nice ");
        }
        else {
            System.out.println("fuck off!");
        }
    }
}
