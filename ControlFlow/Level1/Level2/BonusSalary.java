package Level2;

    import java.util.*;
public class BonusSalary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary:");
        int salary=sc.nextInt();
        System.out.println("Enter the years of service:");
        int years=sc.nextInt();
        if(years>5){
            int bonus=(salary*5)/100;
            System.out.println("The bonus is:"+bonus);
        }
        else{
            System.out.println("No bonus");
        }
        sc.close();
    }
    
}
