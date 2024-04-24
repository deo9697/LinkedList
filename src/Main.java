import java.util.LinkedList;

/*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata*/
public class Main {
    public static void main(String[] args) {
        LinkedList<String> fruitList = new LinkedList<>();

        fruitList.add("mela");
        fruitList.add("pera");
        fruitList.add("banana");
        fruitList.add("arancia");

        System.out.println("tutta la frutta è = " + fruitList);


        fruitList.addFirst("uva");
        fruitList.addLast("pesca");

        System.out.println("lista frutta aggiornata =" + fruitList);
    }
}