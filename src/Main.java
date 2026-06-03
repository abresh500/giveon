import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ActII album = new ActII();

        System.out.println("Choose a song:");
        System.out.println("1. Jezebel");
        System.out.println("2. Replica");
        System.out.println("3. Fool Me Once");
        System.out.println("4. Save Me");
        System.out.println("5. keeper");
        System.out.println("6. numb");
        System.out.print("7 avaleche");

        System.out.println(" 8 don't leave");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                album.play();
                break;
            case 2:
                album.play2();
                break;
            case 3:
                album.play3();
                break;://
            case 4:
                album.play4();
                break;
             case 5:
                 album.play5();
                 break;
            case 6:
                album.play6();
                break;
            case 7:
                album.play7();
                break;
            case 8:
                album.play8();
                break;

            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }
}
//at the end of end of the day