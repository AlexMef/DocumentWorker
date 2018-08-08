import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key;
        System.out.println("Введите ключ : ");
        key = in.nextInt();

        if (key == 0){
            DocumentWorker worker = new DocumentWorker();
        } else if (key == 322){
            DocumentWorker proWorker = new ProDocumentWorker();
        } else if (key == 228){
            DocumentWorker expertWorker = new ExpertDocumentWorker();
        }


    }
}
