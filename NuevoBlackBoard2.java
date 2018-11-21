import java.util.*;
/* Constanza Gomez y Katia Bellido
Noviembre 6, 2018
Segundo proyecto mates discretas*/
public class NuevoBlackBoard2{
  public static int contLista = 0;
  public static String[] listaPalabras = new String[1000];
  public static void main (String[] args){
    Scanner kb = new Scanner (System.in);
    String[] grupo1;
    String[] grupo2;
    String[] nuevogrupo;
    String[] sumaGrupo;
    String[] matriculasIguales;
    String[][] matriculasEquipos;
    String[] matriculasOrdenadas;
    int[] matriculasSinA;
    grupo2= new String [100];
    grupo1= new String [100];
    nuevogrupo=new String[100];
    sumaGrupo = new String [200];
    matriculasIguales=new String [200];
    matriculasEquipos= new String [100][100];
    matriculasOrdenadas= new String[100];

    String algo="",sinA="";
    int counter = 0,counter2=0, counter3=0, opcion=0, size1 = 0, size2 = 0, size3=0, size4=0;
    int eleccion5=0, eleccion7=0,eleccion8=0, integrantes=0, matrisinA=0, sizeNuevo=0, existe1=0,existe2=0, mayor=0;
    double sub=0.0;

    while (opcion != 9){
      System.out.println ("---------------------------------------------");
      System.out.println ("Hola, este es el nuevo Blackboard para profesores. Estas son nuestras opciones: (Eliga el número de opción que quieras efectuar)");
      System.out.println ("---------------------------------------------");
      System.out.println ("1. Ingresa matrículas del primer grupo\n2. Ingresa matrículas del segundo grupo\n3. Generar grupo con los alumnos en ambos grupos");
      System.out.println ("4. Generar grupo con los dos grupos\n5. Mostrar todos los equipos posibles en el grupo\n6. Generar todas las parejas de estudio posibles entre ambos grupos");
      System.out.println ("7. Ordenar matrículas de algún grupo de manera ascendente\n8. Revisar si un grupo de matrículas perteneces parcial o por completo a alguno de los dos grupos\n9. Salir del nuevo Blackboard para profesores");
      System.out.println ("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      opcion = kb.nextInt();

      if (opcion==1) {
       System.out.println("¿Cuántos alumnos tienes en tu primer grupo?");
       size1 = kb.nextInt();
       System.out.println ("Ingresa las matrículas del primer grupo");
       for (counter=0; counter < size1; counter++ ) {
         grupo1[counter]= kb.next();
       }//termina for
      System.out.println (" "); //espacio en blanco

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
        System.out.println (" "); //espacio en blanco
        for (counter=0;counter<size2 ;counter++ ) {
          System.out.println("*"+grupo2[counter]);
        }//solo para imprimir
      }//ends else if opcion 2

      if (opcion==3) {
        if (size1>size2) {
        System.out.println (" "); //espacio en blanco
         System.out.println("Estas son las matrículas que aparecen en los dos grupos: ");
          for (counter=0,size4=0;counter<size1 ;counter++ ) {
            for (counter2=0;counter2<size2 ;counter2++ ) {
              if (grupo1[counter].equals(grupo2[counter2])) {
                matriculasIguales[size4]=grupo1[counter];
                System.out.print("^"+matriculasIguales[counter]);
                size4++;
              }//
            }//termina for nested
            if (size4==0) {
              System.out.print("ninguna");
            }
          }
        }//termina if nested
        else if (size2>size1) {  //esta parte esta arriba el primer if todavía nop:D
          System.out.println (" "); //espacio en blanco
          System.out.println("Estas son las matrículas que aparecen en los dos grupos: ");
          for (counter=0,size4=0;counter<size2 ;counter++ ) {
            for (counter2=0;counter2<size1 ;counter2++ ) {
              if (grupo1[counter2].equals(grupo2[counter])) {
                matriculasIguales[size4]=grupo2[counter];
                  System.out.print("^"+matriculasIguales[size4]);
                size4++;
              }//
            }//termina for nested
            if (size4==0) {
              System.out.print("ninguna");
            }
          }//termina for :D
        }//termina else if
        else if (size2==size1) {
            System.out.println("estas son las matrículas que aparecen en los dos grupos: ");
            for (counter=0,size4=0;counter<size2 ;counter++ ) {
              for (counter2=0;counter2<size1 ;counter2++ ) {
                if (grupo1[counter2].equals(grupo2[counter])) {
                  matriculasIguales[size4]=grupo2[counter];
                    System.out.println("^"+matriculasIguales[size4]);
                  size4++;
                }//
              }//termina for nested
              if (size4==0) {
                System.out.print("ninguna");
              }
            }//termina for :D
        }//termina else 2
      }//termina if opcion3

      if (opcion==4) {
        size3=(size1+size2);
        if (size3==0) {
          System.out.println("Creo que no creaste los grupos :D");
        }
        for (counter=0, counter2=0; counter < size1; counter++ ) {
            sumaGrupo[counter]= grupo1[counter2];
            counter2++;
        }// no se nada :(
        for (counter=size1,counter3=0;counter < size3 ; counter++ ) {
          sumaGrupo[counter]= grupo2[counter3];
          counter3++;
        }//ends for

        for (counter=0; counter<size3; counter++) {
          for (counter2=0; counter2<size4; counter2++) {
            if (sumaGrupo[counter].equals(matriculasIguales[counter2])){
              sumaGrupo[counter]=" ";
            } //end if
          } //end for nested
        } //end for
        for (counter=0;counter<size3;counter++ ) {
          if (sumaGrupo[counter]!=" "){
            System.out.println("-"+sumaGrupo[counter]);
          } //termina if
        }// termina for
        for (counter=0; counter<size4; counter++) {
          System.out.println("-"+matriculasIguales[counter]);
        }
      } //termina opcion4

      if (opcion==5){
        System.out.println ("¿De que grupo quieres formar los equipos?");
        eleccion5 = kb.nextInt();
        if (eleccion5==1){
          sub = Math.pow(2, size1) -1;
          System.out.println ("vacío");
          for (counter=1;counter<=size1 ;counter++) {
            Perm2(grupo1, "",counter, size1);
          }

        } //termina if primer grupo
        if (eleccion5==2){
          sub = Math.pow(2, size2-1);
          System.out.println ("vacío");
          for (counter2=1;counter2<=size2 ;counter2++) {
            Perm2(grupo2, "",counter2, size2);
          }

        } //termina if segundo grupo
        contLista = 0;
      } //termina opcion 5

      if (opcion==6){
        if (size1>size2) {
          for (counter=0;counter<size1 ;counter++ ) {
            for (counter2=0;counter2<size2 ;counter2++ ) {
              if (!(grupo1[counter].equals(grupo2[counter2]))) {
                System.out.print(grupo1[counter]);
                System.out.print(grupo2[counter2]);
                System.out.println(" ");
              }//
            }//termina for nested
          }//termina for :D
        }//termina if nested
        else if (size2>size1) {  //esta parte esta arriba el primer if todavía nop:D
          System.out.println("estas son las matrículas que aparecen en los dos grupos: ");
          for (counter=0,size4=0;counter<size2 ;counter++ ) {
            for (counter2=0;counter2<size1 ;counter2++ ) {
              if (!(grupo1[counter2].equals(grupo2[counter]))) {
                System.out.print(grupo1[counter2]);
                System.out.print(grupo2[counter]);
                System.out.println(" ");
              }//termina if
            }//termina for nested
          }//termina for :D
        }//termina else if
        else if (size2==size1) {
            System.out.println("estas son las matrículas que aparecen en los dos grupos: ");
            for (counter=0,size4=0;counter<size2 ;counter++ ) {
              for (counter2=0;counter2<size1 ;counter2++ ) {
                if (!(grupo1[counter2].equals(grupo2[counter]))) {
                  System.out.print(grupo1[counter2]);
                  System.out.print(grupo2[counter]);
                  System.out.println(" ");
                }//termina if
              }//termina for nested
            }//termina for :D
        }//termina else 2
      } //termina opcion 6

      if (opcion==7) {
        String nuevo="";
        matriculasSinA= new int [size1];
        System.out.println("Cual grupo quieres Ordenar?");

        eleccion7= kb.nextInt();
        if (eleccion7==1) {
          for (counter=0;counter<size1; counter++) {
              sinA=grupo1[counter];
              nuevo= sinA.replace("a","1");
              matrisinA= Integer.parseInt(nuevo);
              matriculasSinA[counter]=matrisinA;

          }//termina for
          for (counter=0; counter<matriculasSinA.length; counter++){
            for (counter2=1; counter2<(matriculasSinA.length-counter); counter2++) {
              if (matriculasSinA[counter2-1]>matriculasSinA[counter2]){
                mayor = matriculasSinA[counter2-1];
                matriculasSinA[counter2-1]=matriculasSinA[counter2];
                matriculasSinA[counter2]=mayor;
              } //end if
            } //end for nested
          } //end for
          for (counter=0; counter<matriculasSinA.length; counter++){
            System.out.println ("*"+matriculasSinA[counter]);
          } //end for print
        }//termina if
        else if(eleccion7==2) {
          matriculasSinA= new int [size2];
          for (counter=0;counter<size2; counter++) {
              sinA=grupo2[counter];
              nuevo= sinA.replace("a","1");
              matrisinA= Integer.parseInt(nuevo);
              matriculasSinA[counter]=matrisinA;
          }//termina for
          for (counter=0; counter<matriculasSinA.length; counter++){
            for (counter2=1; counter2<(matriculasSinA.length-counter); counter2++) {
              if (matriculasSinA[counter2-1]>matriculasSinA[counter2]){
                mayor = matriculasSinA[counter2-1];
                matriculasSinA[counter2-1]=matriculasSinA[counter2];
                matriculasSinA[counter2]=mayor;
              } //end if
            } //end for nested
          } //end for
          for (counter=0; counter<matriculasSinA.length; counter++){
            System.out.println ("*"+matriculasSinA[counter]);
          } //end for print
        }
        else {
          System.out.println("Solo tienes dos grupos, porfa date cuenta");
        }
      }//termina opcion7

      if (opcion==8) {
        System.out.println("Cuántas matrículas vas a comparar?");
        sizeNuevo=kb.nextInt();
        System.out.println ("Ingresa las matriculas del grupo a comparar");
        for (counter=0; counter < sizeNuevo; counter++ ) {
          nuevogrupo[counter]= kb.next();
        }//termina for

          for (counter=0;counter<sizeNuevo; counter++) {
            for (counter2=0; counter2<size1;counter2++ ) {
              if (nuevogrupo[counter].equals(grupo1[counter2])) {
                existe1++;
                System.out.println("Tu matrícula: "+grupo1[counter2]+", pertenece al grupo 1");
              }//termina if

            }//termina for nested
          }//termina for

          for (counter=0;counter<sizeNuevo; counter++) {
            for (counter2=0; counter2<size2;counter2++ ) {
              if (nuevogrupo[counter].equals(grupo2[counter2])) {
                existe2++;
                System.out.println("Tu matrícula: "+grupo2[counter2]+" pertenece al grupo 2");
              }//termina if
            }//termina for nested
          }//termina for


          if (existe1>existe2 && existe1==sizeNuevo) {
              System.out.println("Tu grupo pertenece por completo al grupo 1 ");
          }
          else if (existe2>existe1 && existe2==sizeNuevo) {
            System.out.println("Tu grupo pertenece por completo al grupo 2 ");
          }
          else if (existe1==existe2 && existe1==sizeNuevo) {
            System.out.println("Tu grupo pertenece por completo a ambos grupos");
          }
          else if (existe1<sizeNuevo && existe1>existe2) {
            System.out.println("Tu grupo pertenece parcialmente al grupo 1 por que tiene en común "+existe1+" matrículas");
          }
          else if (existe2<sizeNuevo && existe2>existe1) {
            System.out.println("Tu grupo pertenece parcialmente al grupo 2 por que tiene en común "+existe2+" matrículas");
          }
          else if (existe2<sizeNuevo && existe1<sizeNuevo) {
            System.out.println("Tu grupo pertenece parcialmente a ambos grupos debido a que tiene "+existe1+" matrículas en común del grupo 1 y "+existe2+" matrículas en común con el grupo 2");
          }

          existe1=0;
          existe2=0;



      }//termina opcion 8
    } //fin while
  } //fin main
  public static void Perm2(String[] elem, String act, int n, int r){
      if (n == 0){
          if(!repeated(act)){
              listaPalabras[contLista] = act;
              contLista++;
              System.out.println(act);
          }
      }
      else{
          for (int i = 0; i < r; i++){
              if (!act.contains(elem[i])){ // Controla que no haya repeticiones
                  Perm2(elem, act + elem[i] + ",", n - 1, r);
              }
          }
      }
  }
  public static boolean repeated(String combinacion) {
      int i=0;
      int cont = 0;
      String[]elems = combinacion.split(",");
      for (int j = 0; j < contLista; j++){
          for(i = 0; i < elems.length; i++){
              if(listaPalabras[j].contains(elems[i]))
                  cont++;
          }
          if(cont == elems.length)
              return true;
          else
              cont = 0;
      }
      return false;
  }
} //fin class
