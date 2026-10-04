public class Main {

    public static void main(String[] args) {

        // ==========================================
        // Création du zoo
        // ==========================================

        Zoo myZoo = new Zoo("My Zoo", "Tunis");


        // ==========================================
        // Création des animaux
        // ==========================================

        Animal lion = new Animal(
                "Felidae",
                "Simba",
                5,
                true
        );

        Animal elephant = new Animal(
                "Elephantidae",
                "Dumbo",
                8,
                true
        );

        Animal tiger = new Animal(
                "Felidae",
                "Tiger",
                6,
                true
        );

        Animal eagle = new Animal(
                "Accipitridae",
                "Eagle",
                3,
                false
        );


        // ==========================================
        // Instruction 10 : Ajouter les animaux
        // ==========================================

        System.out.println("===== AJOUT DES ANIMAUX =====");

        System.out.println("Lion ajouté : " + myZoo.addAnimal(lion));
        System.out.println("Elephant ajouté : " + myZoo.addAnimal(elephant));
        System.out.println("Tiger ajouté : " + myZoo.addAnimal(tiger));
        System.out.println("Eagle ajouté : " + myZoo.addAnimal(eagle));


        // ==========================================
        // Instruction 11 : Afficher les animaux
        // ==========================================

        System.out.println();
        myZoo.displayAnimals();


        // ==========================================
        // Recherche d'un animal
        // ==========================================

        System.out.println();
        System.out.println("===== RECHERCHE =====");

        int index = myZoo.searchAnimal(lion);

        System.out.println("Indice du lion : " + index);


        // ==========================================
        // Tester un animal identique
        // ==========================================

        Animal lion2 = new Animal(
                "Felidae",
                "Simba",
                5,
                true
        );

        int index2 = myZoo.searchAnimal(lion2);

        System.out.println("Indice du deuxième Simba : " + index2);

        System.out.println(
                "Ajout du deuxième Simba : "
                        + myZoo.addAnimal(lion2)
        );


        // ==========================================
        // Instruction 13 : Suppression
        // ==========================================

        System.out.println();
        System.out.println("===== SUPPRESSION =====");

        boolean removed = myZoo.removeAnimal(lion);

        System.out.println("Lion supprimé : " + removed);

        System.out.println();
        myZoo.displayAnimals();


        // ==========================================
        // Instruction 14 : Vérifier si le zoo est plein
        // ==========================================

        System.out.println();
        System.out.println("===== CAPACITE DU ZOO =====");

        System.out.println(
                "Le zoo est plein : "
                        + myZoo.isZooFull()
        );


        // ==========================================
        // Instruction 15 : Comparer deux zoos
        // ==========================================

        Zoo zoo2 = new Zoo("Zoo Carthage", "Tunis");

        Animal giraffe = new Animal(
                "Giraffidae",
                "Giraffe",
                7,
                true
        );

        Animal monkey = new Animal(
                "Cebidae",
                "Monkey",
                4,
                true
        );

        zoo2.addAnimal(giraffe);
        zoo2.addAnimal(monkey);


        System.out.println();
        System.out.println("===== COMPARAISON DES ZOOS =====");

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, zoo2);

        System.out.println(
                "Le zoo qui contient le plus d'animaux est : "
                        + biggerZoo.name
        );

        biggerZoo.displayZoo();
    }
}