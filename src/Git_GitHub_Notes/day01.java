package Git_GitHub_Notes;

public class day01 {
    public static void main(String[] args){
        /**    **** Git - Github nedir? ****
    Git versiyon kontrol sistemi iken,  Github bu sistemi kullanan depolama servisleri denilebilir.

         1-Yazilim-uygulama gelistirme devam eden bir surectir. Tek seferde oldu bitti diyemeyiz.
    Tamamlandiktan sonra bile guncelleme-bakim ihtiyaci olabilir. Uygulamanin guncellemedeki herbir asamasina versiyon denilir.
    Versiyonlarin kontrol ve takibini "Git" ile yapariz.

         2-Versiyon kontrolunu yaptigimiz projemizi bulut sisteminde de depolamak istersek de "Github" kullaniriz.
    Performans olarak daha hizli oldugu icin genellikle  "Github" kullanilir lakin bunlarin haricinde de depolama servisleri mevcuttur.

        **** VCS nedir? ****
    Uzun bir surec icerisinde yapilmasi gereken projelerde bir sure calistiktan sonra, daha sonra uzerinde calismak uzere kaydetmek gerekebilir.
    Farkli kaydederek ilerleyebiliriz. Orn: Odev1-Odev2-Odev3... yerine herbir guncellemede tarih atarak ilerlemek daha derli toplu bir calisma olmasina olanak saglar.
    Projenin tarihcesini gelisim sistemini gorebilmek icin "VCS"(Versiyon Control System) kullanabiliriz.
    -Zaman icerisinde yapilan degisiklikleri kontrol etmemize imkan tanir.
    -Proje uzerinde en son degisiklik yapanin da tespitini saglar.

     **** 3 tip VCS vardir. ****
         -Yerel(Local)      -Merkezi(Central)    -Dagitik(Distributed)

   1) Local VCS --> Local pc de versiyonlari olusturup, kontrol etmemizi saglar. Lakin ortak calismaya imkan tanimaz.
    Herkesin kendi bilgisayarindadir.

   2) Central VCS --> Cloud sistemde olusturulan projelerde herkes farkli pc lerden sunucuya baglanarak proje uzerindeki gelistirmelerini yaparlar.
    Lakin uzaktan baglantida elektrik kesildiginde veya sunucu coktugunde server'lara baglanma sorunu yasayabiliriz.
    Tek bir ornek cloud da oldugu icin gelistirme durur.

   3) Distributed VCS --> Hem yerel hem de merkezi VCS ozelliklerini barindirir. Offline olarak calismaya imkan saglar.
    Cloud daki sunucuda proje olusturulur ve gelisitirici kendi bilgisayari
    uzerine klon eder ve gelistirmelerini local de yaptiktan sonra tekrar cloud'a gonderir.
    Birden fazla yerde depolama imkani oldugu icin birinin basina bir is gelse bile digerinde copy edip calismaya devam edilebilir.

   ***git(Locale)                                           ****GitHub (Remote)
   -Lokalde versiyon yonetimi yapmak                        -Yedekleme (backup)
   -Offline calisabilmek                                    -Proje paylasimi(share)
   -Hatalari geri alabilmek                                 -Proje yayinlama (deploy)
   -Versiyonlar arasinda gecis yapabilme                    -Ortak calisma imkani(collaboration)

    -Git configuration
    a) git config --global user.name"Ali Gel"
    b) git config --global user.email"ali@gel.com"   ---> Repoda calisanlar bu isim ve e postayi gorur
    buradaki bilgiler "key=value" seklinde saklanir.
    c) git config --global color.ui true   ----> Terminalde komutlarin renklendirilmesini saglar

    **"System" parametresi kullanildiginda tum kullanici ve tum repolari etkiler
    **"Global" parametresi kullanicinin tum repolar uzerinde etkili olur
    **"Local" parametresi sadece gecerli repo uzerinde etkili olur

    d) git config -list yapilan degisikliklerin goruntulenmesini saglar
    e) git config -l  bu da  "git config -list" in kisayolu

    -----Repository (Repo)
    Olusturdugumuz herbir projeyi VCS'ye tabi tutmak ve depolamak icin olusturdugumuz alan. Kisaca repo denir.

    ----- git init ------
    Local bilgisayarımızda bir projeyi versiyon sistemine alabilmek için "git init" komutu kullanılır.
    Bu komut kullanılınca proje klasöründe ".git" klasörü oluşturulur. Bu, local repomuzu saklayacaktır.

    ***Working Space(Calisma Alani)
    .git klasorunun bulundugu calisma alani. Klasorler ve dosyalar uzerinden degisiklikler burada yapilir.

    ***Staging Area (Gecici Toplanma Alani) - (Araf) - (Bekleme Salonu)
    Versiyon olusturulacak olan dosya ve klasorlerin gecici olarak toplandigi yer. Version (commit) olusturulduktan sonra otomatik olarak stagigng area bosaltilir.

    ***Commit Store (Local Repo)
    Git her bir commit i ayri bir version olarak tutar. Boylece yapilan degisikliklerden sonra bir sorun ortaya cikmasi halinde bir onceki commit e geri donulebilir.

    Bu alanlar arasinda gecis yapmak icin;
    1-Working Sapace -- "git add(Eklemek istedigimiz dosya)"  VEYA "git add ." ==> Staging Area'ya alinmasini saglar
    2-Staging Area -- "git commit -m"buraya istediginizi yazin"    ===> commitledik
    3-Commit Store

    KOMUTLAR:

    ANA KOMUTLAR:
    ====>git init Localde repo olusturmak icin SADECE 1 KEZ kullanilir.Projeyi gir ile iliskilendirmeye yarar
    ===>git add(Eklemek istedigimiz dosya ve uzantisi) komutu yapilan degisiklikleri staging area'ya alir.
    ===>git add . komutu tum degisiklikleri staging area'ya alir
    ===>git commit -m"version metni"   version olusturur.

    YARDIMCI KOMUTLAR
    ===> "git status" ->Working Space ve Staging Area'daki projenin durumunu goruntulemek icin kullanilan komut.
    (Genel durum ile ilgili bilgi verir)
    ****Her bir degisiklik yaptigimizda git add komutunu kullaniriz. Degisiklikten sonra bu komutu kullanmazsak "untracked" olarak gorunur.

    ===> "git commit -am"" : add+commit birlikte kullaniriz.Ancak bu komut dosya icin en az bir kez git add kullanildiktan sonra calisir.
    NOTE: git commit -am"buraya istediginiz mesaji yazin"  bu komut ile  ===> bu komutta git add .  ve git commit -m"buraya istediginiz mesaji yazin" birlikte kullanilmis olur.

    ===> "git log"         ---> simdiye kadar yapilan tum degisiklikleri, kimin ne zaman yaptigini ve olusturulan commitlerin Hashcode'larini gosterir.
    (Versiyonların listesini verir)

    ===>git commit --ament -m"buraya istediginizi yazin"    ---> bu komut sadece en son olusturulan commit ismini degistirir

    ===>git log --oneline       ===> Ihtiyac halinde kullandigimizda commitlerin Hash Code'larin ilk 7 karakterini verir
    NOTE: Bir repo icinde birden fazla commit olabilir. Son commit HEAD olarak gosterilir

    ====>git show       --->git show [Hash kodun ilk 7 karakteri] yapilan tum degisiklikleri en detayli haliyle gorebiliriz.
    (Versiyondaki değişiklikleri gösterir )

    ====>git restore[dosya]         --->Dosya Working Space'de iken bu dosyadaki son degisikligi iptal eder.

    ====>git restore.           ---> Dosya Working Space'de iken en son yapilan tum degisiklikleri iptal eder.(Bu tehlikeli bir komuttur kullanmadan once iyi dusunmeli)
     */
    }

}
