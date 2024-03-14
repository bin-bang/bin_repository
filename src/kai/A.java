package kai;


import java.io.ObjectStreamException;
import java.util.ArrayList;

public class A {

    
    public static void main(String[] args) {
        System.out.println("john"=="john");
        System.out.println("john".equals("john"));
        System.out.println("john"==new String("john"));
        System.out.println("john".equals(new String("john")));
    }

}


class Animal{
    public void move(){
        System.out.println("the amm is moving");
    }
}


class Dog extends Animal{
    @Override
    public  void  move(){
        System.out.println("the dog can run");
    }

    public void bark(){
        System.out.println("the dog can bark");
    }
}

