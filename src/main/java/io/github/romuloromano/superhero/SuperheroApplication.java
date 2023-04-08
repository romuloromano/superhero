package io.github.romuloromano.superhero;

import io.github.romuloromano.superhero.model.*;
import io.github.romuloromano.superhero.service.impl.SuperHeroServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SuperheroApplication {

    public static void main(String[] args) throws Exception {

        Logger logger = Logger.getLogger(SuperheroApplication.class);

        SpringApplication.run(SuperheroApplication.class, args);

        Scanner choice = new Scanner(System.in);
        int operation;

        do {
            System.out.println("Choose one of the options to get to know your Super Hero better");
            System.out.println("Or enter 0 for exit: ");

            System.out.println("1 - Power Stats");
            System.out.println("2 - Biography");
            System.out.println("3 - Appearance");
            System.out.println("4 - Work");
            System.out.println("5 - Connections");
            System.out.println("6 - Image\n");

            System.out.println("Enter option number: ");
            operation = choice.nextInt();

            if ((operation < 0) || (operation > 6)) {
                System.out.println("Invalid number, please select one of the options: \n");

            } else

            switch (operation) {
                case 1:
                    System.out.print("Enter the hero number: ");
                    String hero = new Scanner(System.in).nextLine();
                    PowerStats powerStats = SuperHeroServiceImpl.findByIdSuperheroPowerStats(hero);
                    System.out.println(powerStats.toString());
                    break;

                case 2:
                    System.out.println("Enter the hero number: ");
                    hero = new Scanner(System.in).nextLine();
                    Biography biography = SuperHeroServiceImpl.findByIdSuperheroBiography(hero);
                    System.out.println(biography.toString());
                    break;

                case 3:
                    System.out.println("Enter the hero number: ");
                    hero = new Scanner(System.in).nextLine();
                    Appearance appearance = SuperHeroServiceImpl.findByIdSuperheroAppearance(hero);
                    System.out.println(appearance.toString());
                    break;

                case 4:
                    System.out.println("Enter the hero number: ");
                    hero = new Scanner(System.in).nextLine();
                    Work work = SuperHeroServiceImpl.findByIdSuperheroWork(hero);
                    System.out.println(work.toString());
                    break;

                case 5:
                    System.out.println("Enter the hero number: ");
                    hero = new Scanner(System.in).nextLine();
                    Connections connections = SuperHeroServiceImpl.findByIdSuperheroConnections(hero);
                    System.out.println(connections.toString());
                    break;

                case 6:
                    System.out.println("Enter the hero number: ");
                    hero = new Scanner(System.in).nextLine();
                    Image image = SuperHeroServiceImpl.findByIdSuperheroImage(hero);
                    System.out.println(image.toString());
                    break;
            }
        } while (operation != 0);
    }

}
