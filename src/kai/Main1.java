package kai;

public class Main1 {
   static {
       System.out.println("static A");
   }

   public Main1(){
       System.out.println("construct a");
   }

   public void test(){
       System.out.println("test b");
   }
}

class B extends Main1{
    public B(){
        System.out.println("constuct b");
    }
    static {
        System.out.println("static b");
    }

    @Override
    public void test(){
        System.out.println("b");
    }

    public static void main(String[] args) {
        Main1 a=new B();
        a.test();
    }
}


