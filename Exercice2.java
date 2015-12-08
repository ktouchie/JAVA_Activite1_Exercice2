import java.util.Scanner;
class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix unitaire HT:");
        int prix = sc.nextInt();
        System.out.println("Veuillez saisir la quantité de produit:");
        int quant = sc.nextInt();
        int ttc = ((base*height)/2);
        System.out.println("Le prix TTC est " + ttc);

	}

}