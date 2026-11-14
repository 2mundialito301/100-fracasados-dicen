import java.util.Random;
import java.util.Scanner;

public class App
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        Random md = new Random();
        md.nextDouble();
        
        int puntos=0, numeropregunta=1;
        int orden[] = new int [2];
        
        int numero = (int)(md.nextDouble()*2.0);
        numero++;
        
        switch (numero)
        {
            case 1: orden = new int [] {1, 2}; break;
            case 2: orden = new int [] {2, 1}; break;
        }
        

        
        for (int i=0; i<orden.length; i++)
        {
            if (orden[i] == 1)
            {
                pregunta1(puntos);
            }
            else if (orden[i] == 2)
            {
                pregunta2(puntos);
            }
        }
    }
    
    
    
    
    
    public static int pregunta1 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = "";
            
            while (resueltopregunta == 0)
            {
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                System.out.println("DIGA UNA FECHA PATRIA:");
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                
                
                
                if (respuestapregunta.equals("9 de julio")) // 9 de julio - 31p --- 31pt
                {   
                    rta1=1; 
                    puntos = puntos + 31;
                }
                else
                {
                    fallos++;
                }
                
                if (rta1==1)
                {
                    System.out.println("1. 9 de Julio --- 31pts");
                }
                else
                {
                    System.out.println("1. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("25 de mayo")) // 25 de mayo - 22p --- 53pt
                {   
                    rta2=1; 
                    puntos = puntos + 22;
                }
                else
                {
                    fallos++;
                }
                
                if (rta2==1)
                {
                    System.out.println("2. 25 de Mayo --- 22pts");
                }
                else
                {
                    System.out.println("2. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("20 de junio")) // 20 de junio - 12p --- 65pt
                {   
                    rta3=1; 
                    puntos = puntos + 12;
                }
                else
                {
                    fallos++;
                }
                
                if (rta3==1)
                {
                    System.out.println("3. 20 de Junio --- 12pts");
                }
                else
                {
                    System.out.println("3. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("2 de abril")) // 2 de abril - 10p --- 75pt
                {   
                    rta4=1; 
                    puntos = puntos + 10;
                }
                else
                {
                    fallos++;
                }
                
                if (rta4==1)
                {
                    System.out.println("4. 2 de Abril --- 10pts");
                }
                else
                {
                    System.out.println("4. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("24 de marzo")) // 24 de marzo - 7p --- 82pt
                {   
                    rta5=1; 
                    puntos = puntos + 7;
                }
                else
                {
                    fallos++;
                }
                
                if (rta5==1)
                {
                    System.out.println("5. 24 de Marzo --- 7pts");
                }
                else
                {
                    System.out.println("5. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("20 de noviembre")) // 20 de noviembre - 3p --- 85pt
                {   
                    rta6=1; 
                    puntos = puntos + 3;
                }
                else
                {
                    fallos++;
                }
                
                if (rta6==1)
                {
                    System.out.println("6. 20 de Noviembre --- 3pts");
                }
                else
                {
                    System.out.println("6. --- --- ---");
                }
                
                
                
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                System.out.println("PUNTOS: " +puntos);
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                
                
                
                if (rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
                {
                    resueltopregunta = 1;
                }
                else
                {
                    respuestapregunta = input.nextLine();
                }
                
                if (fallos==3)
                {
                    resueltopregunta = 1;
                }
                
            }
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("PREGUNTA COMPLETADA");
            
            int retorno = puntos;
            
            return retorno;
    }
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta2 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = "";
            
            while (resueltopregunta == 0)
            {
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                System.out.println("UN PARTIDO DE ZONA SUR:");
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                
                
                
                if (respuestapregunta.equals("quilmes"))
                {   
                    rta1=1; 
                    puntos = puntos + 25;
                }
                else
                {
                    fallos++;
                }
                
                if (rta1==1)
                {
                    System.out.println("1. Quilmes --- 25pts"); //     Quilmes - 25p --- 25pt
                }
                else
                {
                    System.out.println("1. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("avellaneda"))
                {   
                    rta2=1; 
                    puntos = puntos + 17;
                }
                else
                {
                    fallos++;
                }
                
                if (rta2==1)
                {
                    System.out.println("2. Avellaneda --- 17pts"); // Avellaneda - 17p --- 42pt
                }
                else
                {
                    System.out.println("2. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("ezeiza"))
                {   
                    rta3=1; 
                    puntos = puntos + 15;
                }
                else
                {
                    fallos++;
                }
                
                if (rta3==1)
                {
                    System.out.println("3. Ezeiza --- 15pts"); // Ezeiza - 15p --- 57pt
                }
                else
                {
                    System.out.println("3. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("lomas") || respuestapregunta.equals("lomas de zamora"))
                {   
                    rta4=1; 
                    puntos = puntos + 14;
                }
                else
                {
                    fallos++;
                }
                
                if (rta4==1)
                {
                    System.out.println("4. Lomas de Zamora--- 14pts"); // Lomas de Zamora - 10p --- 67pt
                }
                else
                {
                    System.out.println("4. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("varela") || respuestapregunta.equals("florencio varela")) // Varela - 10p --- 77pt
                {   
                    rta5=1; 
                    puntos = puntos + 10;
                }
                else
                {
                    fallos++;
                }
                
                if (rta5==1)
                {
                    System.out.println("5. Florencio Varela --- 7pts");
                }
                else
                {
                    System.out.println("5. --- --- ---");
                }
                
                
                
                if (respuestapregunta.equals("lanus")) // Lanus - 6p --- 83pt
                {   
                    rta6=1; 
                    puntos = puntos + 6;
                }
                else
                {
                    fallos++;
                }
                
                if (rta6==1)
                {
                    System.out.println("6. Lanus --- 3pts");
                }
                else
                {
                    System.out.println("6. --- --- ---");
                }
                
                
                
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                System.out.println("PUNTOS: " +puntos);
                
                
                
                if (rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
                {
                    resueltopregunta = 1;
                }
                else
                {
                    respuestapregunta = input.nextLine();
                }
                
                if (fallos==3)
                {
                    resueltopregunta = 1;
                }
                
            }
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("PREGUNTA COMPLETADA");
            
            int retorno = puntos;
            
            return retorno;
    }
}
