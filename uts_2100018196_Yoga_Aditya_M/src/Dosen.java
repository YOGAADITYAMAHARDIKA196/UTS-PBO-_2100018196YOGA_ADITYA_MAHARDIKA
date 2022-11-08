public class Dosen extends Karyawan{
    protected String jurusan;
    protected int nidn;
    public int total;

    @Override
    public int gajiutama() {
        return super.gajiutama();
    }

    public int totalgajidos(){
        return super.gajiutama();
    }

    public int mengajarlebihbanyak(int sks){
        total = 100000 * sks;
        return total;
    }

    //overloading methode
    public int totalgajidos(int jam){
        return gaji + total;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }
}
