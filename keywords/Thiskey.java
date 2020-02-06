package keywords;

public class Thiskey {
    int id;
    String name;

    Thiskey(){
        this(1,"abcd");
        System.out.println("Inside default constructor");
    }

    Thiskey(int id,String name){

        this.id=id;
        this.name=name;
        System.out.println("constructor body : id : "+id+"\nName : "+name);
    }
    private void showData(){
        getData();
        System.out.println("Method body : id : "+id+"\nName : "+name);
    }

    private void getData(){
        System.out.println("Inside getData");
    }

    public static void main(String[] args) {
        Thiskey key=new Thiskey(1,"abcd");
        key.showData();
    }
}
