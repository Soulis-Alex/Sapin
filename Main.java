package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Alex Soulis copyright © 2021");
        System.out.println("    This is my Tree ↓");
        fct_Sapin(20);
    }

    // Fonction qui dessine un sapin
    // Input : iTaille : largeur du sapin
    // Output Impression ecran
    static void fct_Sapin(int iTaille) {

        int iMilieu = iTaille - 1;
        int iLongeurBase = iMilieu * 2;
        int iBlanc = iMilieu - 1;
        int iSlash = iMilieu;
        int iBackSlash = iMilieu + 1;
        int iCellule;
        int iWidth = iBackSlash + 1;
        boolean bPaire;

        System.out.print(" ");

        for (int iEtoile = 0; iEtoile <= iMilieu; iEtoile++) {
            if (iEtoile == iMilieu) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int iLigne = 1; iLigne <= iMilieu; iLigne++) {

            bPaire = (iLigne % 2 == 0);
//commentaire
            for (iCellule = 0; iCellule <= iWidth; iCellule++) {

                if (iCellule <= iBlanc) {

                    if (iCellule == iBlanc && bPaire == true) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if (iCellule >= iSlash && iCellule <= iMilieu) {
                    System.out.print("/");
                }
                if (iCellule <= iBackSlash && iCellule > iMilieu) {
                    System.out.print("\\");
                }
                if (iCellule == iWidth && bPaire == true) {
                    System.out.print("*");
                }

            }
            /*}

             */
            System.out.println();

            iBlanc -= 1;
            iSlash -= 1;
            iBackSlash += 1;
            iWidth += 1;


        }

        // mise en place du tronc d'arbre
        int iTroncMin = iMilieu / 3 * 2;
        int iTroncMax = iMilieu + (iMilieu / 3);
        if (iTaille == 2) {
            System.out.println(" |");
        } else {

            for (int iHauteur = 0; iHauteur < iLongeurBase / 4; iHauteur++) {

                for (iCellule = 0; iCellule <= iLongeurBase; iCellule++) {
                    if (iCellule == iTroncMin || iCellule == (iTroncMax)) {
                        System.out.print("||");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("|                                                           |");
        System.out.println("|      The end of the tree is here (sad but true)           |");
        System.out.println("|      Created by Alex Soulis                               |");
        System.out.println("|                                                           |");
        System.out.println("|-----------------------------------------------------------|");
    }

}

