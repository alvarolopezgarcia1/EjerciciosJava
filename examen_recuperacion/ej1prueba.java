import java.util.Scanner;
import libreriaHanoi.accesorioHanoi;
public class ej1prueba {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    System.out.print("introduce el numero de discos: ");
    int discos=s.nextInt();
    System.out.print("indique primero el disco de la torre que quiere coger, pulse enter, y luego indique la torre a la que lo quiere llevar y vuelva a pulsar enter");
    int [][]array=inicializaPostes(discos);
    int x=0;
    int y=0;
    libreriaHanoi.accesorioHanoi.muestraTorres(array);
    int a=0;
    int b=0;
    do{
      a=s.nextInt();
      if(a!=-1){
        b=s.nextInt();
        intentaMover(array,a,b);
        libreriaHanoi.accesorioHanoi.muestraTorres(array);
        if(checkHanoi(array)){
          System.out.print("lo ha conseguido");
        }
      }
    }while(a!=-1);
    
    
  }
 
  public static int [][] inicializaPostes (int discos){
    int [][]array=new int[3][discos+1];
    array[0][0]=discos;
    int x=1;;
      for(int i=discos; i>0; i--){
        array[0][i]=x;
        x++;
      }
    
      return array;
  }
  public static void intentaMover(int[][]array,int x, int y){
    boolean encontrado=false;
    int xx=0;
    int colx=0;
    for(int i=(array[x-1].length)-1; i>0&&(encontrado==false); i--){
      if(array[x-1][i]!=0){
        xx=array[x-1][i];
        encontrado=true;
        colx=i;
      }
    }
    boolean encontrado2=false;
    for(int i=1; i<array[y-1].length-1&&encontrado2==false;i++){
      if(array[y-1][1]==0){
        array[y-1][1]=xx;
        array[x-1][colx]=0;
        array[y-1][0]++;
        array[x-1][0]--;
        encontrado2=true;
      }else if (array[x-1][colx]<array[y-1][i]&&array[y-1][i+1]==0){
        array[y-1][i+1]=xx;
        array[x-1][colx]=0;
        array[y-1][0]++;
        array[x-1][0]--;
        encontrado2=true;
      }
    }
  }
  
  public static boolean checkHanoi(int array[][]){
    
    for(int i=0; i<array[2].length; i++){
      if (array[2][i]==0){
        return false;
      }
    }
    return true;
  }
}

