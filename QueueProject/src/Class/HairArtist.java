package Class;

public class HairArtist {
    private String nama;
    private String jam;

    public HairArtist() {
    }

    public HairArtist( String jam, String nama) {
        this.jam = jam;
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
    
    @Override
    public String toString(){
        return jam;
    }
}
