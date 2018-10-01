/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Ramalan Sifat dan karakter berdasarkan warna yang user sukai
 */
package pkgif.pkg3.pkg10117110.latihan29.warnakepribadian;

import java.util.Scanner;


public class IF310117110Latihan29WarnaKepribadian {
    // kode text color
        public static final String RESET = "\u001B[0m";
        public static final String NORMAL = "\u001b[0m";
        public static final String BLACK = "\u001b[30m";
        public static final String RED = "\u001b[31m";
        public static final String GREEN = "\u001b[32m";
        public static final String YELLOW = "\u001b[33m";
        public static final String BLUE = "\u001b[34m";
        public static final String MAGENTA = "\u001b[35m";
        public static final String CYAN = "\u001b[36m";
        public static final String WHITE = "\u001b[37m";
        public static final String BLINK = "\u001b[5m";
        
    //    kode background color
        public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
        public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    
   
        public static void main(String[] args){
            
            String nama, warna;
            Scanner scan = new Scanner(System.in);
            
            System.out.println( RED + "YUK " +GREEN+ "CEK " +YELLOW+ 
                    "KEPRIBADIAN " +CYAN+ "DARI " +MAGENTA+ "WARNA " +BLUE+ 
                    "FAVORITMU ");
            
        System.out.print("\n"+ANSI_RED_BACKGROUND+WHITE+"\t MERAH \t\t\n"+RESET);
        System.out.print(ANSI_GREEN_BACKGROUND+WHITE+"\t HIJAU \t\t\n"+RESET);
        System.out.print(ANSI_YELLOW_BACKGROUND+WHITE+"\t KUNING \t\n"+RESET);
        System.out.print(ANSI_BLUE_BACKGROUND+WHITE+"\t BIRU \t\t\n"+RESET);
        System.out.print(ANSI_PURPLE_BACKGROUND+WHITE+"\t UNGU \t\t\n\n"+RESET);
        
            System.out.print("PILIH WARNA FAVORIMU\t: ");
            warna = scan.nextLine();
            System.out.print("NAMA KAMU\t: ");
            nama = scan.nextLine();
            
            System.out.println("====HASIL TEST KEPRIBADIAN "+nama+ "====");
            System.out.println("Warna Favoritmu adalah : "+warna);
            
            if(warna.equalsIgnoreCase("MERAH")){
                
             //MERAH
            System.out.println("1. Periang,");
            System.out.println("2. Pemberani,");
            System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
            System.out.println("4. Menyukai Tantangan,");
            System.out.println("5. Kurang Sabar,");
            System.out.println("6. Dapat menahan marah namun jika sudah tahap "
                    + "puncak toleransi, kemarahannya akan sulit di kontrol,");
            System.out.println("7. Memiliki energi kehangatan dan cinta.");
            }else if(warna.equalsIgnoreCase("HIJAU")){
             //HIJAU
            System.out.println("1, Romantis,");
            System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
            System.out.println("3. Teguh dan prinsip,");
            System.out.println("4. Menginginkan Kesempurnaan,");
            System.out.println("5. Mudah Cemburu,");
            System.out.println("6. Mudah Merasa iri,");
            System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan "
                    + "kepercayaan.");
            }else if(warna.equalsIgnoreCase("KUNING")){
             //KUNING
            System.out.println("1. Optimis,");
            System.out.println("2. Suka bergaul,");
            System.out.println("3. Periang,");
            System.out.println("4. Senang menolong,");
            System.out.println("5. Lincah dan aktif,");
            System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
            System.out.println("7. Loyal,");
            System.out.println("8. Hangat,");
            System.out.println("9. Meskipun karakternya optimis dan idealis, "
                    + "seringkali goyah dan tidak stabil,");
            System.out.println("10. Cenderung penakut.");
            }else if(warna.equalsIgnoreCase("BIRU")){
              //BIRU
            System.out.println("1. Menyenangkan,");
            System.out.println("2. Bijaksana,");
            System.out.println("3. Pembawa diri tenang saat menghadapi masalah,");
            System.out.println("4. Dinamis,");
            System.out.println("5. Senang berbagi,");
            System.out.println("6. Bersahabat,");
            System.out.println("7. Tidak terlalu suka menjadi sorotan banyak "
                    + "orang,");
            System.out.println("8. Menyembunyikan perasaan karena karakternya "
                    + "yang cenderung mencari jalan damai.");
            }else{
             //UNGU
            System.out.println("1. Optimis,");
            System.out.println("2. Tidak pernah ragu");
            System.out.println("3. Menurutnya pasangan yang ideal adalah yang "
                    + "memiliki mental yang kuat,");
            System.out.println("4. Memiliki ambisi yang besar,");
            System.out.println("5. Memiliki empati yang besar,");
            System.out.println("7. Terkadang bersikap keras kepala.");
                
            }       

    
    }
}
