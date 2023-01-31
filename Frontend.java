package netflixapp;

import reactive.User;

import java.util.concurrent.SubmissionPublisher;

public class Frontend {
    public static void main(String[] args) throws InterruptedException {
        // the only thing youre allowed to do, is publish youtube videos
        // you trust, that the subscribers on the backend will watch your videos
        printUsersDetails();
        //createPublisher();
        subscribe();
    }
    public static void printUsersDetails () {
        System.out.println("your name is Minal");
    }


    //create a new reactive method which creates publisher
    public static SubmissionPublisher<Request> createPublisher () {
        SubmissionPublisher<Request> netflixUser = new SubmissionPublisher<>();
        System.out.println("Create Publisher");
        return netflixUser;
    }

    //create a new reactive method which creates a subscriber
    public static void subscribe() throws InterruptedException {

        SubmissionPublisher<Request> netflixUser = createPublisher();
        netflixUser.subscribe(Backend.netflixSubscriber);
        System.out.println(new String("Subscribe"));

        // everything is an object
        String filname = new String("Shawshank Redemption");
        int rating = 10;
        Film shawshankRedemption = new Film(filname, rating);
        User min = new User("minal", "ilovecoding");
        Request req = new Request(min, shawshankRedemption);

        System.out.println("attempting to start " + shawshankRedemption.getFilmName());
        netflixUser.submit(req);
        //netflixUser.submit(min, shawshankRedemption);

        Thread.sleep(2000);


    }

}
