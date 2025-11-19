public class Fiscalité {
    public static void main(String[] args) {
        Personne p1=new Personne(333333333,"Limam","Nadia");
        Personne p2=new Personne(111111111,"Jouini","Ghofrane");
        Personne p3=new Personne(222222222,"Laouiti","Yomna");

        Lotissement l1=new Lotissement(5);

        PropriétéPrivée pp1=new PropriétéPrivée(1,p1,"Corniche",350,4);
        Villa v1=new Villa(2,p2,"Dar Chaabane",400,6,true);
        Appartement a1=new Appartement(3,p2,"Hammamet",1200,8,3);
        PropriétéProfessionnelle ppp1=new PropriétéProfessionnelle(4,p3,"Korba",1000,50,true);
        PropriétéProfessionnelle ppp2=new PropriétéProfessionnelle(5,p1,"Bir Bouragba",2500,400,false);

        l1.ajouter(pp1);
        l1.ajouter(v1);
        l1.ajouter(a1);
        l1.ajouter(ppp1);
        l1.ajouter(ppp2);

        System.out.println("Toutes les propriétés : ---------------------------------------------------");
        for (int i = 0; i < l1.nombre; i++) {
            Propriété p = l1.getpropriétéByIndex(i);
            System.out.println(p.toString() + " - Impôts : " + p.calculImpot() + " DT");
        }

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("le nombre global des pièces est: "+l1.getnbPièces());

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("la propriété qui paie le moins d'impots est: "+l1.moinsImpot().toString());

        l1.supprimer(a1);

        System.out.println("--------------------------------------------------------------------------------");

        l1.afficherPropriétés();

        Lotissement lt= new LotissementPrivée(10);

        System.out.println("Lotissement Privée: --------------------------------------------------------------------------------");

        lt.ajouter(pp1);
        lt.ajouter(v1);
        lt.ajouter(a1);
        lt.ajouter(ppp1);
        lt.ajouter(ppp2);


        System.out.println("Toutes les propriétés :");
        for (int i = 0; i < lt.nombre; i++) {
            Propriété p = lt.getpropriétéByIndex(i);
            System.out.println(p.toString() + " - Impôts : " + p.calculImpot() + " DT");
        }
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("le nombre global des pièces est: "+l1.getnbPièces());

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("la propriété qui paie le moins d'impots est: "+l1.moinsImpot().toString());

        lt.supprimer(a1);

        System.out.println("--------------------------------------------------------------------------------");

        lt.afficherPropriétés();
    }
}
