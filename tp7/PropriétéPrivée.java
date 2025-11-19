public class PropriétéPrivée extends Propriété{
    protected int nbPièces;
    public PropriétéPrivée(int id, Personne responsable, String adresse, double surface,int nbPièces){
        super(id, responsable,adresse,surface);
        this.nbPièces=nbPièces;
    }
    public double calculImpot(){
        return 50*(surface/100)+ 10*nbPièces;
    }
    public String toString() {
        return (super.toString()+" avec "+this.nbPièces+" nombre de pièces.");
    }
    public int getNbPièces(){
        return nbPièces;
    }
}
