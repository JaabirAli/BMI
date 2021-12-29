import java.util.Scanner;

public class BMI{
    public static double calculate(int weight ,int height){
       weight=(weight*703);
       height=height*height; 
        return weight/height ;
    }
    public static String message(double bmi){
        if(bmi>30){
            return "Shuluq waa dhaafte cunnada iska yareey";

        }
        else if(bmi<15){
            return "Si fiican wax cun nafaa tahay";
        }
        else{
            return "Masha Allah";
        }
                 
    }
    public static void main(String arg[]) {
         Scanner input=new Scanner(System.in);
         System.out.println("Waa maxay dhirirkaada inji ahaan");
         int height= input.nextInt();
         System.out.println("Waa maxay culeeskaaga pound");
         int weight= input.nextInt();
         double BMI=calculate(weight, height);
         System.out.println(message(BMI));  
        
        }
}