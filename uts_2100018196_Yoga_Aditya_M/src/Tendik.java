public class Tendik extends Karyawan{
    protected int total;

    @Override
    public int gajiutama() {
        return super.gajiutama();
    }

    public int totalgajitendik(){
        return super.gajiutama();
    }

    public int lemburan(int jam){
        total= 50000*jam;
        return total;
    }

    public int totalgajitendik(int jam){
        return gaji + total;
    }
}
