public class Lotissement implements GestionPropriete {
    protected Propriété[] tabProp;
    protected int nombre;
    protected int max;

    public Lotissement(int max) {
        this.max = max;
        tabProp = new Propriété[max];
        nombre = 0;
    }

    public Propriété getpropriétéByIndex(int i) {
        if (i >= 0 && i < this.nombre) {
            return tabProp[i];
        }
        return null;
    }

    public int getnbPièces() {
        int total = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof PropriétéPrivée) {
                PropriétéPrivée pp = (PropriétéPrivée) tabProp[i];
                total += pp.getNbPièces();
            }
        }
        return total;
    }
    public PropriétéPrivée moinsImpot(){
        PropriétéPrivée p=null;
        for (int i = 0; i < nombre-1; i++) {
            if (tabProp[i] instanceof PropriétéPrivée){
                PropriétéPrivée current = (PropriétéPrivée) tabProp[i];
                if (p == null) {
                    p = current;
                }
                else{
                    if (current.calculImpot()<p.calculImpot()) {
                        p = current;}
                }
            }
        }
        return p;
    }

    @Override
    public void afficherPropriétés() {
        for (int j = 0; j < this.nombre; j++) {

            if (tabProp[j] != null) {
                System.out.println(tabProp[j].toString());
            }
        }
    }

    @Override
    public boolean ajouter(Propriété p) {
        if (this.nombre == this.max) {
            return false;
        }
        tabProp[nombre] = p;
        nombre++;
        return true;
    }

    @Override
    public boolean supprimer(Propriété p) {
        for (int j = 0; j < this.nombre; j++) {
            if (tabProp[j].Id == p.Id) {
                for (int i = j; i < this.nombre - 1; i++) {
                    tabProp[i] = tabProp[i + 1];
                }
                tabProp[this.nombre - 1] = null;
                this.nombre--;
                return true;
            }
        }
        return false;
    }
}
