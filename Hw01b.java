package hw01b;
import java.util.*;
import java.io.*;

public class Hw01b {
    static Scanner console = new Scanner (System.in);
    
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "stocks.txt";
        File file = new File(fileName);
        char selection;
        boolean check = true;
        double stockPrice;
        String stockName;
        while (check == true){
        Scanner in = new Scanner(file);

            choiceMenu();
            selection = console.next().charAt(0);
            java.lang.Character.toLowerCase(selection);
            switch (selection){
                case 1: 
                    System.out.print("Enter a stockticker: ");
                    stockName = console.next();
                    String pattern = "(\\w+)";
                    if (stockName.toLowerCase() == in.next(pattern).toLowerCase()){
                        stockPrice = in.nextDouble();
                    } else {
                        System.out.println(stockName + " was not found");
                    }
                    check = false;
                    break;
                case 2: 
                    
                    check = false;
                    break;
                case 3:
                    
                    check = false;
                    break;
                case 'c':
                    System.out.print("Enter a stock filename: ");
                    fileName = console.next();
                    break;
                case 'q':
                    System.out.println("Goodbye");
                    check = false;
                    break;
                default:
                    System.out.println("Please enter a valid selection.");
            }
        
        
        
        
    }
    }
    
    public static void getStockStats (String stock, String fileName){
        
    }
    
    public static int getStockHigh (int x, int y){
        
        
        return x;
    }
    
    public static int getStockLow (int x, int y){
        
        return x;
    }
    
    public static void choiceMenu(){
        System.out.println("Enter '1' to get max, min and avg of a stock");
        System.out.println("Enter '2' to get stock ticker with highest price");
        System.out.println("Enter '3' to get stock ticker with lowest price");
        System.out.println("Enter 'c' to change the stockfile name");
        System.out.println("Enter 'q' to quit");
        System.out.print("Your choice: ");
    }
            
}
