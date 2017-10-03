package algodatTugas;

public class Main2D {
    public static void main(String[] args) {
        
        Object [][] data ={
            {"Sakiman"  ,"1990" ,"Laki"}, 
            {"Juminten"   ,"1992" ,"Perempuan"},
            {"Sutoyo"   ,"1990" ,"Laki"},
            {"Frangky"   ,"1967" ,"Laki"},
            {"Shabrina","1950" ,"Perempuan"}
        };
        
        Object[][] ganti = ChangeArrayLength.changeLength2D(data, 9, 4);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
    }
}

