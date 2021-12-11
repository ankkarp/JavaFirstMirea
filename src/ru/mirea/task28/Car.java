package ru.mirea.task28;

public class Car {
    private Engine engine = new Engine(0.7);
    private Wheel right_front_wheel = new Wheel(true);
    private Wheel left_front_wheel = new Wheel(true);
    private Wheel right_back_wheel = new Wheel(true);
    private Wheel left_back_wheel = new Wheel(true);
    private HeadLight head_light = new HeadLight(false);
    private Door door = new Door(false);

    public void go(){
        System.out.println("Riding in a car");
    }

    private class Wheel {
        private boolean tyred;

        private Wheel(boolean tyred) {
            this.tyred = tyred;
        }

        public boolean isTyred() {
            return tyred;
        }

        public void setTyred(boolean tyred) {
            this.tyred = tyred;
        }
    }

    private class Engine {
        private double fuel;

        private Engine(double fuel) {
            this.fuel = fuel;
        }

        public double getFuel() {
            return fuel;
        }

        public void setFuel(double fuel) {
            this.fuel = fuel;
        }
    }

    private class Seat{
        private String material;

        private Seat(String material){
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }

    private class HeadLight{
        private boolean on;

        private HeadLight(boolean on){
            this.on = on;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }
    }

    private class Door{
        private boolean open;

        private Door(boolean open){
            this.open = open;
        }

        public boolean isOpen() {
            return open;
        }

        public void setOpen(boolean open) {
            this.open = open;
        }
    }

    private class Van extends Car {
        @Override
        public void go() {
            System.out.println("Riding in a van");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        Car van = new Car().new Van();
        van.go();
    }
}
