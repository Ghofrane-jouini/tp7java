public class LotissementPrivée extends Lotissement {
    public LotissementPrivée(int max){
        super(max);
    }
    @Override
    public boolean ajouter(Propriété p) {
        if (p instanceof PropriétéPrivée) {
            return super.ajouter(p);
        } else {
            System.out.println("Impossible d'ajouter : ce n'est pas une propriété privée");
            return false;
        }
    }
    public PropriétéPrivée getpropriétéByIndex(int i){
        Propriété p = super.getpropriétéByIndex(i);
        if (p instanceof PropriétéPrivée) {
            return (PropriétéPrivée) p;
        } else {
            return null;
        }
    }
    public int getnbPièces(){
        return super.getnbPièces();
    }
}
