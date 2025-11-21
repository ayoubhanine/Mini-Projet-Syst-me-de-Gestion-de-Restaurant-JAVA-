public class PlatSpecial extends Plat{
    private String TypeSpecial;

    public PlatSpecial(int idPlat, String nom, double prix, String typeSpecial) {
        super(idPlat, nom, prix);
        TypeSpecial = typeSpecial;
    }

    public String getTypeSpecial() {
        return TypeSpecial;
    }
    public void setTypeSpecial(String typeSpecial) {
        TypeSpecial = typeSpecial;
    }


    @Override
    public String toString() {
        return "PlatSpecial{" +
                "TypeSpecial='" + TypeSpecial + '\'' +
                ", idPlat=" + idPlat +
                ", nom='" + nom + '\'' +
                ", Prix=" + Prix +
                '}';
    }


}
