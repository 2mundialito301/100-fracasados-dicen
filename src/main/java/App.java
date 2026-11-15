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
        int orden[] = new int [11];
        
        int numero = (int)(md.nextDouble()*4.0);
        numero++;
        
        switch (numero)
        {
            case 1: orden = new int [] {1, 8, 10, 2, 5, 7, 3, 11, 9, 4, 6}; break;
            case 2: orden = new int [] {4, 11, 9, 7, 3, 2, 10, 6, 1, 5, 8}; break;
            case 3: orden = new int [] {10, 5, 1, 8, 6, 9, 3, 4, 7, 11, 2}; break;
            case 4: orden = new int [] {3, 2, 4, 11, 9, 7, 1, 8, 6, 10, 5}; break;
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
            else if (orden[i] == 6)
            {
                puntos = pregunta6(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
            else if (orden[i] == 7)
            {
                puntos = pregunta7(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
            else if (orden[i] == 8)
            {
                puntos = pregunta8(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
            else if (orden[i] == 9)
            {
                puntos = pregunta9(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
            else if (orden[i] == 10)
            {
                puntos = pregunta10(puntos);
                System.out.println("PUNTOS TOTALES: " +puntos);
            }
            else if (orden[i] == 11)
            {
                puntos = pregunta11(puntos);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta7 (int puntos)
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
            System.out.println("1. Rio de la Plata --- 23pts");
            System.out.println("2. Rio Parana --- 20pts");
            System.out.println("3. Rio Uruguay --- 15pts");
            System.out.println("4. Rio Matanza - Riachuelo --- 13pts");
            System.out.println("5. Rio Colorado --- 7pts");
            System.out.println("6. Rio Pilcomayo --- 5pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta8 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println(":");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // Charly Garcia - 25p --- 25pt
        System.out.println("2. --- --- ---"); // Fito Paez - 18p --- 43pt
        System.out.println("3. --- --- ---"); // Gustavo Cerati - 15p --- 58pt
        System.out.println("4. --- --- ---"); // Indio Solari - 10p --- 68pt
        System.out.println("5. --- --- ---"); // Spinetta - 8p --- 76pt
        System.out.println("6. --- --- ---"); // Andres Calamaro - 6p --- 82pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println(":");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("Gustavo Charly") || respuestapregunta.equalsIgnoreCase("Charly") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 25;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Fito Paez") || respuestapregunta.equalsIgnoreCase("Fito") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 18;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Gustavo Cerati") || respuestapregunta.equalsIgnoreCase("Cerati") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 15;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("El Indio Solari") || respuestapregunta.equalsIgnoreCase("El Indio") || respuestapregunta.equalsIgnoreCase("Indio Solari") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 10;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Spinetta") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 8;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Andres Calamaro") || respuestapregunta.equalsIgnoreCase("Calamaro") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 6;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. Charly Garcia --- 25pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Fito Paez --- 18pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. Gustavo Cerati --- 15pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Indio Solari --- 10pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. Spinetta --- 8pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Andres Calamaro --- 6pts");
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
            System.out.println("1. Charly Garcia --- 25pts");
            System.out.println("2. Fito Paez --- 18pts");
            System.out.println("3. Gustavo Cerati --- 15pts");
            System.out.println("4. Indio Solari --- 10pts");
            System.out.println("5. Spinetta --- 8pts");
            System.out.println("6. Andres Calamaro --- 6pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta9 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA UN RITMO ARGENTINO:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // Tango - 26p --- 26pt
        System.out.println("2. --- --- ---"); // Chacarera - 17p --- 43pt
        System.out.println("3. --- --- ---"); // Cuarteto - 16p --- 59pt
        System.out.println("4. --- --- ---"); // Chamame - 9p --- 68pt
        System.out.println("5. --- --- ---"); // Cumbia - 7p --- 75pt
        System.out.println("6. --- --- ---"); // Zamba - 4p --- 79pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("DIGA UN RITMO ARGENTINO:");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("Tango") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 26;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Chacarera") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 17;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Cuarteto") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 16;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Chamame") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 9;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Cumbia") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 7;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Zamba") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 4;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. Tango --- 26pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Chacarera --- 17pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. Cuarteto --- 16pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Chamame --- 9pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. Cumbia --- 7pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Zamba --- 4pts");
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
            System.out.println("1. Tango --- 26pts");
            System.out.println("2. Chacarera --- 17pts");
            System.out.println("3. Cuarteto --- 16pts");
            System.out.println("4. Chamame --- 9pts");
            System.out.println("5. Cumbia --- 7pts");
            System.out.println("6. Zamba --- 4pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
    
    
    
    
    
    
    
    
    
    
    
    public static int pregunta10 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA UN PARTIDO POLITICO:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // Peronismo / K - 33p --- 33pt
        System.out.println("2. --- --- ---"); // Liberalismo - 26p --- 59pt
        System.out.println("3. --- --- ---"); // Pro - 13p --- 72pt
        System.out.println("4. --- --- ---"); // UCR - 8p --- 80pt
        System.out.println("5. --- --- ---"); // Izquierda - 5p --- 85pt
        System.out.println("6. --- --- ---"); // Provincial - 3p --- 88pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println("DIGA UN PARTIDO POLITICO:");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("Peronismo") || respuestapregunta.equalsIgnoreCase("Kirchnerismo") || respuestapregunta.equalsIgnoreCase("K") || respuestapregunta.equalsIgnoreCase("Union por la Patria") || respuestapregunta.equalsIgnoreCase("UxP") || respuestapregunta.equalsIgnoreCase("UP") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 33;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Liberalismo") || respuestapregunta.equalsIgnoreCase("LLA") || respuestapregunta.equalsIgnoreCase("La Libertad Avanza") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 26;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("PRO") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 13;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("UCR") || respuestapregunta.equalsIgnoreCase("Union Civica Radical") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 8;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Izquierda") || respuestapregunta.equalsIgnoreCase("FIT") || respuestapregunta.equalsIgnoreCase("FITU") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 5;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Provincial") || respuestapregunta.equalsIgnoreCase("Provinciales") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 3;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. Peronismo / K --- 33pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Liberalismo --- 26pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. PRO --- 13pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. UCR --- 8pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. Izquierda --- 5pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Provincial --- 3pts");
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
            System.out.println("1. Peronismo / K --- 33pts");
            System.out.println("2. Liberalismo --- 26pts");
            System.out.println("3. PRO --- 13pts");
            System.out.println("4. UCR --- 8pts");
            System.out.println("5. Izquierda --- 5pts");
            System.out.println("6. Provincial --- 3pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }












    public static int pregunta11 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA UN BARRIO PORTEÑO:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // Palermo - 20p --- 20pt
        System.out.println("2. --- --- ---"); // Constitucion - 16p --- 36pt
        System.out.println("3. --- --- ---"); // Retiro - 13p --- 49pt
        System.out.println("4. --- --- ---"); // Flores - 11p --- 60pt
        System.out.println("5. --- --- ---"); // Recoleta - 8p --- 68pt
        System.out.println("6. --- --- ---"); // Barracas - 6p --- 74pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println(":");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("Palermo") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 20;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Constitucion") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 16;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Retiro") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 13;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Flores") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 11;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Recoleta") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 8;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Barracas") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 6;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. Palermo --- 20pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Constitucion --- 16pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. Retiro --- 13pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Flores --- 11pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. Recoleta --- 8pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Barracas --- 6pts");
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
            System.out.println("1. Palermo --- 20pts");
            System.out.println("2. Constitucion --- 16pts");
            System.out.println("3. Retiro --- 13pts");
            System.out.println("4. Flores --- 11pts");
            System.out.println("5. Recoleta --- 8pts");
            System.out.println("6. Barracas --- 6pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }












    public static int pregunta11 (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("DIGA LAS PROVINCIAS PATAGONICAS:");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); // Santa Cruz - 25p --- 25pt
        System.out.println("2. --- --- ---"); // Rio Negro - 21p --- 46pt
        System.out.println("3. --- --- ---"); // Tierra del Fuego - 14p --- 60pt
        System.out.println("4. --- --- ---"); // Chubut - 12p --- 72pt
        System.out.println("5. --- --- ---"); // Neuquen - 9p --- 81pt
        System.out.println("6. --- --- ---"); // Buenos Aires - 5p --- 86pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println(":");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("Santa Cruz") && rta1 == 0)
            {
                rta1 = 1;
                puntos += 25;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Rio Negro") && rta2 == 0)
            {
                rta2 = 1;
                puntos += 21;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Tierra del Fuego") && rta3 == 0)
            {
                rta3 = 1;
                puntos += 14;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Chubut") && rta4 == 0)
            {
                rta4 = 1;
                puntos += 12;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Neuquen") && rta5 == 0)
            {
                rta5 = 1;
                puntos += 9;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("Buenos Aires") && rta6 == 0)
            {
                rta6 = 1;
                puntos += 5;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1. Santa Cruz --- 25pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2. Rio Negro --- 21pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3. Tierra del Fuego --- 14pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4. Chubut --- 12pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5. Neuquen --- 9pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6. Buenos Aires --- 5pts");
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
            System.out.println("1. Santa Cruz --- 25pts");
            System.out.println("2. Rio Negro --- 21pts");
            System.out.println("3. Tierra del Fuego --- 14pts");
            System.out.println("4. Chubut --- 12pts");
            System.out.println("5. Neuuquen --- 9pts");
            System.out.println("6. Buenos Aires --- 5pts");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        }
            
        return puntos;
    }
    
    
    
    
    
    
    
    
    
    
    public static int pregunta (int puntos)
    {
        Scanner input = new Scanner (System.in);
        int resueltopregunta=0;
        int fallos=0, correcta=0, mensajefinal=0;
        
        int rta1=0, rta2=0, rta3=0, rta4=0, rta5=0, rta6=0;
        String respuestapregunta = " ";
            
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println(":");
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        System.out.println("1. --- --- ---"); //  - p --- pt
        System.out.println("2. --- --- ---"); //  - p --- pt
        System.out.println("3. --- --- ---"); //  - p --- pt
        System.out.println("4. --- --- ---"); //  - p --- pt
        System.out.println("5. --- --- ---"); //  - p --- pt
        System.out.println("6. --- --- ---"); //  - p --- pt
        System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
        
        while (resueltopregunta==0)
        {
            respuestapregunta = input.nextLine();
            
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            System.out.println(":");
            System.out.println("-- * -- * -- * -- * -- * -- * -- * --");
            
            if (respuestapregunta.equalsIgnoreCase("") && rta1 == 0)
            {
                rta1 = 1;
                puntos += ;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("") && rta2 == 0)
            {
                rta2 = 1;
                puntos += ;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("") && rta3 == 0)
            {
                rta3 = 1;
                puntos += ;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("") && rta4 == 0)
            {
                rta4 = 1;
                puntos += ;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("") && rta5 == 0)
            {
                rta5 = 1;
                puntos += ;
                correcta = 1;
            }
            if (respuestapregunta.equalsIgnoreCase("") && rta6 == 0)
            {
                rta6 = 1;
                puntos += ;
                correcta = 1;
            }
            
            
            
            if (rta1==1)
                System.out.println("1.  --- pts");
            else
                System.out.println("1. --- --- ---");
            
            if (rta2==1)
                System.out.println("2.  --- pts");
            else
                System.out.println("2. --- --- ---");
            
            if (rta3==1)
                System.out.println("3.  --- pts");
            else
                System.out.println("3. --- --- ---");
            
            if (rta4==1)
                System.out.println("4.  --- pts");
            else
                System.out.println("4. --- --- ---");
            
            if (rta5==1)
                System.out.println("5.  --- pts");
            else
                System.out.println("5. --- --- ---");
            
            if (rta6==1)
                System.out.println("6.  --- pts");
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