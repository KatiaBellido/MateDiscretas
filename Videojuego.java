import java.util.*;
/*Author: Constanza Gomez
Date: October 23,2018
Description: Quiz video juegos*/
public class Videojuego{
  public static void main (String [] args){
    int edad = 0, platform = 0;
    String genre = "";
    greet ();
    edad = age ();
    instruction ();
    genre = genero (edad);
    instru ();
    platform = plataforma();
    //System.out.println (platform);
    result (edad, genre, platform);
  } //end main

  public static void greet (){
    System.out.println ("Bienvenido a nuestro quiz, vamos a hacerte unas cuantas preguntas para poder recomendarte un videojuego");
    System.out.println ("Espero estes listo");
  } //end greet method

  public static int age (){
    int age = 0, result = 0;
    Scanner kb = new Scanner (System.in);
    System.out.println ("¿Cuántos años tienes?");
    age = kb.nextInt();
    if ((age >= 3) && (age < 10)){
      result = 3;
    } //end 3+ age
    if ((age >= 10) && (age < 13)){
      result = 10;
    } //10 a 13
    if ((age >= 13) && (age <= 17)){
      result = 13;
    } //13 a 17
    if ((age >= 18)){
      result = 18;
    } //18+
    return result;
  } //end age method

  public static void instruction(){
    System.out.println ("Porfavor escoga de la siguiente lista el género de videojuego que más le guste y escribalo");
  } //end instruction method

  public static String genero (int edad){
    String respuesta = "";
    Scanner kb = new Scanner (System.in);
    if (edad == 3){
      System.out.println ("Simulación\t \tDeportes");
      System.out.println ("Plataformas\t \tCarreras");
      respuesta = kb.next();
    } //end 3+ if
    if (edad == 10){
      System.out.println ("Simulación\t \tCarreras");
      System.out.println ("Plataformas\t \tEstrategia");
      System.out.println ("Deportes\t \tMusical");
      respuesta = kb.next();
    } //end 10 a 13 if
    if (edad == 13){
      System.out.println ("Simulación\t \tMusical");
      System.out.println ("Plataformas\t \tLucha");
      System.out.println ("Deportes\t \tBeat Em Up");
      System.out.println ("Carreras\t \tRol");
      System.out.println ("Estrategia");
      respuesta = kb.next();
    } //end if 13 a 17
    if (edad == 18){
      System.out.println ("Simulación \t \tLucha ");
      System.out.println ("Plataformas \t \tBeat Em Up");
      System.out.println ("Deportes \t \tRol");
      System.out.println ("Carreras \t \tShoot Em Up");
      System.out.println ("Estrategia\t \tFirst Person Shooting");
      System.out.println ("Musical\t \t \tThird Person Shooting");
      respuesta = kb.next();
    } //end if 18+
    return respuesta.toLowerCase();
  } //end genero method

  public static void instru(){
    System.out.println ("Porfavor escoga de la siguiente lista la plataforma que tiene, solo una");
  } //end instru method

  public static int plataforma (){
    int respuesta = 0;
    Scanner kb = new Scanner (System.in);
    System.out.println ("1. PS4\t \t9. Nintendo Switch");
    System.out.println ("2. PC\t \t10. Nintendo 3DS");
    System.out.println ("3. Nintendo DS\t11. PS2");
    System.out.println ("4. PS3\t \t12. GameCube");
    System.out.println ("5. Xbox One\t13. Xbox");
    System.out.println ("6. WiiU\t \t14. Xbox 360");
    System.out.println ("7. Dreamcast\t15. Nintendo 64");
    System.out.println ("8. Wii");
    respuesta = kb.nextInt();
    return respuesta;
  } //end plat method

  public static void result (int theEdad, String theGenre, int thePlatform){
    if (theEdad == 3){
      if (theGenre.equals("simulación")){
        if (thePlatform == 11){
          System.out.println ("Nosotros te recomendamos jugar Gran Turismo");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      }
      if (theGenre.equals("plataformas")){
        if (thePlatform == 8){
          System.out.println ("Nosotros te recomendamos jugar World of Goo, The Legend of Zelda: The Wind Waker, Super Mario Galaxy 2, Super Mario Galaxy o Donkey Kong");
        }
        else if (thePlatform == 2){
          System.out.println("Nosotros te recomendamos jugar World of Goo o Sonic the Hedgehog");
        }
        else if (thePlatform == 9){
          System.out.println("Nosotros te recomendamos jugar World of Goo, Super Mario Odyssey o Sonic the Hedgehog");
        }
        else if ((thePlatform == 3) || (thePlatform == 11) || (thePlatform == 13) || (thePlatform == 5) || (thePlatform == 14)){
          System.out.println("Nosotros te recomendamos jugar Sonic the Hedgehog");
        }
        else if ((thePlatform == 15) || (thePlatform == 10)){
          System.out.println("Nosotros te recomendamos jugar The Legend of Zelda: Majora's Mask, The Legend of Zelda: A Link to the Past, The Legend of Zelda: Collector's Edition o The Legend of Zelda: Ocarina of Time");
        }
        else if ((thePlatform == 4) || (thePlatform == 1)){
          System.out.println("Nosotros te recomendamos jugar Little Big Planet o Sonic the Hedgehog");
        }
        else if (thePlatform == 11){
          System.out.println("Nosotros te recomendamos jugar World of Goo, Super Mario Odyssey o Sonic the Hedgehog");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //plataformas
      if (theGenre.equals("deportes")){
        if (thePlatform == 2){
            System.out.println("Nosotros te recomendamos jugar Madden NFL 2003, NBA 2K17 o Virtua Tennis");
        }
        else if (thePlatform == 12){
          System.out.println("Nosotros te recomendamos jugar Madden NFL 2003 o NFL 2K1");
        }
        else if ((thePlatform == 11) || (thePlatform == 13)){
          System.out.println("Nosotros te recomendamos jugar Madden NFL 2003, NFL 2K1 o FIFA");
        }
        else if ((thePlatform == 1) || (thePlatform == 4) || (thePlatform == 5) || (thePlatform == 14)){
          System.out.println("Nosotros te recomendamos jugar NBA 2K17");
        }
        else if (thePlatform == 7){
          System.out.println("Nosotros te recomendamos jugar NFL 2K1");
        }
        else if ((thePlatform == 8) || (thePlatform == 6)){
          System.out.println("Nosotros te recomendamos jugar FIFA o Wii Fit");
        }
        else if ((thePlatform == 10) || (thePlatform == 15)){
          System.out.println("Nosotros te recomendamos jugar FIFA");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //deportes
      if (theGenre.equals("carreras")){
        if ((thePlatform == 13)){
          System.out.println("Nosotros te recomendamos jugar Forza Motorsport");
        }
        else if ((thePlatform == 11) || (thePlatform == 4) || (thePlatform == 1)){
          System.out.println("Nosotros te recomendamos jugar Gran Turismo");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //carreras
    } //3 a 9
    if (theEdad == 10){
      if (theGenre.equals("simulación")){
        if ((thePlatform == 2) || (thePlatform == 8)){
          System.out.println("Nosotros te recomendamos jugar Sim City");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //simulación
      if (theGenre.equals("plataformas")){
        if ((thePlatform == 2) || (thePlatform == 4) || (thePlatform == 14)){
          System.out.println("Nosotros te recomendamos jugar Portal 2");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //plataformas
      if (theGenre.equals("estrategia")){
        if ((thePlatform == 2)){
          System.out.println("Nosotros te recomendamos jugar Age of Empires o Civilization");
        }

        else if ((thePlatform == 9)){
          System.out.println("Nosotros te recomendamos jugar Civilization");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //estrategia
      if (theGenre.equals("musical")){
        if ((thePlatform == 8) || (thePlatform == 6) || (thePlatform == 4) || (thePlatform == 1) || (thePlatform == 14) || (thePlatform == 5) || (thePlatform == 9) || (thePlatform == 2)){
          System.out.println("Nosotros te recomendamos jugar Just Dance");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //Musical
    } //10 a 13
    if (theEdad == 13){
      if (theGenre.equals("lucha")){
        if ((thePlatform == 7) || (thePlatform == 2) || (thePlatform == 5)){
          System.out.println("Nosotros te recomendamos jugar SoulCalibur");
        }
        else if ((thePlatform == 14)){
          System.out.println("Nosotros te recomendamos jugar SoulCalibur o Street Fighter");
        }
        else if ((thePlatform == 13) || (thePlatform == 11) || (thePlatform == 4) || (thePlatform == 1) || (thePlatform == 9)){
          System.out.println("Nosotros te recomendamos jugar Street Fighter");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //Lucha
      if (theGenre.contains("beat")){
        if ((thePlatform == 2) || (thePlatform == 11) || (thePlatform == 4) || (thePlatform == 1) || (thePlatform == 14) || (thePlatform == 5)){
          System.out.println("Nosotros te recomendamos jugar Devil May Cry");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //beat em up
      if (theGenre.equals("simulación")){
        if (thePlatform == 2){
          System.out.println ("Nosotros te recomendamos jugar Microsoft Flights Simulator");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //simulación
      if (theGenre.equals("plataformas")){
        if ((thePlatform == 12) || (thePlatform == 8) || (thePlatform == 6)){
          System.out.println("Nosotros te recomendamos jugar The Legend of Zelda: Twilight Princess");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //plataformas
      if (theGenre.equals("rol")){
        if ((thePlatform == 1) || (thePlatform == 2) || (thePlatform == 9)){
          System.out.println("Nosotros te recomendamos jugar Final Fantasy IX");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //rol
      if (theGenre.equals("estrategia")){
        if (thePlatform == 2){
          System.out.println ("Nosotros te recomendamos jugar Age of Empires o Civilization");
        }
        else if (thePlatform == 9){
          System.out.println ("Nosotros te recomendamos jugar Civilization");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //end estrategia
      if (theGenre.equals("deportes")){
        if ((thePlatform == 12) || (thePlatform == 13) || (thePlatform == 1) || (thePlatform == 2)){
          System.out.println("Nosotros te recomendamos jugar Tony Hawk's Pro Skater 4");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //deportes
    } //13 a 17
    if (theEdad == 18){
      if (theGenre.equals("lucha")){
        if ((thePlatform == 2) || (thePlatform == 8) || (thePlatform == 11) || (thePlatform == 4) || (thePlatform == 13) || (thePlatform == 14) || (thePlatform == 5) || (thePlatform == 1)){
          System.out.println("Nosotros te recomendamos jugar Mortal Kombat");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //Lucha
      if (theGenre.contains("beat")){
        if ((thePlatform == 11) || (thePlatform == 13)){
          System.out.println("Nosotros te recomendamos jugar Grand Theft Auto: Vice City, Grand Theft Auto III o Grand Theft Auto: San Andreas");
        }
        else if ((thePlatform == 4)){
          System.out.println("Nosotros te recomendamos jugar Batman: Arkham City, Grand Theft Auto IV o Grand Theft Auto: San Andreas");
        }
        else if ((thePlatform == 1) || (thePlatform == 6)){
          System.out.println("Nosotros te recomendamos jugar Batman: Arkham City");
        }
        else if ((thePlatform == 14)){
          System.out.println("Nosotros te recomendamos jugar Batman: Arkham City, Grand Theft Auto IV, Grand Theft Auto V o Grand Theft Auto: San Andreas");
        }
        else if ((thePlatform == 5)){
          System.out.println("Nosotros te recomendamos jugar Batman: Arkham City o Grand Theft Auto V");
        }
        else if ((thePlatform == 2)){
          System.out.println("Nosotros te recomendamos jugar Batman: Arkham City, Grand Theft Auto IV, Grand Theft Auto V, Grand Theft Auto: Vice City, Grand Theft Auto III o Grand Theft Auto: San Andreas");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //beat em up
      if (theGenre.contains("shoot")){
        if ((thePlatform == 2) || (thePlatform == 4) || (thePlatform == 5) || (thePlatform == 14)){
          System.out.println("Nosotros te recomendamos jugar Metal Gear Solid V: The Phantom Pain, Metal Gear Solid 2: Sons of Liberty o Resident Evil 4");
        }
        else if (thePlatform == 1){
          System.out.println("Nosotros te recomendamos jugar Metal Gear Solid V: The Phantom Pain o Resident Evil 4");
        }
        else if (thePlatform == 11){
          System.out.println("Nosotros te recomendamos jugar Metal Gear Solid 2: Sons of Liberty o Resident Evil 4");
        }
        else if (thePlatform == 12){
          System.out.println("Nosotros te recomendamos jugar Resident Evil 4");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //shoot em up
      if (theGenre.equals("simulación")){
        if ((thePlatform == 2) || (thePlatform == 14) || (thePlatform == 5) || (thePlatform == 1)){
          System.out.println("Nosotros te recomendamos jugar World of Tanks");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //simulación
      if (theGenre.equals("plataformas")){
        if ((thePlatform == 6) || (thePlatform == 9)){
          System.out.println("Nosotros te recomendamos jugar The Legend of Zelda: Breath of the Wild");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //plataformas
      if (theGenre.contains("first")){
        if (thePlatform == 14){
          System.out.println("Nosotros te recomendamos jugar Call of Duty: Modern Warfare 2, BioShock Infinite, BioShock, The Orange Box, Half-life 2, Halo: Combat Evolved, Perfect Dark, Battlefield o Doom");
        }
        else if (thePlatform == 5){
          System.out.println("Nosotros te recomendamos jugar BioShock Infinite, BioShock, Wolfstein II: The New Colossus, Halo 2, Halo: Combat Evolved, Perfect Dark, Battlefield o Doom");
        }
        else if (thePlatform == 13){
          System.out.println("Nosotros te recomendamos jugar Halo 2, Half-life 2, Halo: Combat Evolved, Battlefield o Doom");
        }
        else if (thePlatform == 11){
          System.out.println("Nosotros te recomendamos jugar Half-Life o Battlefield");
        }
        else if (thePlatform == 4){
          System.out.println("Nosotros te recomendamos jugar Call of Duty: Modern Warfare 2, BioShock Infinite, BioShock, The Orange Box, Half-life 2, Battlefield o Doom");
        }
        else if (thePlatform == 1){
          System.out.println("Nosotros te recomendamos jugar BioShock Infinite, BioShock, Wolfenstein II: The New Colossus, Battlefield o Doom");
        }
        else if (thePlatform == 2){
          System.out.println("Nosotros te recomendamos jugar Call of Duty: Modern Warfare 2, BioShock Infinite, BioShock, Wolfenstein, The Orange Box, Half-life 2, Half-life, Halo: Combat Evolved, Halo 2, Battlefield o Doom");
        }
        else if (thePlatform == 15){
          System.out.println("Nosotros te recomendamos jugar Golden Eye 007, Perfect Dark o Doom");
        }
        else if ((thePlatform == 12) || (thePlatform == 8)){
          System.out.println("Nosotros te recomendamos jugar Metroid Prime");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //fps
      if (theGenre.contains("third")){
        if (thePlatform == 2){
          System.out.println("Nosotros te recomendamos jugar World of Warcraft");
        }
        else if (thePlatform == 4){
          System.out.println("Nosotros te recomendamos jugar The Last of Us, Read Dead Redemption o Uncharted 2: Among Thieves");
        }
        else if (thePlatform == 1){
          System.out.println("Nosotros te recomendamos jugar The Last of Us o Uncharted 2: Among Thieves");
        }
        else if (thePlatform == 14){
          System.out.println("Nosotros te recomendamos jugar Read Dead Redemption");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //tps
      if (theGenre.equals("rol")){
        if (thePlatform == 2){
          System.out.println("Nosotros te recomendamos jugar Baldur's Gate II: Shadows of Amn, The Elder Scrolls V: Skyrim, Dark Souls o Neverwinter Nights");
        }
        else if ((thePlatform == 5) || (thePlatform == 1)){
          System.out.println("Nosotros te recomendamos jugar The Elder Scrolls V: Skyrim o Dark Souls");
        }
        else if ((thePlatform == 14) || (thePlatform == 4)){
          System.out.println("Nosotros te recomendamos jugar The Elder Scrolls V: Skyrim, Mass Effects 2 o Dark Souls");
        }
        else if (thePlatform == 6){
          System.out.println("Nosotros te recomendamos jugar The Legend of Zelda: Breath of the Wild");
        }
        else if (thePlatform == 9){
          System.out.println("Nosotros te recomendamos jugar The Legend of Zelda: Breath of the Wild o Dark Souls");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //Rol
      if (theGenre.equals("estrategia")){
        if ((thePlatform == 2) || (thePlatform == 15)){
          System.out.println("Nosotros te recomendamos jugar StarCraft");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //estrategia
      if (theGenre.equals("deportes")){
        if (thePlatform == 11){
          System.out.println("Nosotros te recomendamos jugar Tony Hawk's Pro Skater 3");
        }
        else if ((thePlatform == 11) || (thePlatform == 13) || (thePlatform == 15) || (thePlatform == 2)){
          System.out.println("Nosotros te recomendamos jugar Tony Hawk's Pro Skater 3 o Tony Hawk's Pro Skater 2");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //deportes
      if (theGenre.equals("musical")){
        if ((thePlatform == 11) || (thePlatform == 4) || (thePlatform == 14) || (thePlatform == 8)){
          System.out.println ("Nosotros te recomendamos jugar Guitar Hero");
        }
        else {
          System.out.println ("No tenemos una recomendación para tus características");
        }
      } //musical
    } //18 en adelante
  } //end result method
} //end class
