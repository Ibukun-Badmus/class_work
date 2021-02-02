package com.numberAlgorithm;

public class GasMileage {
    private int milesDriven;
    private int gallonsUsed;


    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public double milesPerGallonCalculator() {
        return (double) getMilesDriven()/getGallonsUsed();
    }
}



//    public static void main(String[] args) {
//        Animal animalAnimal = new Animal();
//            Animal animalCat = new Cat();
//            Animal animalDog = new Dog();
//
//            makeAnimalMove(animalAnimal);
//        makeAnimalMove(animalCat);
//        makeAnimalMove(animalDog);
//
//        }
//
//        public static void makeAnimalMove(Animal animal){
//            animal.move();
