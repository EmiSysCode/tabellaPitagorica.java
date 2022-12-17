import java.util.Scanner;
public class tabellaPitagorica {
    public static void main(String[] args) {
        Scanner pita= new Scanner(System.in);
        System.out.println("TABELLA PITAGORICA");
        System.out.print("Inserisci il numero per le dimensioni della tabella: ");
        int dimensioni= pita.nextInt();
        System.out.println();
        int righe= dimensioni, colonne= dimensioni;

        for (int i=1; i<=righe; i++){
            for (int j=1; j<=colonne; j++){
               int prodotto= i*j;
                System.out.print(prodotto + "\t");
            }
            System.out.println();
        }
    }
}