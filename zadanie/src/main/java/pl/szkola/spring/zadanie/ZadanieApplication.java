package pl.szkola.spring.zadanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZadanieApplication {

    public static void main(String[] args) {

import java.util.Scanner;

                String[] imionameskie= new String[1];
                imionameskie[0]= "Adam";


                String[] imionazenskie= new String[1];
                imionazenskie[0]= "Ewa";


                Scanner odczyt= new Scanner (System.in);

                for (int i=0; i<1; i++)
                {
                    System.out.println("Podaj imię męskie: ");
                    imionameskie[i]=odczyt.nextLine();
                    System.out.println("Imię jest męskie, "+imionameskie[i]);
                }
                System.out.println("");

                for (int i=0; i<1; i++)
                {
                    System.out.println("Podaj imię żeńskie: ");
                    imionazenskie[i]=odczyt.nextLine();
                    System.out.println("Imie jest żeńskie, "+imionazenskie[i]);
                }

            }
        }

    }
}

