package kai;

public class BaseClass {
    private int i;
    public BaseClass(int _i){
        i=_i+1;
    }
    public int GetI(){
        return i;
    }
    public int GetIVal(){
        return i;
    }
}

class SubClass extends  BaseClass{
    private int i;

    public SubClass(int _i) {
        super(_i);
        i=_i+100;
    }

    @Override
    public int GetIVal(){
        return i;
    }

    public static void main(String[] args) {
        int x=4;
        System.out.println("value is "+((x>4) ? 99.9 : 9));
    }
}

