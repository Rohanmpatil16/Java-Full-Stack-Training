interface listening {
    void listen();
}

interface Studying {
    void study();
}

class person implements listening, Studying {

    public void listen() {
        System.out.println("Listening");
    }

    public void study() {
        System.out.println("Studying");
    }

    public void eat() {
        try {
            System.out.println("Eating");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class student extends person {

    public void solve() {
        System.out.println("Solving");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        student s = new student();

        s.listen();
        s.study();
        s.eat();
        s.solve();
    }
}