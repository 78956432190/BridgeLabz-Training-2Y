package Level2;
import java.util.*;
public class Young {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of amar,akbar ,anthony:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter the height of amar ,akabr,anthony:");
        int h1=sc.nextInt();
        int h2=sc.nextInt();
        int h3=sc.nextInt();
        sc.close();
        if(a<b && a<c){
            System.out.println("amar is the youngest");
            if(h1>h2 && h1>h3){
                System.out.println("amar is the tallest");
            }
            else if(h2>h1 && h2>h3){
                System.out.println("akbar is the tallest");
            }
            else{
                System.out.println("anthony is the tallest");
            }
        }
        else if(b<a && b<c){
            System.out.println("akbar is the youngest");
            if(h2>h1 && h2>h3){
                System.out.println("akbar is the tallest");
            }
            else if(h1>h2 && h1>h3){
                System.out.println("amar is the tallest");
            }
            else{
                System.out.println("anthony is the tallest");
            }
        }
        else{
            System.out.println("anthony is the youngest");
            if(h3>h1 && h3>h2){
                System.out.println("anthony is the tallest");
            }
            else if(h1>h2 && h1>h3){
                System.out.println("amar is the tallest");
            }
            else{
                System.out.println("akbar is the tallest");
            }
        }
    }
}