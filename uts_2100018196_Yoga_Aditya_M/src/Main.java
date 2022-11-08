public class Main {
    public static void main(String[] args) {
        int pilih;
   
        System.out.println("==================================");
        System.out.println("1.Lihat Gaji Dosen");
        System.out.println("2.Lihat Gaji TenDik");
        System.out.println("==================================");
        System.out.print("masukkan pilihan anda");
        pilih=in.nextInt();

        if(pilih == 1){
            System.out.println("BERIKUT RINCIAN GAJI DOSEN");
            Dosen dos = new Dosen();

            dos.setJurusan("informatika UAD");
            dos.setNama("SUPRIANTO ST.MT");
            dos.setJeniskelamin("laki-laki");
            dos.setNidn(1231545);
            dos.setNip(6574577);
            dos.setTanggallahir("10/10/1990");
            dos.setAlamat("Lampung");
            dos.setThnmasuk(2005);

            System.out.println("========================================================================");
            System.out.println("Nama Dosen          : " + dos.getNama());
            System.out.println("NIDN                : " +dos.getNidn());
            System.out.println("Jenis Kelamin       : " +dos.getJeniskelamin());
            System.out.println("Jurusan             : " + dos.getJurusan());
            System.out.println("Nomor Induk pegawai : " + dos.getNip());
            System.out.println("Tanggal Lahir       : " + dos.getTanggallahir());
            System.out.println("Alamat              : " + dos.getAlamat());
            System.out.println("Tahun masuk         : " + dos.getThnmasuk());
            System.out.println("Gaji pokok          : " + dos.totalgajidos());
            System.out.println("Kelas ajar lebih    : " +dos.mengajarlebihbanyak(6));
            System.out.println("Gaji total          : " + dos.totalgajidos(6));
            System.out.println("========================================================================");
        }
        else if(pilih == 2){
            System.out.println("BERIKUT RINCIAN GAJI DOSEN");

            Tendik tnd = new Tendik();
            tnd.setNama("POWER RANGGER PINK");
            tnd.setJeniskelamin("Perempuan");
            tnd.setNip(12345678);
            tnd.setTanggallahir("22/03/1999");
            tnd.setAlamat("DURIAN RUNTUH");
            tnd.setThnmasuk(2019);

            System.out.println("========================================================================");
            System.out.println("Nama Tendik         : "+ tnd.getNama());
            System.out.println("Nomor Induk Pegawai : "+ tnd.getNip());
            System.out.println("Tanggal Lahir       : "+ tnd.getTanggallahir());
            System.out.println("Alamat Tendik       : "+ tnd.getAlamat());
            System.out.println("Tahun masuk         : "+ tnd.getThnmasuk());
            System.out.println("Gaji pokok          : "+tnd.totalgajitendik());
            System.out.println("Gaji lembur         : "+ tnd.lemburan(20));
            System.out.println("Gaji total          : "+ tnd.totalgajitendik(20));
            System.out.println("========================================================================");

        }else{
            System.out.println("menu tidak tersedia");
        }
        //akhir kurung main
    }
}
