import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


   for(int i=0; i<=10; i++){
        System.out.println("Итерация цикла "+ i);
    }

   for (int j=2020; j<2070; j = j+4){
       System.out.println("високосный год "+ j);
   }
   int salary = 65535 ;
   int total = 0 ;
   for (int k=0 ; k<=12; k++){
       total= total+total/100;
       total = total + salary;
       System.out.println("Месяц "+ k+ " итого " + total);
       System.out.println(total);
   }

        System.out.println("Задача 1");

} }