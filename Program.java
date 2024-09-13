import java.util. Scanner;

 public class program7 {



    public static void main( ) {
        //constants
        final int KLEVINS_PER_SCHRUTE_BUCK = 20;
        final int STANLEY_NICKELS_PER_KLEVIN = 12;
        final int NICKELS_PER_SCHRUTE_BUCK = 240;
        final int STANLEY_NICKELS_PER_SCHRUTE_BUCK_DECIMAL = 100;
        
        //variables
        int schruteBucks = 5;
        int klevins = 2;
        int stanleyNickels = 8;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter schrute-bucks:");
        
        schruteBucks =  scanner.nextInt();
        
        System.out.println("Enter klevins:");
        
        klevins =  scanner.nextInt();
        
        System.out.println("Enter stanley-nickels:");
        
        stanleyNickels =  scanner.nextInt();
        
        // Calculatioins
        
        double total_NICKELS = klevins * STANLEY_NICKELS_PER_KLEVIN + stanleyNickels;
        
        double total_NICKELS_SCHRUTE_BUCK = total_NICKELS/NICKELS_PER_SCHRUTE_BUCK;
        
        double decimal_NICKELS_In_SCHRUTE_BUCK = schruteBucks + total_NICKELS_SCHRUTE_BUCK;
        
        decimal_NICKELS_In_SCHRUTE_BUCK = (double) Math.round(decimal_NICKELS_In_SCHRUTE_BUCK*100.00)/100.00;
        
        System.out.println("Decimal schrute-bucks = $"+ decimal_NICKELS_In_SCHRUTE_BUCK);

    }

   
     
    
    
}
     

