public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private String coler = "blue";
    private double radius = 5;

    public void fan(int speed, boolean on, String coler, double radius) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.coler = coler;
        Fan an = new Fan();
        System.out.println(an.toString());
    }

    public String toString() {
        System.out.println(speed);
        System.out.println(coler);
        System.out.println(radius);
        if (on) {
            return "fan is on";
        } else {
            return "fan is of";
        }
    }

}
