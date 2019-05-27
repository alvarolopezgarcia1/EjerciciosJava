package examen_rec;

import java.util.Scanner;
public class ejercicio2{
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    System.out.print("Por favor, introduzca el primer numero: ");
    int x=s.nextInt();
    int xx=x;
    int xxx=x;
    System.out.print("Por favor, introduzca el segundo numero: ");
    int y=s.nextInt();
    int yy=y;
    int yyy=y;
    int cont=0;
    while(xx>0){
      xx=xx/10;
      cont++;
    }
    int []array=new int[cont];
    int i=0;
    while(xxx>0){
      array[i]=xxx%10;
      xxx=xxx/10;
      i++;
    }
    int cont2=0;
    while(yy>0){
      yy=yy/10;
      cont2++;
    }
    int []array2=new int[cont2];
    int j=0;
    while(yyy>0){
      array2[j]=yyy%10;
      yyy=yyy/10;
      j++;
    }
    int cont3=0;
    for(int h=0; h<cont; h++){
      for (int g=0; g<cont2; g++){
        if (array[h]==array2[g]){
          cont3++;
        }
      }
    }
    
    
    
    System.out.println("del numero "+x+" hay: "+cont3+" numeros en el numero "+y);
 

  }
}


