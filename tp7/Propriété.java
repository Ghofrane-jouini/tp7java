abstract public class Propriété {
    protected int Id;
    protected Personne responsable;
    protected String adresse;
    protected double surface;
    public Propriété(int id, Personne responsable, String adresse, double surface) {
        this.Id = id;
        this.responsable = responsable;
        this.adresse = adresse;
        this.surface = surface;
    }
    public String toString() {
        return (this.Id + ":" + this.responsable + " habite à " + this.adresse + " avec " + this.surface +" m².");
    }
    abstract public double calculImpot();
}
