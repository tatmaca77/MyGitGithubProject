package Git_GitHub_Notes;

public class day02 {
    public static void main(String[] args) {
        /**
        ====> git restore --staged[dosya] --->Stage Area'daki tek bir dosyayı iptal eder, bir onceki asamaya (Working Space'e) gonderir.
        ====> git restore --staged .      --->Stage Area'daki tüm dosyaları iptal eder
        ====> git reset --hard            ---->Working space deki değişiklikleri iptal eder, staging area yı boşaltır.

         Önceki Versiyonlara Dönmek Icin
        1. Yol Checkout:
        =====>git checkout [hash] .       -----> Dosya, hashcode ile belirtilen versiyona döner.
        Eger bu islemi kalici hale getirmek istersek     git commit -m"buraya ne istersen yaz"  yapmaliyiz

         2. Yol Reset: (Bu yol sikintili kullanirken dikkatli olmak gerek)
        =====>git reset --hard [hash]     ------> Geri alınamayacak şekilde önceki versiyona dönmek icin kullaniriz

         Branch (Dal);
        **Projemizi git init komutuyla Git ile iliskilendirdigimizde Git otomatik (default) olarak bir "Master Branch" olusturur ve orada calismamiza imkan tanir.
        **Yeni yapilacak update'lerde ana projeyi korumak ve daha saglikli calisma yapabilmemiz icin yeni bir branch uzerinde calismamiz gerekir.
        Bu branch, master branch'in kopyasi uzerinde calismamiza imkan tanir. Eger update'ler ana projeye zarar vermiyorsa branch'den master branch'e geri aktarabiliriz.
        **Branch ayni zamanda farkli bireylerle birlikte calismamiza da imkan tanir. Projede calisan herkes kendi branch'ini olusturup calisabilir.

         Branch'lerin Faydalari;
         Orginal kodların güvenliği sağlanır
         Her developer kendi bölümünden sorumlu olur
         Daha hızlı geliştirme yapılır
         Daha az hata oluşur
         Sorunlar daha hızlı düzeltilir.
         Organize kod yapısı sağlanır
         Kaos olmaz

         BRANCH KOMUTLARI :
        ====>git branch [isim]          ---->Yeni branch oluşturur
         NOTE : Hangi branch 'in yaninda * varsa o aktif branch'tir.
        ====>git branch                 ---->Mevcut branch leri listeler
        ====>git checkout [isim]        ---->Branch aktif hale gelir. //Branch isim degisikligi yapmak icin de kullaniriz.
        ====>git merge [isim]           ---->İki branch i birleştirir
        ====>git branch -m [isim]       ---->Branch ismini değiştirir.
        ====>git branch –d[isim]        ---->Branch i siler ***NOTE:Kendi bindimigimiz dali kesemeyiz baska branch'te iken silmek istedigimiz branch'in ismini yazmaliyiz

         Stashing:
        ***Working space ve staging area'daki (henüz commit haline gelmemiş) değişikliklerin geçici olarak geri alınması için stashing işlemi yapılır.//Daha sonra duzenleme yapmak
        uzere gecici olarak hafizaya alinmasini saglar.
        =====>git stash                 ---->Working space ve staging area daki değişiklikleri geçici olarak hafızaya alır ve bu bölgeleri temizler.
        =====>git stash list            ---->Hafızaya alınan değişiklikleri görmek için kullanılır.
        =====>git stash pop             ---->Hafızaya alınan değişiklikleri geri uygulamak için kullanılır.
         */
    }
}
