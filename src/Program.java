import java.util.Scanner;

/**
 * Created by kamo on 09.03.16.
 */
public class Program {


    public static void main(String args[]){

        Kolejka kolejka = new Kolejka();
        kolejka.generateProcesses(3, 5, 5);

        FCFS fcfs = new FCFS();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Sredni czas oczekiwania:"+fcfs.run(kolejka.getAllProces()));

    }
}
