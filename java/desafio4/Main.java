package ejercicio.java.desafio4;

public class Main {
    public static void main(String[] args) {
        CollectionCustom<Integer> customCollection = new CollectionCustom<>(5);

        customCollection.addLast(1);
        customCollection.addLast(2);
        customCollection.addLast(3);

        System.out.println("Size: " + customCollection.size());

        customCollection.addFirst(0);
        customCollection.addLast(4);

        System.out.println("Size: " + customCollection.size());

        customCollection.remove(2);

        System.out.println("Size: " + customCollection.size());

        customCollection.removeAll(4);

        System.out.println("Size: " + customCollection.size());

        System.out.println("Is empty: " + customCollection.empty());
    }
}
