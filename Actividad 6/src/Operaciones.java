import java.util.Scanner;

public class Operaciones {
    Scanner scan = new Scanner(System.in);
    int i = 0;
    String nombre;
    int[] calificaciones = new int[5];
    int suma;
    int resultado;
    String calificacion;

    public void obtenerValores(){
        System.out.println("Por favor ingrese su nombre");
        nombre = scan.nextLine();
        System.out.println();

        while (i < 5){
            System.out.print("Por favor ingrese su calificación: ");
            calificaciones[i] = scan.nextInt();
            i++;
        }
    }

    public void promedio(){
        i = 0;
     while (i < 5){
         suma = calificaciones[i]+suma;
         i++;
     }
        resultado = suma/5;
    }

    public void asignacion(){
        if (resultado <= 50){
           calificacion = "F";
        } else if (resultado >= 51 && resultado <=60 ){
            calificacion = "E";
        } else if (resultado >= 61 && resultado <=70 ){
            calificacion = "D";
        } else if (resultado >= 71 && resultado <=80 ){
            calificacion = "C";
        } else if (resultado >= 81 && resultado <=90 ){
            calificacion = "B";
        }else if (resultado >= 91 && resultado <=100 ){
            calificacion = "A";
        }
    }

    public void mostrar(){
        System.out.println();
        System.out.println("Nombre del estudiante: " + nombre);
        i=0;
        int j=1;
        while (i < 5){
            System.out.println("Calificación "+(j)+": "+calificaciones[i]);
            i++;
            j++;
        }
        System.out.println("Promedio: "+resultado);
        System.out.println("Calificación: "+calificacion);
    }

}
