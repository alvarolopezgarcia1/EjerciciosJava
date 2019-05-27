import java.util.*;
public class piramideNumeros{
      
         public static void main(String[] args){
              int n,a,b;
              Scanner cal=new Scanner(System.in);
              System.out.println("Ingrese un numero");
              n=cal.nextInt();
                
               for(a=1; a<=n; a++){
                   for(b=1; b<=a; b++){
                       System.out.print(a);
                   }
                   System.out.println(" ");
                }
                     for(a=n-1;a<=1;a--){
                     for(b=1;b<=a;b++){
                          System.out.print(a);
}
                System.out.println(" ");
}
}
}
