import java.util.Scanner;

public class Main {

    static int [] tableau = { 17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        String msgX=("Entrez l'indice de l'entier à diviser: ");

        x = readInteger(msgX,0,9);

        String msgY="Entrez le diviseur";

        y = readDivider(msgY);

        System.out.println("Le résultat de la division est : " + Division(x,y));

    }



    static int Division(int indice, int diviseur)

    {

        return tableau[indice] / diviseur;

    }
    public static int readInteger(String message,int min,int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result >= min && result <= max) {
                    return result;
                } else {
                    throw new IllegalStateException("La valeur doit etre comprise entre " + min + " et " + max + ": " + result);
                }
            }catch(NumberFormatException e){
                System.err.println("une erreur est survenue: la valeur entrée doit être un entier. ");

            }catch(RuntimeException e){
                System.err.println("Une erreur est survenue:" +e);
                System.out.println(message);
            }
        }
    }    public static int readDivider(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (!(result == 0)) {
                    return result;
                } else {
                    throw new IllegalStateException("la valeur entrée doit etre un entier inférieur ou supérieur à 0: " + result);
                }
            }catch(NumberFormatException e){
                System.err.println("une erreur est survenue: la valeur entrée doit être un entier. ");
            }
            catch(RuntimeException e){
                System.err.println("Une erreur est survenue: "+e);
                System.out.println(message);
            }
        }
    }
}