package org.example;



class Animal {
    private SoundStrategy soundStrategy;
    private MovementStrategy movementStrategy;

    public Animal(SoundStrategy soundStrategy, MovementStrategy movementStrategy) {
        this.soundStrategy = soundStrategy;
        this.movementStrategy = movementStrategy;
    }

    public void sound() {
        this.soundStrategy.sound();
    }
    public void movement() {
        this.movementStrategy.movement();
    }
    public void nutrition() {
        System.out.println(" Питается ");
    }

}
class Fish extends Animal{
    public Fish(){
        super(new Silent(),new Swimming());
    }
}
class Bear extends Animal {

    public Bear() {
        super(new Growling(), new Walking());
    }
}
class Bird extends Animal {
    public Bird() {
        super(new Screaming(), new Flying());
        }
}
interface MovementStrategy{
    public void movement();
}
class Flying implements  MovementStrategy{
    @Override
    public void movement() {
        System.out.println(" Летает ");
    }
}
class Swimming implements  MovementStrategy{
    @Override
    public void movement() {
        System.out.println(" Плавает ");
    }
}
class Walking implements  MovementStrategy{
    @Override
    public void movement() {
        System.out.println(" Ходит ");
    }
}
interface SoundStrategy{
    void sound();
}
class Growling implements  SoundStrategy{
    @Override
    public void sound() {
        System.out.println(" Рычит ");
    }
}
class Silent  implements  SoundStrategy{
    @Override
    public void sound() {
        System.out.println("");
    }
}
class Screaming implements  SoundStrategy{
    @Override
    public void sound() {
        System.out.println(" Кричит ");
    }
}
class Main1{
public static void main(String[] args) {
    Animal fish = new Fish();
    Animal bear = new Bear();
    Animal bird = new Bird();
    fish.movement();
    bear.movement();
    bird.movement();
    fish.sound();
    bear.sound();
    bird.sound();

    }
}



