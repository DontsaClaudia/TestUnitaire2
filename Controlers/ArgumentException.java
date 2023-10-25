package Controlers;
public class ArgumentException extends RuntimeException {

    public static void isNull(Integer a, Integer b)
    {
       
           
            try {
                Calculatrice.add(null, null);
            } catch (Exception e) {
                System.out.println(e);
            }   

           /*  try {
                Calculatrice.moins(a, b);
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                Calculatrice.multi(a, b);
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                Calculatrice.div(a, b);
            } catch (Exception e) {
                System.out.println(e);
            }
                */
        
    }
    
}
