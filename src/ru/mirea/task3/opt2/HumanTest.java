package ru.mirea.task3.opt2;

public class HumanTest {
    public static void main(String[] args) {
        Hand rh = new Hand(true, 5);
        Hand lh = new Hand(false, 4);

        Leg rl = new Leg(42, false);
        Leg ll = new Leg(41, true);

        Head h = new Head(true, "grey", 12.0);

        Human human1 = new Human(rh, lh, rl, ll, h);

        System.out.println("Head: " + human1.getHead().toString());
        System.out.println("Right hand: " + human1.getRightHand().toString());
        System.out.println("Left hand: " + human1.getLeftHand().toString());
        System.out.println("Right leg: " + human1.getRightLeg().toString());
        System.out.println("Left leg: " + human1.getLeftLeg().toString());
    }
}
