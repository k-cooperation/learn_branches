public class Eating {
    public static void main(String[] args) {
        Times time1 = new Times();
        time1.eatingLunch();
        System.out.println("Add all the times of HavingDinner is " + time1.getTimes());
    }
}

class Times {
    int time = 0;

    int getTimes() {
        return time;
    }

    void eatingLunch() {
        time += 1;
    }
}