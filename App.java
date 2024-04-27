import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al sistema ");
         // Scarleth Julissa Vindel Sequeira
         //N0 carnet :2024-1643U
         try (Scanner op = new Scanner (System.in)) {
         int n1,n2,n3;
           System.out.println("Ingrese  tres numero " );
            n1= op.nextInt();
        
            n2= op.nextInt();
        
            n3= op.nextInt();
        
           System.out.println("Bienvenido al sitema ");
           op.nextLine();
               
                 
           if(n1!=n2 && n1!=n3 && n2!= n3){
              if(n1>n2){
                           
                 if(n1>n3){
                System.out.println( "El numero mayor es :"+n1 );
        
                }else System.out.println("El numero mayor es:" +n3);
        
            }else{
                if (n2>n3){
                  System.out.println("El numero mayor es " +n2);
                 }else {
                 System.out.println("El numero mayor es " +n3);
                 }
                }
        
                 }else {
                  System.out.println("Los numeros deben ser diferentes ");
                  
                 }
                // Este es la diferencia de los mayores y la suma para los menores 
        
                int menor1, menor2, mayor;
        
                if (n1<n2 && n1>n3){
                menor1=n1;
                 if (n2<n3){
                  menor2= n2;
                 mayor=n3;
        
             }
                 else{
                 menor1 =n3;
                 mayor =n2; 
        
             }
            } else if (n2<n1 && n2<n1){
                menor1=n2;
                         
                if (n1<n3){
                 menor2=n1;
                mayor =n3;
                 }
                else{ 
                 menor2=n3;
                mayor=n1;
             }
          
            } else {
              menor1 = n3;  
             }  
             if (n1<n2){
             menor2=n1;
            mayor=n2;
                 
             } 
             else{
              menor2=n2;
             mayor=n1;
         } 
        
            int suma , diferencia ;
            suma= menor1+menor2;
            diferencia = mayor -menor2;
            System.out.println("La suma de los menores es " +suma);
            System.out.println("La diferncia de los mayores es " + diferencia );
        
            System.out.println("Gracias por utilizar el progrma ");
            op.nextLine();
              }
              }
        
                 //FIN DEL PROGRAMA 
        
        {}  
        
        
        
        
          
            
            
        
            
        
            
        
        
        
            
        
        
        
    }

