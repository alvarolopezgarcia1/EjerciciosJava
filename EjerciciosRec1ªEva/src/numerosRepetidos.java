import java.util.Random;

public class numerosRepetidos {


	
    public static void main(String[] args) {
		
        try{
            FileReader fr = new FileReader(cajaTexto.getText());
            BufferedReader br = new BufferedReader(fr);
            String texto;
            while((texto=br.readLine())!=null){
               System.out.println(texto);
            }
            int c = 0;
            for(int i=0;i<texto.length();i++) {
              if ((texto.charAt(i)=='a')){
                c++;
      }
        System.out.println(  "La letra (a) se repite " + c + " veces en el archivo.");       
    }
            
            }catch(Exception ex){}
        }
}