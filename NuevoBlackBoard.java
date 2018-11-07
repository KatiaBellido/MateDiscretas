import java.util.*;
/* Constanza Gomez y Katia Bellido
Noviembre 6, 2018
Segundo proyecto mates discretas*/
public class NuevoBlackBoard{
  public static void main (String[] args){
    Scanner kb = new Scanner (System.in);
    String[] grupo1;
    String[] grupo2;
    String[] sumaGrupo;
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
9      grupo2= new String [size2];
      grupo1= new String [size1];
      size3=size1+size2;
      sumaGrupo = new String [size3];
      switch (opcion) {
        case 1: System.out.println("¿Cuántos alumnos tienes en tu primer grupo?");
        size1 = kb.nextInt();
        grupo1= new String [size1];
        System.out.println ("Ingresa las matrículas del primer grupo");
        for (counter=0; counter < size1; counter++ ) {
          grupo1[counter]= kb.next();
        }
        break;
        //
        case 2: System.out.println("¿Cuántos alumnos tienes en tu segundo grupo?");
        size2 = kb.nextInt();
        grupo2= new String [size2];
        System.out.println ("Ingresa las matrículas del segundo grupo");
        for (counter=0; counter < size2; counter++ ) {
          grupo2[counter]= kb.next();
        }
        break;
        //
        case 3: size3=(size1+size2);
        if (size3==0) {
          System.out.println("Creo que no creaste los grupos :D");
        }
        for (counter=0, counter2=0; counter < size1; counter++ ) {
            sumaGrupo[counter]= grupo1[counter2];
            counter2++;
        }// no se nada :(
        for (counter=size1,counter3=0;counter < size3 ; counter++ ) {
          sumaGrupo[counter]= grupo1[counter3];
          counter3++;
        }//ends for
        for (counter=0;counter<size3 ;counter++ ) {
          System.out.println(sumaGrupo[counter]);
        }
        break;
        //
        case 7:
        System.out.println("Cual grupo quieres emparejar?")
        eleccion7= kb.nextInt();
        if (eleccion7==1) {

        }
        else if(eleccion7==2) {

        }
        else {
          System.out.println("Solo tienes dos grupos, porfa date cuenta")
        }
        break;
        //
      } //fin switch
    } //fin while
  } //fin main
} //fin class
