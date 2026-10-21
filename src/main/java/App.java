import java.util.Random;
import java.util.Scanner;

public class App
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        Random md = new Random();
        md.nextDouble();
        
        int respuestamenu=0, nivelconocimiento=0;
        
        
        System.out.println("BIENVENIDO A 100 FRACASADOS DICEN.");
        
        System.out.println(" ");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println(" ");
        
        
        
        System.out.println("ELIJA SU NIVEL DE CONOCIMIENTO:");
        
        System.out.println(" ");
        
        System.out.println("1. ELITE BALL KNOWLEDEGDE.");
        System.out.println("2. ALTO");
        System.out.println("2. MEDIO");
        System.out.println("3. MEIDO BAJO");
        System.out.println("5. MUY BAJO");
        System.out.println("SALIR (otro)");
        
        System.out.println(" ");
        
        respuestamenu = input.nextInt();
        
        System.out.println(" ");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println(" ");
        
        
        
        
        
        
        switch (respuestamenu)
        {
            case 1: nivelconocimiento=1; break;
            case 2: nivelconocimiento=2; break;
            case 3: nivelconocimiento=3; break;
            case 4: nivelconocimiento=4; break;
            case 5: nivelconocimiento=5; break;
            default: nivelconocimiento=0; break;
        }
        
        
        
        
        if (nivelconocimiento == 1)
        {
            juegoelite();
        }
        
        else if (nivelconocimiento == 2)
        {
            juegoalto();
        }
        
        else if (nivelconocimiento == 3)
        {
            juegomedio();
        }
        
        else if (nivelconocimiento == 4)
        {
            juegomediobajo();
        }
        
        else if (nivelconocimiento == 5)
        {
            juegobajo();
        }
        else
        {
            System.out.println("Vuelva a jugar la proxima.");
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void juegoelite ()
    {
        Scanner input = new Scanner (System.in);
        Random md = new Random();
        md.nextDouble();
        
        //int numeropregunta = (int)(md.nextDouble()*2.0);
        
        int numeropreguntaelite = 0;
        numeropreguntaelite++;
        
        
        
        switch (numeropreguntaelite)
        {
            case 1: preguntaelite1(); break;
            default: break;
        }
    }
    
    public static void preguntaelite1 ()
    {
        Scanner input = new Scanner (System.in);
        int resueltopreguntaelite1=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestaelitepregunta1 = "a";
            
            while (resueltopreguntaelite1 == 0)
            {
                System.out.println(" ");
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                System.out.println(" ");
                System.out.println("PREGUNTA NRO 1");
                System.out.println(" ");
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                System.out.println(" ");
            
                System.out.println("DIGA UNA FECHA PATRIA:");
                System.out.println(" ");
                System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
                System.out.println(" ");
                
                if (respuestaelitepregunta1.equals("9 de julio") || respuestaelitepregunta1.equals("nueve de julio"))
                { rta1=1; }
                
                if (rta1==1)
                {
                    System.out.println("1. 9 de Julio --- 26 pts"); // 9 de julio - 26p --- 26pt
                }
                else
                {
                    System.out.println("1. --- --- ---"); // 9 de julio - 26p --- 26pt
                }
                
                
                
                
                
                if (respuestaelitepregunta1.equals("25 de mayo") || respuestaelitepregunta1.equals("veinticinco de mayo"))
                { rta2=1; }
                
                if (rta2==1)
                {
                    System.out.println("2. 25 de Mayo --- 22pts"); // 25 de mayo - 22p --- 48pt
                }
                else
                {
                    System.out.println("2. --- --- ---"); // 25 de mayo - 22p --- 48pt
                }
                
                
                
                
                
                if (respuestaelitepregunta1.equals("20 de junio") || respuestaelitepregunta1.equals("veinte de junio"))
                { rta3=1; }
                
                if (rta3==1)
                {
                    System.out.println("3. 20 de Junio --- 12pts"); // 20 de junio - 12p --- 60pt
                }
                else
                {
                    System.out.println("3. --- --- ---"); // 20 de junio - 12p --- 60pt
                }
                
                
                
                
                
                if (respuestaelitepregunta1.equals("2 de abril") || respuestaelitepregunta1.equals("dos de abril"))
                {
                    rta4=1;
                }
                
                if (rta4==1)
                {
                    System.out.println("4. 2 de Abril --- 10pts"); // 2 de abril - 10p --- 70pt
                }
                else
                {
                    System.out.println("4. --- --- ---"); // 2 de abril - 10p --- 70pt
                }
                
                
                
                
                
                if (respuestaelitepregunta1.equals("24 de marzo") || respuestaelitepregunta1.equals("veinticuatro de marzo"))
                { rta5=1; }
                
                if (rta5==1)
                {
                    System.out.println("5. 24 de Marzo --- 7pts"); // 24 de marzo - 7p --- 77pt
                }
                else
                {
                    System.out.println("5. --- --- ---"); // 24 de marzo - 7p --- 77pt
                }
                
                
                
                
                
                if (respuestaelitepregunta1.equals("20 de noviembre") || respuestaelitepregunta1.equals("veinte de noviembre"))
                { rta6=1; }
                
                if (rta6==1)
                {
                    System.out.println("6. 20 de Noviembre --- 3pts"); // 20 de noviembre - 3p --- 80pt
                }
                else
                {
                    System.out.println("6. --- --- ---"); // 20 de noviembre - 3p --- 80pt
                }
                
                
                
                respuestaelitepregunta1 = input.nextLine();
                
                if ( rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
                {
                    resueltopreguntaelite1 = 1;
                }
                
            }
           
    }
    
    
    
    
    
    
    
    
    
    public static void juegoalto ()
    {
        System.out.println("soso");
    }
    
    
    
    
    
    
    
    
    
    
    public static void juegomedio ()
    {
        System.out.println("papa");
    }
    
    
    
    
    
    
    
    
    
    public static void juegomediobajo ()
    {
        System.out.println("dakdlw");
    }
    
    
    
    
    
    
    
    
    
    public static void juegobajo ()
    {
        System.out.println("jijijijijijijijii");
    }
    
}
