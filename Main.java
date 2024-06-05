import java.util.Scanner;

class Cat {
    protected String name;
    protected String race;
    protected String[] color;

    void create(String name, String race, String[] color) {
        this.name = name;
        this.race = race;
        this.color = color;
        System.out.println("Cat is created");
    }

    void set() {

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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Create a cat");
        System.out.println("2. Set the cat");
        System.out.println("3. Close Program");
        String selectMenu = input.nextLine();

        if (selectMenu.equals("1")) {
            createACat();
        } else if (selectMenu.equals("2")) {
            setCat();
        } else if (selectMenu.equals("3")) {

        }
    }

    public static void createACat() {
        System.out.println("Create the cat");
        Cat cat = new Cat();

        cat.create("Boll", "Persian", new String[] { "White", "Black" });
        cat.show();
        main(null);
    }

    public static void setCat() {
        System.out.println("Setting");
        main(null);
    }
}
