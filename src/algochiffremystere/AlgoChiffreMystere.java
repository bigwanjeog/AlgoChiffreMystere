package algochiffremystere;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENAUD on 30/08/2016.
 */
public class AlgoChiffreMystere {

    public static void main(String[] args) {

        Random rdm = new Random();
        int numMystere = rdm.nextInt(100) + 1;
        int numTest = 0;//numéro entré a tester
        int cptTest = 0;//nombre de test effectué
        int nbDeTest = 0;//nombre max de test
        boolean trouver = false;//boolean determinant si le nombre est trouvé
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre nombre de test à effectuer :");
        nbDeTest = sc.nextInt();//saisie du nombre de test
        int tabTest[] = new int[nbDeTest];
        /**
         * tant que que le numéro entré est différent du numéro mystère et
         * que le nombre de test est inférieur au nombre max de test
         */
        while (numMystere != numTest && cptTest < nbDeTest){
            cptTest++;
            System.out.println("Entrez votre chiffre a tester :");
            numTest = sc.nextInt();//saisie du nombre a tester
            tabTest[cptTest - 1] = numTest;
            /**
             * si le numéro mystère est inférieur au numéro tester renvoie d'un message
             * sinon si le numéro mystère est suppérieur au numéro tester renvoie d'un message
             * sinon le numéro mystère est égale au numéro tester, boolean trouver mis a true
             */
            if (numMystere < numTest) {
                if (cptTest < nbDeTest) {
                    System.out.println("Le chiffre mystère est plus PETIT que " + numTest + ", il vous reste " + (nbDeTest - cptTest) + " essais");
                }//end if
            }//end if
            else if (numMystere > numTest){
                if (cptTest < nbDeTest) {
                    System.out.println("Le chiffre mystère est plus GRAND que " + numTest + ", il vous reste " + (nbDeTest - cptTest) + " essais");
                }//end if
            }//end else if
            else{
                trouver = true;//reponse trouver
            }//end else
        }//end while

        if (trouver) {
            System.out.println("Vous avez trouvez le chiffre mystère qui était " + numMystere + " avec " + cptTest + " essais");
            for (int i : tabTest) {
                if (i != 0){
                    System.out.print(i + " ");
                }
            }//end foreach
        }//end if
        else {
            System.out.println("Vous n'avez pas trouvez le chiffre mystère qui était " + numMystere);
            System.out.print("Vos test ");
            for (int i : tabTest) {
                System.out.print(i + " ");
            }//end foreach
        }//end else
    }
}
