package org.example;

enum Priority {
    LEVEL1,LEVEL2,LEVEL3
}
public abstract class Chain {
    public Priority priority;
    private Chain next;
    private StringBuilder message= new StringBuilder();

    public void setNext(Chain chain){
        next = chain;
    }
    public void message(Priority priority, String name) {
        if (this.priority == priority) {
            display(name);
        }
        if (next != null) {
            next.message(priority, name);
        }
    }
     protected abstract void display(String message);
}
class Chain1 extends Chain {
    public Chain1(Priority priority) {
        this.priority = priority;
    }

    @Override
    protected void display(String message) {
        System.out.println(" Обработчик 1 " + message);
    }
}
class Chain2 extends Chain {
    public Chain2(Priority priority) {
        this.priority = priority;
    }

    @Override
    protected void display(String message) {
        System.out.println(" Обработчик 2 " + message);
    }
}
class Chain3 extends Chain {
    public Chain3(Priority priority) {
        this.priority = priority;
    }

    @Override
    protected void display(String message) {
        System.out.println(" Обработчик 3 " + message);
    }
}

class Main2{
    public static void main(String[] args) {
        Chain1 first = new Chain1(Priority.LEVEL1);
        Chain2 second = new Chain2(Priority.LEVEL2);
        Chain3 third = new Chain3(Priority.LEVEL3);
        first.setNext(second);
        second.setNext(third);

        first.message(Priority.LEVEL1, "Level1 Message");
        first.message(Priority.LEVEL2, "Level2 Message");
        first.message(Priority.LEVEL3, "Level3 Message");

    }
}


