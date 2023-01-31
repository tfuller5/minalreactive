package netflixapp;

import reactive.User;

public class Request {
    User user;
    Film film;

    public Request(User user, Film film) {
        this.user = user;
        this.film = film;
    }
}
