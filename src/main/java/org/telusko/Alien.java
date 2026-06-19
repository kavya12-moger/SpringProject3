package org.telusko;

public class Alien {

    private Laptop lap;

  private int age;

    public Alien(){
        System.out.println("Alien Object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age is:"+age);
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("coding");
    }
}
