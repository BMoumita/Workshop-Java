package polymorphism;

public class MethodOverloading {
    int a=100;
    MethodOverloading(){
        System.out.println("Inside Parent class constructor");
    }

    MethodOverloading(int a){

    }


    void add(int a,int b){
        System.out.println("Overloading Addition : "+(a+b));
    }

    void add(float a,int b){
        System.out.println("Addition : "+(a+b));
    }

    public static void main(String[] args) {
        MethodOverloading overLoading=new MethodOverloading();
        overLoading.add(1F,2);
    }
}
