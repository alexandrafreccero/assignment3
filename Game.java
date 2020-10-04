//package assignment3;

import java.util.Scanner;

public class Game {

public static class Animal {

String animalName;
String animalHome;
String animalCountry;
String animalColor;
String animalWeight;
String question;

public Animal(String weight, String color, String country, String name) {

animalCountry = country;
animalColor = color;
animalWeight = weight;
animalName = name;

question = "What is the name of this animal?\nit weighs " + animalWeight + "\nIt is " + animalColor
+ "\nIt lives in " + animalCountry;
}
}

public static void animalArray() {

Animal Zebra = new Animal("400", "black and white", "Africa", "Zebra");
Animal Penguin = new Animal("2,5 up to 20kg", "black and white", "Southern Hemisphere", "Penguin");
Animal Panda = new Animal("70-150kg", "black and white", "China", "Panda");
Animal Dolphin = new Animal("50 - 1000kg", "black and white", "Rivers and oceans, worldwide!", "Dolphin");
Animal Magpie = new Animal("200-230g", "black and white", " all continents, hint; it has wings!", "Magpie");

Animal[] animalArray = new Animal[5];

animalArray[0] = Zebra;
animalArray[1] = Penguin;
animalArray[2] = Panda;
animalArray[3] = Dolphin;
animalArray[4] = Magpie;

questionLoop(animalArray);
}

public static void questionLoop(Animal[] animalArray) {
Scanner scanner = new Scanner(System.in);

try {
for (int i = 0; i < animalArray.length; i++) {

Animal currentAnimal = animalArray[i];

System.out.println(currentAnimal.question);
String user_answer = scanner.nextLine();

if (user_answer.equals(currentAnimal.animalName)) {
System.out.println("that is correct");

} else if (user_answer.equals("exit")) {
System.out.println("Goodbye!");
break;

} else {
System.out.println("That is not correct, please try again!");
i--;
}
}

} catch (Exception e) {
System.out.println("An error occured please restart the game.");
}
}

public static void main(String[] args) {

System.out.println(" Welcome to the animal guessing game!\n "
+ "Remember to write your animalname using a capital letter at the beginning, like this: Monkey \n"
+ " to quit the game , just type: exit");

animalArray();

}

}