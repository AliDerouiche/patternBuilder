//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici
(tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video */

public class Main {
    public static void main(String[] args) {
    Person person = new Builder("Marco","Rossi",20,"Via Marco Rossi 20, Roma").setId(11).build();
    Person person1 = new Builder("Paolo","Bianchi",25,"Via Paolo Bianchi 25, Milano").setFavouriteColour("Purple").build();

        System.out.println(person);
        System.out.println(person1);


    }
}