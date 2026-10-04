public class Zoo {

    Animal[] animals;
    String name;
    String city;

    // Nombre maximum de cages
    final int nbrCages = 25;

    // Compteur du nombre d'animaux présents
    int nbrAnimals = 0;


    // Constructeur
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;

        // Le zoo peut contenir au maximum 25 animaux
        this.animals = new Animal[nbrCages];
    }


    // ==========================================
    // Instruction 10 : Ajouter un animal
    // ==========================================

    public boolean addAnimal(Animal animal) {

        // Vérifier si le zoo est plein
        if (isZooFull()) {
            return false;
        }

        // Vérifier que l'animal n'existe pas déjà
        if (searchAnimal(animal) != -1) {
            return false;
        }

        // Ajouter l'animal dans la première case disponible
        animals[nbrAnimals] = animal;

        // Incrémenter le compteur
        nbrAnimals++;

        return true;
    }


    // ==========================================
    // Instruction 11 : Afficher les animaux
    // ==========================================

    public void displayAnimals() {

        if (nbrAnimals == 0) {
            System.out.println("Le zoo ne contient aucun animal.");
            return;
        }

        System.out.println("===== ANIMAUX DU ZOO =====");

        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println("Animal " + (i + 1) + " : " + animals[i]);
        }
    }


    // ==========================================
    // Instruction 11 : Rechercher un animal
    // ==========================================

    public int searchAnimal(Animal animal) {

        for (int i = 0; i < nbrAnimals; i++) {

            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }

        return -1;
    }


    // ==========================================
    // Instruction 13 : Supprimer un animal
    // ==========================================

    public boolean removeAnimal(Animal animal) {

        int index = searchAnimal(animal);

        // Animal non trouvé
        if (index == -1) {
            return false;
        }

        // Décaler les animaux vers la gauche
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        // Vider la dernière case
        animals[nbrAnimals - 1] = null;

        // Diminuer le compteur
        nbrAnimals--;

        return true;
    }


    // ==========================================
    // Instruction 14 : Zoo plein
    // ==========================================

    public boolean isZooFull() {

        return nbrAnimals >= nbrCages;
    }


    // ==========================================
    // Instruction 15 : Comparer deux zoos
    // ==========================================

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {

        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }


    // ==========================================
    // displayZoo()
    // ==========================================

    public void displayZoo() {

        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Nombre d'animaux : " + nbrAnimals);
    }


    // ==========================================
    // toString()
    // ==========================================

    @Override
    public String toString() {

        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", nbrAnimals=" + nbrAnimals +
                '}';
    }
}