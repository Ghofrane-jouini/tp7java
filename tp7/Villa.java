public class Villa extends PropriétéPrivée{
    private boolean estPiscine;
    public Villa(int id, Personne responsable, String adresse, double surface,int nbPièces,boolean estPiscine){
        super(id,responsable,adresse,surface,nbPièces);
        this.estPiscine = estPiscine;
    }
    public double calculImpot(){
        if (estPiscine){
            return super.calculImpot()+200;
        }
        else{
            return super.calculImpot();
        }
    }
    public String toString() {
        return (super.toString()+" avec piscine: "+this.estPiscine);
    }
}
