package ru.mirea.task3.opt2;

public class Human {
    private Head head;
    private Hand rightHand, leftHand;
    private Leg rightLeg, leftLeg;

    public Human(Hand rightHand, Hand leftHand, Leg rightLeg, Leg leftLeg, Head head){

        this.head = head;

        this.rightHand = rightHand;
        this.leftHand = leftHand;

        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }

    public Head getHead() { return head; }

    public Hand getRightHand() { return rightHand; }

    public Hand getLeftHand() { return leftHand; }

    public Leg getRightLeg() { return rightLeg; }

    public Leg getLeftLeg() { return leftLeg; }
}
