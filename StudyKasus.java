public class Nigas {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Audi", "R8", 2012, "Hitam");
        mobil.infoKendaraan();
        mobil.nyalakanMesin();

        SepedaMotor motor = new SepedaMotor("Harley Davidson", "KnuckleHead", 1937, "Hijau");
        motor.infoKendaraan();
        motor.nyalakanMesin();
    }
}


class Kendaraan {
    String merek;
    String tipe;
    int tahun;
    String warna;

    public Kendaraan(String merek, String tipe, int tahun, String warna) {
        this.merek = merek;
        this.tipe = tipe;
        this.tahun = tahun;
        this.warna = warna;
    }

    public void infoKendaraan() {
        System.out.println("Merek: " + merek);
        System.out.println("Tipe: " + tipe);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
    }
}

class Mobil extends Kendaraan {
    Mobil(String merek, String tipe, int tahun, String warna) {
        super(merek,tipe,tahun,warna);
    }
    public void nyalakanMesin() {
        System.out.println("Mesin Mobil Sedang Dinyalakan...\n");
    }
}

class SepedaMotor extends Kendaraan {
    SepedaMotor(String merek, String tipe, int tahun, String warna) {
        super(merek,tipe,tahun,warna);
    }
    public void nyalakanMesin() {
        System.out.println("Mesin Motor Sedang Dinyalakan...");
    }
}

