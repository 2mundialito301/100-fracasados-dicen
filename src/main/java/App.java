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
        int orden[] = new int [5];
        
        int numero = (int)(md.nextDouble()*4.0);
        numero++;
        
        switch (numero)
        {
            case 1: orden = new int [] {1, 2, 5, 3, 4}; break;
            case 2: orden = new int [] {4, 3, 2, 1, 5}; break;
            case 3: orden = new int [] {5, 1, 3, 4, 2}; break;
        }
        

        
        for (int i=0; i<orden.length; i++)
        {
            if (orden[i] == 1)
            {
                puntos = pregunta1(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
            else if (orden[i] == 2)
            {
                puntos = pregunta2(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
            else if (orden[i] == 3)
            {
                puntos = pregunta3(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
            else if (orden[i] == 4)
            {
                puntos = pregunta4(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
            else if (orden[i] == 5)
            {
                puntos = pregunta5(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta1 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = "";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA UNA FECHA PATRIA:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // 9 de Julio - 28p --- 28pt
        System.out.println("2. --- --- ---"); // 25 de Mayo - 22p --- 50pt
        System.out.println("3. --- --- ---"); // 2 de Abril - 15p --- 65pt
        System.out.println("4. --- --- ---"); // 20 de Junio - 11p --- 76pt
        System.out.println("5. --- --- ---"); // 24 de Marzo - 9p --- 85pt
        System.out.println("6. --- --- ---"); // 20 de Noviembre - 4p --- 89pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("DIGA UNA FECHA PATRIA:");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("9 de Julio") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 28;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("25 de Mayo") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 22;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("2 de Abril") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 15;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("20 de Junio") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 11;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("24 de Marzo") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 9;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("20 de Noviembre") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 4;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. 9 de Julio --- 28pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. 25 de Mayo --- 22pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. 2 de Abril --- 15pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. 20 de Junio --- 11pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. 24 de Marzo --- 9pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. 20 de Noviembre --- 4pts");
            else
                System.out.println("6. --- --- ---");
            
            
            
            if (correcta == 0)
            {
                fallos++;
            }
            correcta=0;
            
            if (fallos == 3)
            {
                resueltopregunta = 1;
            }
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("PUNTOS: " +puntos);
            System.out.println("FALLOS: " +fallos );
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            
            if (rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
            {
                resueltopregunta = 1;
                mensajefinal = 1;
            }
        }
        
        if (mensajefinal == 1)
        {
            System.out.println(" ");
            System.out.println("PREGUNTA COMPLETADA");
            System.out.println(" ");
        }
        else
        {
            System.out.println(" ");
            System.out.println("PREGUNTA PERDIDA");
            System.out.println(" ");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("1. 9 de Julio --- 28pts");
            System.out.println("2. 25 de Mayo --- 22pts");
            System.out.println("3. 2 de Abril --- 15pts");
            System.out.println("4. 20 de Junio --- 11pts");
            System.out.println("5. 24 de Marzo --- 9pts");
            System.out.println("6. 20 de Noviembre --- 4pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta2 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = "";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA UN PARTIDO DE ZONA SUR:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // Quilmes - 23p --- 23pt
        System.out.println("2. --- --- ---"); // Ezeiza - 18p --- 41pt
        System.out.println("3. --- --- ---"); // Avellaneda - 15p --- 56pt
        System.out.println("4. --- --- ---"); // Lomas de Zamora - 12p --- 68pt
        System.out.println("5. --- --- ---"); // Florencio Varela - 9p --- 77pt
        System.out.println("6. --- --- ---"); // Lanus - 7p --- 84pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("DIGA UN PARTIDO DE ZONA SUR:");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("Quilmes") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 23;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Ezeiza") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 18;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Avellaneda") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 15;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Lomas de Zamora") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 12;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Florencio Varela") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 9;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Lanus") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 7;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. Quilmes --- 23pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Ezeiza --- 18pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. Avellaneda --- 15pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Lomas de Zamora --- 12pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. Florencio Varela --- 9pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Lanus --- 7pts");
            else
                System.out.println("6. --- --- ---");
            
            
            
            if (correcta == 0)
            {
                fallos++;
            }
            correcta=0;
            
            if (fallos == 3)
            {
                resueltopregunta = 1;
            }
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("PUNTOS: " +puntos);
            System.out.println("FALLOS: " +fallos );
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            
            if (rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
            {
                resueltopregunta = 1;
                mensajefinal = 1;
            }
        }
        
        if (mensajefinal == 1)
        {
            System.out.println(" ");
            System.out.println("PREGUNTA COMPLETADA");
            System.out.println(" ");
        }
        else
        {
            System.out.println(" ");
            System.out.println("PREGUNTA PERDIDA");
            System.out.println(" ");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("1. Quilmes --- 23pts");
            System.out.println("2. Ezeiza --- 20pts");
            System.out.println("3. Avellaneda --- 16pts");
            System.out.println("4. Lomas de Zamora --- 12pts");
            System.out.println("5. Florencio Varela --- 10pts");
            System.out.println("6. Lanus --- 8pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta3 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = "";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA UN PARTIDO DE ZONA OESTE:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // La Matanza - 40p --- 40pt
        System.out.println("2. --- --- ---"); // Moreno - 19p --- 59pt
        System.out.println("3. --- --- ---"); // Morón - 13p --- 72pt
        System.out.println("4. --- --- ---"); // Merlo - 10p --- 82pt
        System.out.println("5. --- --- ---"); // 3 de Febrero - 7p --- 89pt
        System.out.println("6. --- --- ---"); // Ituzaingó - 6p --- 95pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("DIGA UN PARTIDO DE ZONA SUR:");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("La Matanza") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 40;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Moreno") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 19;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Moron") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 13;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Merlo") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 10;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("3 de Febrero") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 7;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Ituzaingo") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 6;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. La Matanza --- 40pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Moreno --- 19pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. Moron --- 13pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Merlo --- 10pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. 3 de Febrero --- 7pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Ituzaingo --- 6pts");
            else
                System.out.println("6. --- --- ---");
            
            
            
            if (correcta == 0)
            {
                fallos++;
            }
            correcta=0;
            
            if (fallos == 3)
            {
                resueltopregunta = 1;
            }
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("PUNTOS: " +puntos);
            System.out.println("FALLOS: " +fallos );
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            
            if (rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
            {
                resueltopregunta = 1;
                mensajefinal = 1;
            }
        }
        
        if (mensajefinal == 1)
        {
            System.out.println(" ");
            System.out.println("PREGUNTA COMPLETADA");
            System.out.println(" ");
        }
        else
        {
            System.out.println(" ");
            System.out.println("PREGUNTA PERDIDA");
            System.out.println(" ");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("1. La Matanza --- 40pts");
            System.out.println("2. Moreno --- 19pts");
            System.out.println("3. Moron --- 13pts");
            System.out.println("4. Merlo --- 10pts");
            System.out.println("5. 3 de Febrero --- 7pts");
            System.out.println("6. Ituzaingo --- 6pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta4 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA UN PARTIDO DE ZONA NORTE:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // Tigre - 21p --- 21pt
        System.out.println("2. --- --- ---"); // Jose C. Paz - 18p --- 39pt
        System.out.println("3. --- --- ---"); // San Isidro - 16p --- 54pt
        System.out.println("4. --- --- ---"); // Vicente Lopez - 14p --- 68pt
        System.out.println("5. --- --- ---"); // San Miguel - 12p --- 80pt
        System.out.println("6. --- --- ---"); // Gral. San Martin - 9p --- 89pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("DIGA UN PARTIDO DE ZONA NORTE:");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("Tigre") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 21;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Jose C Paz") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 18;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("San Isidro") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 16;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Vicente Lopez") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 14;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("San Miguel") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 12;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("San Martin") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 9;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. Tigre --- 21pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Jose C Paz --- 18pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. San Isidro --- 16pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Vicente Lopez --- 14pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. San Miguel --- 12pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Gral. San Martin --- 9pts");
            else
                System.out.println("6. --- --- ---");
            
            
            
            if (correcta == 0)
            {
                fallos++;
            }
            correcta=0;
            
            if (fallos == 3)
            {
                resueltopregunta = 1;
            }
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("PUNTOS: " +puntos);
            System.out.println("FALLOS: " +fallos );
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            
            if (rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
            {
                resueltopregunta = 1;
                mensajefinal = 1;
            }
        }
        
        if (mensajefinal == 1)
        {
            System.out.println(" ");
            System.out.println("PREGUNTA COMPLETADA");
            System.out.println(" ");
        }
        else
        {
            System.out.println(" ");
            System.out.println("PREGUNTA PERDIDA");
            System.out.println(" ");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("1. Tigre --- 21pts");
            System.out.println("2. Jose C. Paz --- 18pts");
            System.out.println("3. San Isidro --- 16pts");
            System.out.println("4. San Miguel --- 14pts");
            System.out.println("5. Vicente Lopez --- 12pts");
            System.out.println("6. Gral. San Martin --- 9pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }










    public static int pregunta5 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA 6 PROCERES ARGENTINOS:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // San Martin - 31p --- 31pt
        System.out.println("2. --- --- ---"); // Belgrano - 24p --- 55pt
        System.out.println("3. --- --- ---"); // Sarmiento - 13p --- 68pt
        System.out.println("4. --- --- ---"); // Rosas - 9p --- 77pt
        System.out.println("5. --- --- ---"); // Saavedra - 6p --- 83pt
        System.out.println("6. --- --- ---"); // Guemes - 4p --- 87pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("DIGA 6 PROCERES ARGENTINOS:");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("San Martin") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 31;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Belgrano") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 24;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Sarmiento") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 13;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Rosas") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 9;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Saavedra") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 6;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Guemes") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 4;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. San Martin --- 31pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Belgrano --- 24pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. Sarmiento --- 13pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Rosas --- 9pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. Saavedra --- 6pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Guemes --- 4pts");
            else
                System.out.println("6. --- --- ---");
            
            
            
            if (correcta == 0)
            {
                fallos++;
            }
            correcta=0;
            
            if (fallos == 3)
            {
                resueltopregunta = 1;
            }
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("PUNTOS: " +puntos);
            System.out.println("FALLOS: " +fallos );
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            
            if (rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
            {
                resueltopregunta = 1;
                mensajefinal = 1;
            }
        }
        
        if (mensajefinal == 1)
        {
            System.out.println(" ");
            System.out.println("PREGUNTA COMPLETADA");
            System.out.println(" ");
        }
        else
        {
            System.out.println(" ");
            System.out.println("PREGUNTA PERDIDA");
            System.out.println(" ");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("1. San Martin --- 31pts");
            System.out.println("2. Belgrano --- 24pts");
            System.out.println("3. Sarmiento --- 13pts");
            System.out.println("4. Rosas --- 9pts");
            System.out.println("5. Saavedra --- 6pts");
            System.out.println("6. Guemes --- 4pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta6 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println(":");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // Buenos Aires (PBA + CABA) - 32p --- 32pt
        System.out.println("2. --- --- ---"); // Corodba - 15p --- 47pt
        System.out.println("3. --- --- ---"); // Santa Fe - 12p --- 59pt
        System.out.println("4. --- --- ---"); // Mendoza - 9p --- 68pt
        System.out.println("5. --- --- ---"); // Tucuman - 7p --- 75pt
        System.out.println("6. --- --- ---"); // Salta - 6p --- 81pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println(":");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("Buenos Aires") || respuestapregunta.equalsIgnoreCase("CABA") || respuestapregunta.equalsIgnoreCase("Capital") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 32;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Cordoba") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 15;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Santa Fe") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 12;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Mendoza") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 9;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Tucuman") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 7;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Salta") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 6;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. Buenos Aires (PBA + CABA) --- 32pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Cordoba --- 15pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. Santa Fe --- 12pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Mendoza --- 9pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. Tucuman --- 7pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Salta --- 6pts");
            else
                System.out.println("6. --- --- ---");
            
            
            
            if (correcta == 0)
            {
                fallos++;
            }
            correcta=0;
            
            if (fallos == 3)
            {
                resueltopregunta = 1;
            }
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("PUNTOS: " +puntos);
            System.out.println("FALLOS: " +fallos );
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            
            if (rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
            {
                resueltopregunta = 1;
                mensajefinal = 1;
            }
        }
        
        if (mensajefinal == 1)
        {
            System.out.println(" ");
            System.out.println("PREGUNTA COMPLETADA");
            System.out.println(" ");
        }
        else
        {
            System.out.println(" ");
            System.out.println("PREGUNTA PERDIDA");
            System.out.println(" ");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("1. Buenos Aires (PBA + CABA) --- 32pts");
            System.out.println("2. Cordoba --- 15pts");
            System.out.println("3. Santa Fe --- 12pts");
            System.out.println("4. Mendoza --- 9pts");
            System.out.println("5. Tucuman --- 7pts");
            System.out.println("6. Salta --- 6pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta6 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA 6 RIOS DEL PAIS:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // Rio de la Plata - 23p --- 23pt
        System.out.println("2. --- --- ---"); // Rio Parana - 20p --- 43pt
        System.out.println("3. --- --- ---"); // Rio Uruguay - 15p --- 58pt
        System.out.println("4. --- --- ---"); // Rio Matanza - Riachuelo - 13p --- 71pt
        System.out.println("5. --- --- ---"); // Rio Colorado - 7p --- 78pt
        System.out.println("6. --- --- ---"); // Rio Pilcomayo  - 5p --- 83pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println(":");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("Rio de la Plata") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 23;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Rio Uruguay") || respuestapregunta.equalsIgnoreCase("Uruguay") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 20;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Rio Parana") || respuestapregunta.equalsIgnoreCase("Parana") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 15;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Rio Matanza") || respuestapregunta.equalsIgnoreCase("Matanza") || respuestapregunta.equalsIgnoreCase("Riachuelo") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 13;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Rio Colorado") || respuestapregunta.equalsIgnoreCase("Colorado") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 7;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Rio Pilcomayo") || respuestapregunta.equalsIgnoreCase("Pilcomayo") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 5;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. Rio de la Plata --- 23pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2.Rio Parana  --- 20pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. Rio Uruguay --- 15pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Rio Matanza - Riachuelo --- 13pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. Rio Colorado --- 7pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Rio Pilcomayo --- 5pts");
            else
                System.out.println("6. --- --- ---");
            
            
            
            if (correcta == 0)
            {
                fallos++;
            }
            correcta=0;
            
            if (fallos == 3)
            {
                resueltopregunta = 1;
            }
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("PUNTOS: " +puntos);
            System.out.println("FALLOS: " +fallos );
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            
            if (rta1==1 && rta2==1 && rta3==1 && rta4==1 && rta5==1 &&rta6==1)
            {
                resueltopregunta = 1;
                mensajefinal = 1;
            }
        }
        
        if (mensajefinal == 1)
        {
            System.out.println(" ");
            System.out.println("PREGUNTA COMPLETADA");
            System.out.println(" ");
        }
        else
        {
            System.out.println(" ");
            System.out.println("PREGUNTA PERDIDA");
            System.out.println(" ");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("1.  --- pts");
            System.out.println("2.  --- pts");
            System.out.println("3.  --- pts");
            System.out.println("4.  --- pts");
            System.out.println("5.  --- pts");
            System.out.println("6.  --- pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
}