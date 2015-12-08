import java.util.Scanner;
class Exercice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix unitaire HT:");
        int prix = sc.nextInt();
        System.out.println("Veuillez saisir le taux de TVA (%):");
        float tva = sc.nextInt();
        System.out.println("Veuillez saisir la quantite de produit:");
        int quant = sc.nextInt();
        int prix2 = (prix*quant);
        float ttc = (prix2+(prix2*(tva/100)));
        System.out.println("Le prix TTC est " + ttc);

	}

}