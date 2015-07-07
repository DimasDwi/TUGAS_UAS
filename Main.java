
public class Main {

    public static void main(String[] args) {

        //Liga
        Liga Indonesia = new Liga("Indonesia");
        Liga Malaysia = new Liga("Malaysia");
        Liga Singapore = new Liga("Singapore");

        //Divisi
        Divisi superA = new Divisi("Super League",Indonesia);
        Divisi utamaB = new Divisi("Divisi Utama",Indonesia);
        Divisi Mleague = new Divisi("Malay League",Malaysia);
        Divisi FAleague = new Divisi("FA League",Malaysia);
        Divisi Sleague = new Divisi("S-League",Singapore);
        Divisi Lionleague = new Divisi ("Lion League",Singapore);

        //Klub
        Klub arema = new Klub("Arema indonesia",superA,Indonesia);
        Klub persija = new Klub("Persija",superA,Indonesia);
        Klub persema = new Klub("Persema",utamaB,Indonesia);
        Klub persekam = new Klub("Persekam",utamaB,Indonesia);
        Klub selangor = new Klub("Selangor FC",Mleague,Malaysia);
        Klub kelantan = new Klub("Kelantan FC",Mleague,Malaysia);
        Klub johor = new Klub("Johor FC",FAleague,Malaysia);
        Klub kuala = new Klub("Kuala Lumpur FA",FAleague,Malaysia);
        Klub roves = new Klub("Tampines Roves",Sleague,Singapore);
        Klub guang = new Klub("Guang Zhou FC",Sleague,Singapore);
        Klub saffc = new Klub("SAFFC",Lionleague,Singapore);
        Klub besiktas = new Klub("Besiktas FC",Lionleague,Singapore);

        Indonesia.setDaftarDivisi(superA);
        Indonesia.setDaftarDivisi(utamaB);
        Malaysia.setDaftarDivisi(Mleague);
        Malaysia.setDaftarDivisi(FAleague);
        Singapore.setDaftarDivisi(Sleague);
        Singapore.setDaftarDivisi(Lionleague);

        superA.setDaftarKlub(arema);
        superA.setDaftarKlub(persija);
        utamaB.setDaftarKlub(persema);
        utamaB.setDaftarKlub(persekam);
        Mleague.setDaftarKlub(selangor);
        Mleague.setDaftarKlub(kelantan);
        FAleague.setDaftarKlub(johor);
        FAleague.setDaftarKlub(kuala);
        Sleague.setDaftarKlub(roves);
        Sleague.setDaftarKlub(guang);
        Lionleague.setDaftarKlub(saffc);
        Lionleague.setDaftarKlub(besiktas);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Yang Nomor 1 :");
        System.out.println("Divisi Liga Indonesia : ");
        Indonesia.getDaftarDivisi("Indonesia");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Yang Nomor 2 :");
        System.out.println(" ======= Klub Liga Indonesia ======= ");
        superA.getDaftarKlubLiga("Indonesia");
        System.out.println();
        System.out.println(" ======= Klub Liga Malaysia ======= ");
        Mleague.getDaftarKlubLiga("Malaysia");
        System.out.println();
        System.out.println(" ======= Klub Liga Singapore ======= ");
        Sleague.getDaftarKlubLiga("Singapore");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Yang Nomor 3 :");
        System.out.println("Super League : ");
        superA.getDaftarKlubDivisi("Super League");
        System.out.println("Divisi Utama : ");
        utamaB.getDaftarKlubDivisi("Divisi Utama");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Yang Nomor 4 :");
        selangor.getDivisi("Selangor FC");
        roves.getDivisi("Tampines Roves");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Yang Nomor 5 :");
        selangor.getLiga("Selangor FC");
    }
}

