package Arrey;

public class FibonacciExample {
    public static void main(String[] args) {
        int num=10;
        int firstnum=0;
        int secondnum=1;

        System.out.println("fibonacci starting 10 numbers");
        for(int i=1;i<10;i++){
            System.out.print(firstnum + " ");

            int nextnum=firstnum+secondnum;
             firstnum=secondnum;
             secondnum=nextnum;
        }
    }
}
