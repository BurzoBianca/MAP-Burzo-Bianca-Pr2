package view;

import classes.Mitarbeiter;
import controller.Controller;

import java.util.List;
import java.util.Scanner;

public class View {
    private Controller controller;
    public View(Controller controller) {
        this.controller = controller;
    }

    public void Run() {
        Scanner scanner = new Scanner(System.in);
        int continueLoop =1;
        while(continueLoop==1){
            System.out.println("1.Add Mitarbeiter\n2.Delete Mitarbeiter\n3.Update Mitarbeiter\n4.Exit\n");
            String Name = null;
            int Lohn;
            Long pId;
            List<Mitarbeiter> teammitarbeiter = null;
            String input =scanner.next();
            System.out.println(input);

            switch (input) {
                case "1":
                    System.out.println("Neues Mitarbeiter Name : ");
                    Name = scanner.next();
                    System.out.println("Neues Mitarbeiter Id : ");
                    pId = Long.parseLong(scanner.next());
                    System.out.println("Neues Mitarbeiter Lohn : ");
                    Lohn = Integer.parseInt(scanner.next());
                    Mitarbeiter newMitarbeiter = new Mitarbeiter(pId, Name, Lohn);
                    controller.addMitarbeiter(newMitarbeiter);
                    break;

                case "2":
                    System.out.println("Mitarbeiter Id zum loschen : ");
                    pId = Long.parseLong(scanner.next());

                    controller.deleteMitarbeiter(pId);
                    break;

                case "3":
                    System.out.println("Mitarbeiter Id fur update : ");
                    pId = Long.parseLong(scanner.next());
                    System.out.println("Neues Produkt Lohn : ");
                    Lohn = Integer.parseInt(scanner.next());
                    Mitarbeiter updateProdukt = new Mitarbeiter(pId, Name, Lohn);
                  //  controller.updateMitarbeiter();
                    break;

                    
                case "4":
                    continueLoop=0;
                    break;
                default:
            }
            System.out.println("Success");

        }
    }
}
