package four;

public class dicussion_4 {
    public static void main(String[] args) {
        Person itai = new Person();
        SoccerPlayer shivani = new SoccerPlayer(); // CE
        Athlete sohum = new SoccerPlayer();
        Person jack = new Athlete();
        Athlete anjali = new Athlete();
        SoccerPlayer chirasree = new SoccerPlayer();
//        SoccerPlayer shivani = new Person(); // CE
//        sohum.watch((Athlete) itai); // CE
//        sohum.watch((Athlete) itai); // RE
        anjali.speakTo(chirasree); // RE







    }
}

class Person {
    void speakTo(Person other) {
        System.out.println("kudos");
    }

    void watch(SoccerPlayer other) {
        System.out.println("wow");
    }
}

class Athlete extends Person {
    void speakTo(Athlete other) {
        System.out.println("take notes");
    }

    void watch(Athlete other) {
        System.out.println("game on");
    }
}

class SoccerPlayer extends Athlete {
    @Override
    void speakTo(Athlete other) {
        System.out.println("respect");
    }

    @Override
    void speakTo(Person other) {
        System.out.println("hmph");
    }
}
