import java.util.*;
public class MateProyectoOV{
  public static void main(String[] args) {
    String inicio="", laPersonalidad="", carrera="",carrera1="",carrera2="",carrera3="", respuesta="", carreraFinal="";
    Scanner keyboard= new Scanner(System.in);

    //instrucciones

    System.out.println("Hola, a continuación realizaremos un cuestionario");
    System.out.println("Gustas empezar la prueba??, Responde con si o no." );
    inicio= keyboard.nextLine();
    if (inicio.equalsIgnoreCase("si")) {
      laPersonalidad=tipoDePersonalidad(laPersonalidad);
    System.out.println("\tSegún tus respuestas puedes dirigirte al área de: "+laPersonalidad);
      if(laPersonalidad.equalsIgnoreCase("ambiente")){  //ambiente
        System.out.println("Te gustaría gestionar proyecos arquitectónicos desde la detección de necesidades hasta utilización de técnicas constructivas?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera="arquitectura";
          carreraFinal=carrera;
        }
        System.out.println("Te gustaría contribuir en el desarrollo de la sociedad con grandes obras de infraestuctura");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera1="Ingenieria Civil";
          carreraFinal=carrera1;
        }
        if (carrera.equalsIgnoreCase("arquitectura")&& carrera1.equalsIgnoreCase("Ingenieria Civil")) {
          carrera= "arquitectura e Ingenieria Civil";
          carreraFinal=carrera;
        }
        if (!carrera.equalsIgnoreCase("arquitectura")&& !carrera1.equalsIgnoreCase("Ingenieria Civil")) {
          carreraFinal="no esta en el campus santa fe";
        }
        System.out.println("Deberías estudiar: "+carreraFinal+" en el area de: "+laPersonalidad);
      }//if ambiente
      else if (laPersonalidad.equalsIgnoreCase("bioingieneria")) { //bioingieneria
        carrera="Ingenieria en desarrollo sustentable";
        System.out.println("Deberías estudiar: "+carrera);
      }//else if bioingieneria
      else if (laPersonalidad.equalsIgnoreCase("sociales")) { //sociales
        System.out.println("¿Te interesa hacer usos de los recursos de la mejor manera?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera="Licenciado en economía";
          carreraFinal=carrera;
        }
        System.out.println("¿Aprecias que vivamos en un mundo interconectado y te consideras un ciudadano del mundo?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera1="Relaciones Internacionales";
          carreraFinal=carrera1;
        }
        System.out.println("¿Te gustaría trabajar en el área legal de empresas o en despachos?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera2="Licenciado en Derecho";
          carreraFinal=carrera2;
        }
        System.out.println("¿Buscas transformar el mundo por medio de análisis de datos?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera3="Licenciado en Gobierno y transformación pública";
          carreraFinal=carrera3;
        }
        if (carrera.equalsIgnoreCase("Licenciado en economía")&& carrera1.equalsIgnoreCase("Relaciones Internacionales")&& carrera2.equalsIgnoreCase("Licenciado en Derecho")&& carrera3.equalsIgnoreCase("Licenciado en Gobierno y transformación pública") ) {
          carrera="Licenciado en economia y Relaciones internacionales y Licenciado en Derecho y Licenciado en Gobierno y transformación pública";
          carreraFinal=carrera;
        }
        if (!carrera.equalsIgnoreCase("Licenciado en economía")&& !carrera1.equalsIgnoreCase("Relaciones Internacionales")&& !carrera2.equalsIgnoreCase("Licenciado en Derecho")&& !carrera3.equalsIgnoreCase("Licenciado en Gobierno y transformación pública")) {
          carreraFinal="creemos que la carrera que buscas no esta en este campus";
        }

        System.out.println("Deberías estudiar: "+carreraFinal+" en el area de: "+laPersonalidad);
      }//else if sociales
      else if (laPersonalidad.equalsIgnoreCase("innovacion")) { //innovacion
        System.out.println("¿Te atraen las diferentes ramas de la ingeniería y te encuentras buscando siempre soluciones?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera="Ingeniero en innovación y desarrollo";
          carreraFinal=carrera;
        }
        System.out.println("¿Te gusta combinar diferenters disciplinas y técnicas y te interesa la idea de inventar productos innovadores y eficientes?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera1="Ingeniero en mecatrónica";
          carreraFinal=carrera1;
        }
        System.out.println("¿te gusta saber como funcionan las cosas y tienes afinida por las matemáticas y la física?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera2="Ingeniero mecánico";
          carreraFinal=carrera2;
        }
        System.out.println("¿buscas generar soluciones que agreguen valor en las organizaciones al integrar los procesos, las personas y el uso de tecnologías?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera3="Ingeniero industrial y de sistemas";
          carreraFinal=carrera3;
        }
        if (carrera.equalsIgnoreCase("Ingeniero en innovación y desarrollo")&& carrera1.equalsIgnoreCase("Ingeniero en mecatrónica")&& carrera2.equalsIgnoreCase("Ingeniero mecánico")&& carrera3.equalsIgnoreCase("Ingeniero industrial y de sistemas") ) {
          carrera="Ingeniero en innovación y desarrollo e Ingeniero en mecatrónica e Ingeniero mecánico e Ingeniero industrial y de sistemas";
          carreraFinal=carrera;
        }
        if (!carrera.equalsIgnoreCase("Ingeniero en innovación y desarrollo")&& !carrera1.equalsIgnoreCase("Ingeniero en mecatrónica")&& !carrera2.equalsIgnoreCase("Ingeniero mecánico")&& !carrera3.equalsIgnoreCase("Ingeniero industrial y de sistemas")) {

          carreraFinal="no esta en el campus santa fe";
        }
        System.out.println("Deberías estudiar: "+carreraFinal+" en el area de: "+laPersonalidad);
      }//termina else if innovacion
      else if (laPersonalidad.equalsIgnoreCase("negocios")) { //negocios.
        carreraFinal="Hay muchas carreras en el campus";
        System.out.println("Deberías estudiar: "+carreraFinal+" en el area de: "+laPersonalidad);
      }//termina else if negocios

      else if(laPersonalidad.equalsIgnoreCase("tecnologia")){  //tecnologia
        System.out.println("¿Te apasiona saber como funcionan las cosas para innovar en ellas?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera="Ingeniero en Robótica y sistemas digitales";
          carreraFinal=carrera;
        }
        System.out.println("¿Te apasionan las computadoras y la tecnología?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera1="Ingeniero en Tecnologías computacionales";
          carreraFinal=carrera1;
        }
        System.out.println("¿Te has sentido atraido por la tecnología y quisieras aprender de su potencial de cambio en el mundo?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera2="Ingeniero en Transformación digital de negocios";
          carreraFinal=carrera2;
        }
        if (carrera.equalsIgnoreCase("Ingeniero en Robótica y sistemas digitales")&& carrera1.equalsIgnoreCase("Ingeniero en Tecnologías computacionales")&& carrera2.equalsIgnoreCase("Ingeniero en Transformación digital de negocios")) {
          carrera= "Ingeniero en Robótica y sistemas digitales e Ingeniero en Tecnologías computacionales e Ingeniero en Transformación digital de negocios";
          carreraFinal=carrera;
        }
        if (!carrera.equalsIgnoreCase("Ingeniero en Robótica y sistemas digitales")&& !carrera1.equalsIgnoreCase("Ingeniero en Tecnologías computacionales")&& !carrera2.equalsIgnoreCase("Ingeniero en Transformación digital de negocios")) {

          carreraFinal="no esta en el campus santa fe";
        }
        System.out.println("Deberías estudiar: "+carreraFinal+" en el area de: "+laPersonalidad);
      }//termina else if tecnologia
      else if (laPersonalidad.equalsIgnoreCase("creativos")) { //creativos
        System.out.println("¿Se te facilita representar ideas a través de conceptos visuales?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera="Licenciado en Arte Digital";
          carreraFinal=carrera;
        }
        System.out.println("¿Te gusta la tecnología para crear mensajes y tienes ideas para compartir?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera1="Licenciado en Comunicación";
          carreraFinal=carrera1;
        }
        System.out.println("¿Te interesa conocer la verdad de los hechos?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera2="Licenciado en periodismo";
          carreraFinal=carrera2;
        }
        System.out.println("¿Te llama la atención la producción musical en sus diferentes generos?");
        respuesta= keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          carrera3="Licenciado en Tecnología y producción musical";
          carreraFinal=carrera3;
        }
        if (carrera.equalsIgnoreCase("Licenciado en Arte Digital")&& carrera1.equalsIgnoreCase("Licenciado en Comunicación")&& carrera2.equalsIgnoreCase("Licenciado en periodismo")&& carrera3.equalsIgnoreCase("Licenciado en Tecnología y producción musical") ) {
          carrera="Licenciado en Arte Digital y Licienciado en Comunicación y Licenciado en periodismo y Licenciado en Tecnología y producción musical";
          carreraFinal=carrera;
        }
        if (!carrera.equalsIgnoreCase("Licenciado en Arte Digital")&& !carrera1.equalsIgnoreCase("Licenciado en Comunicación")&& !carrera2.equalsIgnoreCase("Licenciado en periodismo")&& !carrera3.equalsIgnoreCase("Licenciado en Tecnología y producción musical")) {

          carreraFinal="no esta en el campus santa fe";
        }
        System.out.println("Deberías estudiar: "+carreraFinal+" en el area de: "+laPersonalidad);
      }//termina else if creativos
      else if (laPersonalidad.equalsIgnoreCase("ciencias")) {//ciencias
        carreraFinal="Ingenieria en nanotecnología";
        System.out.println("Deberías estudiar: "+carreraFinal+" en el area de: "+laPersonalidad);
      }//termina else if ciencias
      else {
        System.out.println("Creemos que el área al que perteneces no se encuentra en este campus");
      }
    }//termina if
    else {
      System.out.println("Pos ni modo, sorry no te haremos la prueba según lo que contestaste ");
    }

  }//termina main
//
//
//
//
//

  public static String tipoDePersonalidad(String tuPersonalidad){
    //variables
    int negocios=0, innovacion=0, sociales=0, tecnologia=0, ambiente=0, bioingieneria=0, creativos=0, ciencias=0;
    int smallest=99999, largest=0;
    Scanner keyboard= new Scanner(System.in);
    String respuesta="", personalidad="";
    //preguntas
    System.out.println("Responde con Si o No");
    System.out.println("Te llama la atención el mobiliario, decoración y colores  cuando entras a un lugar nuevo?"); //1 ambiente
    respuesta=keyboard.nextLine();
      if (respuesta.equalsIgnoreCase("si")) {
        ambiente++;
        if (largest<ambiente) {
          largest=ambiente;
          personalidad="ambiente";
        }//termina if de adentro
        else if (largest==ambiente) {
          personalidad=personalidad+" y ambiente";
        }//termina else if
      }//ends if
    System.out.println("Te interesan los procesos químicos, físicos o biológicos?"); //1 bioingieneria
    respuesta=keyboard.nextLine();
      if (respuesta.equalsIgnoreCase("si")) {
        bioingieneria++;
        if (largest<bioingieneria) {
          largest=bioingieneria;
          personalidad="bioingieneria";
        }//termina if de adentro
        else if (largest==bioingieneria) {
          personalidad=personalidad+" y bioingieneria";
        }//termina else if
      }//ends if
    System.out.println("Estas interesado en promover el bienestar la justicia y la inclusión políticamente?"); //1 sociales
    respuesta=keyboard.nextLine();
      if (respuesta.equalsIgnoreCase("si")) {
        sociales++;
        if (largest<sociales) {
          largest=sociales;
          personalidad="sociales";
        }//termina if de adentro
        else if (largest==sociales) {
          personalidad=personalidad+" y sociales";
        }//termina else if
      }//ends if
    System.out.println("Te llama la atención los ambitos industriales, comerciales y científicos.?"); //1 innovacion
    respuesta=keyboard.nextLine();
      if (respuesta.equalsIgnoreCase("si")) {
        innovacion++;
        if (largest<innovacion) {
          largest=innovacion;
          personalidad="innovacion";
        }//termina if de adentro
        else if (largest==innovacion) {
          personalidad=personalidad+" e innovacion";
        }//termina else if
      }//ends if
    System.out.println("Te interesa generar y compartir valor en empresas o individualmente?"); //1 negocios
    respuesta=keyboard.nextLine();
      if (respuesta.equalsIgnoreCase("si")) {
        negocios++;
        if (largest<negocios) {
          largest=negocios;
          personalidad="negocios";
        }//termina if de adentro
        else if (largest==negocios) {
          personalidad=personalidad+" y negocios";
        }//termina else if
      }//ends if
    System.out.println("Crees que los grandes retos de la sociedad se pueden solucionar apoyados con bases tecnológicos?"); //1 tecnología
    respuesta=keyboard.nextLine();
      if (respuesta.equalsIgnoreCase("si")) {
        tecnologia++;
        if (largest<tecnologia) {
          largest=tecnologia;
          personalidad="tecnologia";
        }//termina if de adentro
        else if (largest==tecnologia) {
          personalidad=personalidad+" y tecnologia";
        }//termina else if
      }//ends if
    System.out.println("Te gusta expresarte de forma creativa?"); //1 creativos
    respuesta=keyboard.nextLine();
      if (respuesta.equalsIgnoreCase("si")) {
        creativos++;
        if (largest<creativos) {
          largest=creativos;
          personalidad="creativos";
        }//termina if de adentro
        else if (largest==creativos) {
          personalidad=personalidad+" y creativos";
        }//termina else if
      }//ends if
    System.out.println("Te gusta resolver problemas complejos de las ciencias naturales y exactas?"); //1 ciencias
    respuesta=keyboard.nextLine();
      if (respuesta.equalsIgnoreCase("si")) {
        ciencias++;
        if (largest<ciencias) {
          largest=ciencias;
          personalidad="ciencias";
        }//termina if de adentro
        else if (largest==ciencias) {
          personalidad=personalidad+" y ciencias";
        }//termina else if
      }//ends if
      System.out.println("Te gusta la infraestuctura y las construcciones?"); //2 ambiente
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          ambiente++;
          if (largest<ambiente) {
            largest=ambiente;
            personalidad="ambiente";
          }//termina if de adentro
          else if (largest==ambiente) {
            personalidad=personalidad+" y ambiente";
          }//termina else if
        }//ends if
      System.out.println("Te interesan los procesos sustentables?"); //2 bioingieneria
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          bioingieneria++;
          if (largest<bioingieneria) {
            largest=bioingieneria;
            personalidad="bioingieneria";
          }//termina if de adentro
          else if (largest==bioingieneria) {
            personalidad=personalidad+" y bioingieneria";
          }//termina else if
        }//ends if
      System.out.println("Consideras que los derechos humanos son la clave del desarrollo en el mundo contemporáneo?"); //2 sociales
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          sociales++;
          if (largest<sociales) {
            largest=sociales;
            personalidad="sociales";
          }//termina if de adentro
          else if (largest==sociales) {
            personalidad=personalidad+" y sociales";
          }//termina else if
        }//ends if
      System.out.println("Te gusta solucionar problemas desafiantes?"); //2 innovacion
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          innovacion++;
          if (largest<innovacion) {
            largest=innovacion;
            personalidad="innovacion";
          }//termina if de adentro
          else if (largest==innovacion) {
            personalidad=personalidad+" e innovacion";
          }//termina else if
        }//ends if
      System.out.println("te consideras analítico y te gusta dar sentido a las cifras??"); //2 negocios
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          negocios++;
          if (largest<negocios) {
            largest=negocios;
            personalidad="negocios";
          }//termina if de adentro
          else if (largest==negocios) {
            personalidad=personalidad+" y negocios";
          }//termina else if
        }//ends if
      System.out.println("Te interesa el funcionamiento y la creación de diferentes sistemas tecnológicos?"); //2 tecnología
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          tecnologia++;
          if (largest<tecnologia) {
            largest=tecnologia;
            personalidad="tecnologia";
          }//termina if de adentro
          else if (largest==tecnologia) {
            personalidad=personalidad+" y tecnologia";
          }//termina else if
        }//ends if
      System.out.println("Te interesa compartir tus opiniones por medio de diversos lenguajes y tecnologías?"); //2 creativos
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          creativos++;
          if (largest<creativos) {
            largest=creativos;
            personalidad="creativos";
          }//termina if de adentro
          else if (largest==creativos) {
            personalidad=personalidad+" y creativos";
          }//termina else if
        }//ends if
      System.out.println("estás interesado en experimentar por métodos matemáticos y el uso de herramientas tencológicas?"); //2 ciencias
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          ciencias++;
          if (largest<ciencias) {
            largest=ciencias;
            personalidad="ciencias";
          }//termina if de adentro
          else if (largest==ciencias) {
            personalidad=personalidad+" y ciencias";
          }//termina else if
        }//ends if
      System.out.println("Estas preocupado o interesado en la ubarnización y sobrepoblación como problema actual?"); //3 ambiente
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          ambiente++;
          if (largest<ambiente) {
            largest=ambiente;
            personalidad="ambiente";
          }//termina if de adentro
          else if (largest==ambiente) {
            personalidad=personalidad+" y ambiente";
          }//termina else if
        }//ends if
      System.out.println("Estas interesado en resolver retos que aporten a la calidad de vida y al medio ambiente?"); //3 bioingieneria
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          bioingieneria++;
          if (largest<bioingieneria) {
            largest=bioingieneria;
            personalidad="bioingieneria";
          }//termina if de adentro
          else if (largest==bioingieneria) {
            personalidad=personalidad+" y bioingieneria";
          }//termina else if
        }//ends if
      System.out.println("Te gustaría hacer uso de los recursos de la mejor manera para contribuir al crecimiento del mundo?"); //3 sociales
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          sociales++;
          if (largest<sociales) {
            largest=sociales;
            personalidad="sociales";
          }//termina if de adentro
          else if (largest==sociales) {
            personalidad=personalidad+" y sociales";
          }//termina else if
        }//ends if
      System.out.println("Se te facilita visualizar oportunidades y ofrecer soluciones innovadoras?"); //3 innovacion
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          innovacion++;
          if (largest<innovacion) {
            largest=innovacion;
            personalidad="innovacion";
          }//termina if de adentro
          else if (largest==innovacion) {
            personalidad=personalidad+" e innovacion";
          }//termina else if
        }//ends if
      System.out.println("Te interesaría analiizar el ciclo de vida de una empresa?"); //3 negocios
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          negocios++;
          if (largest<negocios) {
            largest=negocios;
            personalidad="negocios";
          }//termina if de adentro
          else if (largest==negocios) {
            personalidad=personalidad+" y negocios";
          }//termina else if
        }//ends if
      System.out.println("Te gustaría experimentar en la creación de dispositivos electrónicos y robóticos?"); //3 tecnología
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          tecnologia++;
          if (largest<tecnologia) {
            largest=tecnologia;
            personalidad="tecnologia";
          }//termina if de adentro
          else if (largest==tecnologia) {
            personalidad=personalidad+" y tecnologia";
          }//termina else if
        }//ends if
      System.out.println("Te gusta compartir historias y crear mensajes??"); //3 creativos
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          creativos++;
          if (largest<creativos) {
            largest=creativos;
            personalidad="creativos";
          }//termina if de adentro
          else if (largest==creativos) {
            personalidad=personalidad+" y creativos";
          }//termina else if
        }//ends if
      System.out.println("Te gusta dar explicaciones a diferentes fenómenos?"); //3 ciencias
      respuesta=keyboard.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
          ciencias++;
          if (largest<ciencias) {
            largest=ciencias;
            personalidad="ciencias";
          }//termina if de adentro
          else if (largest==ciencias) {
            personalidad=personalidad+" y ciencias";
          }//termina else if
        }//ends if
  return personalidad;

  }//termina tipoDePersonalidad metodo

}//class
