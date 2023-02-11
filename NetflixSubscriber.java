package netflixapp;

import reactive.User;

import java.util.concurrent.Flow;

public class NetflixSubscriber implements Flow.Subscriber<User> {

    // create a new subscription variable which comes from import java.util.concurrent.Flow
    private Flow.Subscription subscription;

    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("New user opened website, not logged in yet");
        this.subscription = subscription;
        subscription.request(1);
    }

    // onNext means is the mystery method that is never called from anywhere
    // instead this is triggered when you do .submit
    // whatever information you want to send to the back-end
    // we are sending in the film details (film name and rating) as a parameter
    @Override
    public void onNext(User item) {
        // Retrieves a system.out.println to the user which writes you are watching part 1 video
        System.out.println(item.getUsername());
        System.out.println(item.getPassword());
        Backend.login(item);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("there was an error!!!!");
        throw new RuntimeException(throwable);

    }

    @Override
    public void onComplete() {

    }

}
