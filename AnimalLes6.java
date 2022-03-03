/**
* Java 1. Home Work #2
*
* @author Artem Anurin
* @version 01.03.2022
*/


class AnimalLes6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);
        
        IAnimal[] animals = {cat, dog};
        
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(100));
            System.out.println(animal.run(300));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(7));
            System.out.println(animal.swim(12));
        }
    }
}

class Cat extends Animal {
    Cat(int runLim) {
        super(runLim, 0);
    }
    
    @Override
    public String swim(int distance) {
        return getClassName() + " no swiming ";
    }   
}


class Dog extends Animal {
    Dog(int runLim, int swimLim) {
        super(runLim, swimLim);
    } 
}


abstract class Animal implements IAnimal {
    protected String className;
    protected int runLim;
    protected int swimLim; 
    
    Animal(int runLim, int swimLim) {
        this.runLim = runLim;
        this.swimLim = swimLim;
        className = getClass() .getSimpleName();
    }
    
    public String getClassName() {
        return className;
    }
    
    
    @Override
    public String run(int distance) {
        if (distance > runLim) {
            return className + " not run " + distance;
        } else {
            return className + " run " + distance;
        }
    }
    
    @Override
    public String swim(int distance) {
        if (distance > swimLim) {
            return className + " not swim " + distance;
        } else {
            return className + " swim " + distance;
        }
    }
    
    
    @Override
    public String toString() {
        return className + ", runLim: " + runLim + ", swimLim: " + swimLim;
    }
    
}


interface IAnimal {
    String run(int distance);
    String swim(int distance);
}




