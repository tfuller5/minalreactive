package netflixapp;

import reactive.User;

import java.util.concurrent.Flow;

public class NetflixSubscriber implements Flow.Subscriber<Request> {

    // create a new subscription variable which comes from import java.util.concurrent.Flow
    private Flow.Subscription subscription;

    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Someone just started started a Netflix video");
        this.subscription = subscription;
        subscription.request(1);
    }

    // onNext means is the mystery method that is never called from anywhere
    // instead this is triggered when you do .submit
    // whatever information you want to send to the back-end
    // we are sending in the film details (film name and rating) as a parameter
    @Override
    public void onNext(Request item) {
        // Retrieves a system.out.println to the user which writes you are watching part 1 video
        //
        System.out.println("no way");
        System.out.println("hello");
        //System.out.println(1/0);
        System.out.println(item.user + "started watching" + item.film);
        System.out.println("nothing in on error");
        System.out.println("ashdflasdjflaksjdfljkasdf");

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
