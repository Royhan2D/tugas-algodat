package algodatTugas;

public class Driver {

    public static void main(String[] args) {
        ArrayLinearList x = new ArrayLinearList();
        System.out.println("add soal no.4");
        System.out.println("--------------------------------------------");
        System.out.println("tuut... tuut..");
        x.add(0, "a");
        x.add(1, "b");
        x.add(2, "c");
        x.add(3, "d");
        x.add(4, "e");
        System.out.println(x.size());
        System.out.println("Isi awal = " + x.toString());
        System.out.println("Tambah data index ke 0,3,7");
        System.out.println("tuut... tuut..");
        x.add(0, "1");
        x.add(3, "2");
        x.add(7, "3");
        System.out.println(x.size());
        System.out.println("Isi yang sudah di tambah = " + x.toString());
        System.out.println("Menghapus index ke 0,4");
        System.out.println("tuut... tuut..");
        x.remove(0);
        x.remove(4);
        System.out.println(x.size());
        System.out.println("Isi yang sudah di remove = " + x.toString());
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("Soal No.5 Trim Size");
        System.out.println("--------------------------------------------");
        System.out.println("tuut... tuut..");
        System.out.println("panjang array : " + x.size());
        System.out.println("kapasitas array sebelum di trim : " + x.element.length);
        x.trimToSize();
        System.out.println("kapasitas array setelah di trim : " + x.element.length);
        System.out.println("--------------------------------------------");
        System.out.println("Soal No.6 SetSize");
        System.out.println("--------------------------------------------");
        System.out.println("tuut... tuut..");
        System.out.print("ukuran element di set menjadi: ");
        x.setSize(8);
        System.out.println(x.element.length);
        System.out.println(x.toString());
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("Soal No.8 Clear");
        System.out.println("--------------------------------------------");
        x.clear();
        System.out.println(x.toString());
    }
}
