package com.hasangunduz.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("merhaba kotlin")
        println(5 * 5)

        //Değişken ve sabitler

        //Integer
        println("---------------int---------")
        var a = 5
        var b = 10
        println(a * b)

        var yas = 50;
        println(yas / 5 * 10)

        yas = 60;
        println(yas / 2)

        val x = 100
        val y = 20
        println(x + y)

        println(yas * y)

        //camelCae
        //snake_case

        val yasSonucu = yas * y
        println(yasSonucu)


        //Tanımlama (variable Defining)
        val benimIntegerim: Int

        //Başlatma , Degerini atama (Initializing, Initialization)
        benimIntegerim = 5

        var yeniInteger: Int = 10

        println(benimIntegerim / 2) //sonuc 2 gelir cünkü tam sayı kısmını alır ,5 i almaz.


        //Long
        println("---------------Long---------")

        var benimLong: Long = 100
        benimLong = 3000000000
        println(benimLong)

        //Double & Float
        println("---------------Double & Float---------")

        var pi = 3.14
        println(pi * 2)

        val floatPi: Float = 3.14f //float olduğunu belirtmek icin sonuna f koymak gerekli

        val yeniDouble = 5.0
        println(yeniDouble / 2)


        //String
        println("---------------String---------")

        val benimString = "benim yeni metin."

        println(benimString.length)
        println(benimString)

        //Veri Tip Dönüştürme
        println("---------------Donusturme---------")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)


        var kullaniciGirdisi = "50"

        var kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)


        //Koleksiyonlar

        //Array - dizi

        println("-----------------Dizi-----------------")
        //btyeArrayOf --> bytelar dizisi olustur.

        val stringOrnegi = "software developer"
        val benimDizim = arrayOf(stringOrnegi, "Hasan", "Gündüz", "Kalender")

        //index

        println(benimDizim[0])
        println(benimDizim.get(0))

        benimDizim[2] = "Gunduz"
        println(benimDizim[2])


        //getter alıcı
        //setter değiştirici
        benimDizim.set(2, "gunduzler")
        println(benimDizim.get(2))

        val numaraDizisi = doubleArrayOf(1.0, 2.9, 3.5)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Hasan", 1.85, 26, true, false)
        println(" sonuclar " + karisikDizi.get(3) + "  " + karisikDizi.get(1))

        //ArrayList - Listeler
        println("-----------------ArayList-----------------")

        val isimListesi = arrayListOf("hasan", "kemal", "ali")
        println(isimListesi[1])
        println(isimListesi.get(0))

        isimListesi.add("veli")
        isimListesi.add("kamil")
        println(isimListesi.get(4))


        val karisikArrayList =
            arrayListOf<Any>()  //bu Any herhangi bir sınıftan bir veri tipi verebilirsin , object gibi.
        karisikArrayList.add(1.2)
        karisikArrayList.add("hasan")
        karisikArrayList.add(5)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(2)
        intArrayList.add(5)
        println(intArrayList.get(1))

        //set
        println("-----------------Set-----------------")

        val ornekDizi = arrayOf(
            7,
            8,
            9,
            9,
            9,
            9,
            9,
            10
        )  // dizide bir sürü duplication olur ama sette olmaz her bir elemeandan tek olur.
        println("index 2: ${ornekDizi[2]}")
        println("index 2: ${ornekDizi[3]}")


        val benimSet = setOf<Int>(7, 8, 9, 9, 9, 8, 10)
        println(benimSet.size)

        //For each

        benimSet.forEach {
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Hasan")
        digerSet.add("Hasan")
        digerSet.add("Hasan")
        digerSet.add("Gunduz")

        digerSet.forEach { println(it) }


        //Map
        println("-----------------Map-----------------")

        //Anahter Kelime - Değer (Key-Value Pairing)

        val yemekDizisi = arrayOf("Elma", "Et", "Tavuk")
        val kaloriDizisi = arrayOf("100", "203", "700")

        println("${yemekDizisi[0]}'nın kalorisi : ${kaloriDizisi[0]}") //böyle kullanmak zor

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("Elma", 100)
        yemekKaloriMap.put("Et", 203)
        yemekKaloriMap.put("Tavuk", 700)
        println(yemekKaloriMap.get("Et"))


        val benimMapim = HashMap<String, String>()
        benimMapim.put("örnek", "Değer")

        val yeniMap = hashMapOf<String, Int>("Hasan" to 26, "Örnek" to 100)  // to : hasan a 26
        println(yeniMap.get("Örnek"))


        //Remainder - kalanı bulmak

        println(10 % 2) // 10 u 2 ye böl kalan 0
        println(11 % 3) // 11 i 3 e bölersek kalan 2 olacaktır.


        //İf Statement
        println("-----------------if statement (eğer kontrolleri-----------------")

        val skor = 45

        if (skor < 10) {
            println("Oyunu kaybettin!")
        } else if (skor >= 10 && skor < 20) {
            println("Skorun 10 ile 20 arasında , çok iyi skor aldın.")
        } else if (skor >= 20 && skor < 30) {
            println("Skorun 20 30 arasında , rekorlar kırıyorsun!")
        } else {
            println("skorun 30 'un üstünde efsane oynadın.")
        }

        //When - switch
        println("-----------------When-----------------")


        var notRakami = 3
        var notStringi = ""

        when (notRakami) {
            0 -> notStringi = "Geçersiz not"
            1 -> notStringi = "Zayıf"
            2 -> notStringi = "Kötü"
            3 -> notStringi = "Orta"
            4 -> notStringi = "İyi"
            else -> notStringi = "Pek iyi"
        }
        println(notStringi)

/*
*** yukarıda bunun basite indergenmis halini when ile yaptık..
  if(notRakami==0){
            notStringi = "Geçersiz Not"
        }
        else if (notRakami == 1 ){
            notStringi = "Zayıf"
        }
        else if (notRakami == 2 ){
            notStringi = "Kötü"
        }
        else if (notRakami == 3 ){
            notStringi = "Orta"

        }
        else if (notRakami == 4 ){
            notStringi = "İyi"
        }
        else {
            notStringi = "Pek iyi"
        }
 */

        //While
        println("-----------------While-----------------")

        var j = 0;

        while(j<10){
            println(j)
            j+=1;

        }


    }


}