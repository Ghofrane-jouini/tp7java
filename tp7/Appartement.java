public class Appartement extends PropriétéPrivée{
    private int numEtage;
    public Appartement(int id, Personne responsable, String adresse, double surface,int nbPièces,int numEtage) {
        super(id,responsable,adresse,surface,nbPièces);
        this.numEtage = numEtage;
    }
    public String toString() {
        return (super.toString()+" avec "+this.numEtage+" nombres d'étages.");
    }
}
