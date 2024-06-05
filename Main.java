import java.util.Scanner;
import java.util.ArrayList;

class Cat {
    protected String name;
    protected String race;
    protected String[] color;

    void create(String name, String race, String[] color, ArrayList<Cat> catList) {
        this.name = name;
        this.race = race;
        this.color = color;
        catList.add(this);
        System.out.println("Cat is created");
    }

    void set(String newName, String newRace, String[] newColor) {
        this.name = newName;
        this.race = newRace;
        this.color = newColor;
        System.out.println("Cat is edited");
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Race: " + this.race);
        System.out.print("Colors: ");
        for (String c : this.color) {
            System.out.print(c + ", ");
        }
        System.out.println("\n");
    }
}

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Cat> catList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1. Create a cat");
        System.out.println("2. Create default cat");
        System.out.println("3. Set the cat");
        System.out.println("4. View all cat");
        System.out.println("5. Close Program");
        String selectMenu = input.nextLine();

        if (selectMenu.equals("1")) {
            createACat();
        } else if (selectMenu.equals("2")) {
            defaultCat();
        } else if (selectMenu.equals("3")) {
            setCat();
        } else if (selectMenu.equals("4")) {
            viewCat();
        } else if (selectMenu.equals("5")) {
            System.out.println("Program closed.");
        }
    }

    public static void defaultCat() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.create("Boli", "Persian", new String[] { "White", "Black" }, catList);
        cat2.create("Bomu", "Domestic", new String[] { "Black" }, catList);
        main(null);
    }

    public static void createACat() {
        System.out.println("Create the cat");
        System.out.println("");

        System.out.println("Enter the cat's name");
        String createCatName = input.nextLine();
        System.out.println("");

        System.out.println("Enter the cat's race");
        String createCatRace = input.nextLine();
        System.out.println("");

        System.out.println("How many colors does the cat have?");
        int numColors = Integer.parseInt(input.nextLine());
        System.out.println("");

        String[] createCatColor = new String[numColors];
        for (int i = 0; i < numColors; i++) {
            System.out.println("Enter color " + (i + 1) + ":");
            createCatColor[i] = input.nextLine();
        }
        System.out.println("");
        Cat cat = new Cat();
        cat.create(createCatName, createCatRace, createCatColor, catList);
        main(null);
    }

    public static void setCat() {
        if (catList.isEmpty()) {
            System.out.println("No cat created yet. Please create a cat first.");
            main(null);
        } else {

            System.out.println("Edit the cat");
            System.out.println("");

            System.out.println("Enter the index of the cat to edit (starting from 0):");
            int index = Integer.parseInt(input.nextLine());

            if (index < 0 || index >= catList.size()) {
                System.out.println("Invalid index.");
                return;
            }

            Cat catToEdit = catList.get(index);

            System.out.println("Enter the cat's new name");
            String createCatName = input.nextLine();
            System.out.println("");

            System.out.println("Enter the cat's new race");
            String createCatRace = input.nextLine();
            System.out.println("");

            System.out.println("How many new colors does the cat have?");
            int numColors = Integer.parseInt(input.nextLine());
            System.out.println("");

            String[] createCatColor = new String[numColors];
            for (int i = 0; i < numColors; i++) {
                System.out.println("Enter new color " + (i + 1) + ":");
                createCatColor[i] = input.nextLine();
            }
            System.out.println("");

            catToEdit.set(createCatName, createCatRace, createCatColor);

            main(null);
        }
    }

    public static void viewCat() {
        if (catList.isEmpty()) {
            System.out.println("No cat created yet. Please create a cat first.");
            main(null);
        } else {
            System.out.println("List of Cats:");
            for (Cat cat : catList) {
                cat.show();
            }
            main(null);
        }
    }
}
