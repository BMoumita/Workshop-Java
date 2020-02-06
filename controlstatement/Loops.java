package controlstatement;

public class Loops {
    void executeForLoop(){

        for (int i=0;i<3;i++){

            for (int j=0;j<3;++j){
                System.out.println(i+""+j);
            }

        }


    }

    void whileLoop(){

        int i=0;
        while (i<3){
            System.out.println("while : "+i);
            i++;
        }

        do {
            System.out.println("do while : "+i);
        }while (i<3);

    }

public static void main(String[] args){
        Loops loops = new Loops();
        loops.whileLoop();
}
}
