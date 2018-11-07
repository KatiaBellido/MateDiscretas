import java.util.*;
/* Constanza Gomez y Katia Bellido
Noviembre 6, 2018
Segundo proyecto mates discretas*/
public class NuevoBlackBoard2{
  public static void main (String[] args){
    Scanner kb = new Scanner (System.in);
    String[] grupo1;
    String[] grupo2;
    String[] sumaGrupo;
    grupo2= new String [100];
    grupo1= new String [100];
    sumaGrupo = new String [200];
    String algo="";
    int counter = 0,counter2=0, counter3=0, opcion=0, size1 = 0, size2 = 0, size3=0;
    int eleccion7=0;

    while (opcion != 9){
      System.out.println ("---------------------------------------------");
      System.out.println ("Hola, este es el nuevo Blackboard para profesores. Estas son nuestras opciones: (Eliga el número de opción que quieras efectuar)");
      System.out.println ("---------------------------------------------");
      System.out.println ("1. Ingresa matrículas del primer grupo\n 2. Ingresa matrículas del segundo grupo \n 3. Generar grupo con los dos grupos");
      System.out.println ("4. Generar grupo con los alumnos en ambos grupos\n 5. Mostrar todos los equipos posibles en el grupo \n 6. Generar todas las parejas de estudio posibles entre ambos grupos");
      System.out.println ("7. Ordenar matrículas de algún grupo de manera ascendente\n 8. Revisar si un grupo de matrículas perteneces parcial o por completo a alguno de los dos grupos\n 9. Salir del nuevo Blackboard para profesores");
      System.out.println ("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      opcion = kb.nextInt();
      if (opcion==1) {
       System.out.println("¿Cuántos alumnos tienes en tu primer grupo?");
       size1 = kb.nextInt();
       System.out.println ("Ingresa las matrículas del primer grupo");
       for (counter=0; counter < size1; counter++ ) {
         grupo1[counter]= kb.next();
       }//termina for
       for (counter=0;counter<size1 ;counter++ ) {
         System.out.println("*"+grupo1[counter]);
       }//solo para imprimir
      }//termina if opcion 1
      if (opcion==2) {
        System.out.println("¿Cuántos alumnos tienes en tu segundo grupo?");
        size2 = kb.nextInt();;
        System.out.println ("Ingresa las matrículas del segundo grupo");
        for (counter=0; counter < size2; counter++ ) {
          grupo2[counter]= kb.next();
        }
      }//ends else if opcion 2
      if (opcion==3) {

        for (counter=0;counter<size1 ;counter++ ) {
          System.out.print(grupo1[counter]+"+");
        }
        size3=(size1+size2);
        if (size3==0) {
          System.out.println("Creo que no creaste los grupos :D");
        }
        for (counter=0, counter2=0; counter < size1; counter++ ) {
            sumaGrupo[counter]= grupo1[counter2];
            System.out.print("^"+grupo1[counter2]);
            counter2++;
        }// no se nada :(
        for (counter=size1,counter3=0;counter < size3 ; counter++ ) {
          sumaGrupo[counter]= grupo1[counter3];
          counter3++;
        }//ends for
        for (counter=0;counter<size3 ;counter++ ) {
          System.out.println("`"+sumaGrupo[counter]);
        }
      }// termina opcion3
      if (opcion==4) {
        System.out.print("{");
        for (counter=0;counter<size1 ; counter++) {
          System.out.print(grupo1[counter]);
        }
        System.out.print("}");
        System.out.print("{");
        for (counter=0;counter<size2 ;counter++ ) {
          System.out.print(grupo2[counter]);
        }
        System.out.print("}");
      }//termina if opcion4
      if (opcion==7) {
        System.out.println("Cual grupo quieres emparejar?");
        eleccion7= kb.nextInt();
        if (eleccion7==1) {

        }
        else if(eleccion7==2) {

        }
        else {
          System.out.println("Solo tienes dos grupos, porfa date cuenta");
        }
      }//termina opcion7

    } //fin while
  } //fin main
} //fin class
