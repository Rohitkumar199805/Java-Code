class base{
    base(){
        System.out.println(" i am a base class constructor");
    }
    base(int x){
        System.out.println(" i am a base constructor overloading");
        System.out.println(" the value of x:"+x);
    }

}
class derived extends base{
    derived(){
        System.out.println(" i am a derived class constructor");
    }
    derived(int x,int y){
        super(x);
        System.out.println(" i am a derived constructor overloading");
        System.out.println(" the value of y :"+y);
    }
}




class inheritance_in_constructor{
    public static void main(String[] args) {
        derived d1 = new derived(5,8);
    }
}