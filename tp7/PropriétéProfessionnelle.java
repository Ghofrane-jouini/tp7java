public class PropriétéProfessionnelle extends Propriété{
    private int nbEmployés;
    private boolean estEtatique;
    public PropriétéProfessionnelle(int id, Personne responsable, String adresse, double surface,int nbEmployés, boolean estEtatique) {
        super(id, responsable,adresse,surface);
        this.nbEmployés=nbEmployés;
        this.estEtatique=estEtatique;
    }
    public double calculImpot(){
        if (!estEtatique){
            return 100*(surface/100)+30*nbEmployés;
        }
        else{
            return 0;
        }
    }
    public String toString()
    {
        return (super.toString()+" avec "+this.nbEmployés+" employés et elle est étatique: "+this.estEtatique);
    }
}
