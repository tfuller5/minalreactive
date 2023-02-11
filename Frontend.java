package netflixapp;

import reactive.User;

import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class Frontend {
    public static void main(String[] args) throws InterruptedException {
        // the only thing youre allowed to do, is publish youtube videos
        // you trust, that the subscribers on the backend will watch your videos
        //createPublisher();
        subscribe();
    }



    //create a new reactive method which creates a subscriber
    public static void subscribe() throws InterruptedException {
        // no film objects or user objects
        // input from console using a scanner
        System.out.println("Enter your username: ");
        Scanner scanUsername = new Scanner(System.in);
        String usernameTyped = scanUsername.nextLine();
        System.out.println("Enter your password: ");
        Scanner scanPasssword = new Scanner(System.in);
        String passwordTyped = scanPasssword.nextLine();
        System.out.println("Enter a filmname: "); // download film from backend


        User user = new User(usernameTyped, passwordTyped);


        SubmissionPublisher<User> netflixUser = new SubmissionPublisher<>();
        netflixUser.subscribe(Backend.netflixSubscriber);
        netflixUser.submit(user);


        // everything is an object
        /*String filname = new String("Shawshank Redemption");
        int rating = 10;
        Film shawshankRedemption = new Film(filname, rating);
        User min = new User("minal", "ilovecoding");
        Request req = new Request(min, shawshankRedemption);

        System.out.println("attempting to start " + shawshankRedemption.getFilmName());

         */
        //netflixUser.submit(req);
        //netflixUser.submit(min, shawshankRedemption);

        Thread.sleep(2000);// https://github.com/tfuller5/minalreactive.git


    }

}
