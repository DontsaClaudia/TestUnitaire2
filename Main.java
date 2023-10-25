import java.util.Scanner;

import Controlers.Calculatrice;

public class Main {
    
     public static void main(String args[])  
    {  


        Integer a = 0;
        Integer b = 0;
        Scanner num1 = new Scanner(System.in);
            System.out.println(" Entrer le premier nombre");
            a = num1.nextInt();
        
            
            Scanner num2 = new Scanner(System.in);
            System.out.println(" Entrer le segond nombre");
            b = num2.nextInt();

        int option = 0;
        Scanner op = new Scanner(System.in);
        System.out.println(" entrer une option 1: Addition 2: Soustraction 3: Multiplication 4: Division");
        option = op.nextInt();

        switch (option) {
            case 1:
                System.out.println(" résultat :"+ Calculatrice.add(a, b));
                break;
            
            case 2:
                System.out.println(" résultat :"+ Calculatrice.moins(a, b));
                break;

            case 3:
            System.out.println(" résultat :"+ Calculatrice.multi(a, b));
                break;

            case 4:
            System.out.println(" résultat :"+ Calculatrice.div(a, b));
                break;

            default:
            System.out.println("Faites un choix ");
                break;
        }
        
       
    }

}

