package com.hevadevelop.simpleandroid.model

object SuperheroData {

    private val data = arrayOf(
        arrayOf(
            "1",
            "Superman",
            "https://upload.wikimedia.org/wikipedia/id/7/72/Superman.jpg",
            "Jerry Siegel, Joe Shuster",
            "Pahlawan Superfiksi yang muncul dalam buku komik Amerika yang diterbitkan oleh DC Comics. Superman secara luas telah dianggap sebagai ikon budaya yang melambangkan kekuatan budaya Amerika Serikat.",
            "DC Comics"
        ),
        arrayOf(
            "2",
            "Shazam",
            "https://superbromovies.files.wordpress.com/2018/02/drawn-wars-justice-league-war-3.jpg",
            "C. C. Beck, Bill Parker",
            "superhero fiksi yang muncul dalam publikasi oleh penerbit Amerika DC Comics. Artis C. C. Beck dan penulis Bill Parker menciptakan karakter pada tahun 1939. Kapten Marvel pertama kali muncul di Whiz Comics # 2, yang diterbitkan oleh Fawcett Comics.",
            "DC Comics"
        ),
        arrayOf(
            "3",
            "Batman",
            "https://upload.wikimedia.org/wikipedia/id/4/40/Batmanlee.png",
            "Bob Kane, Bill Finger",
            "Identitas rahasia Batman adalah Bruce Wayne, playboy Amerika yang kaya, dermawan, dan pemilik Wayne Enterprises. Setelah menyaksikan pembunuhan orang tuanya, Dr. Thomas Wayne dan Martha Wayne ketika masih anak-anak, ia bersumpah membalas dendam terhadap para penjahat, sebuah sumpah yang digerakkan oleh rasa keadilan. Bruce Wayne melatih dirinya sendiri secara fisik dan intelektual dan menciptakan kepribadian yang terinspirasi kelelawar untuk memerangi kejahatan.",
            "DC Comics"
        ),
        arrayOf(
            "4",
            "Ironman",
            "https://cdn.idntimes.com/content-images/community/2019/05/iron-man-header-f99ad485400903a231ee96da6ca7c5b3_600x400.jpg",
            "Stan Lee, Larry Lieber, Don Heck, Jack Kirby",
            "Iron Man adalah pahlawan super fiksi yang muncul dalam buku komik Amerika yang diterbitkan oleh Marvel Comics, serta media yang terkait. Karakter diciptakan oleh penulis dan editor Stan Lee, yang dikembangkan oleh penulis skenario Larry Lieber, dan dirancang oleh seniman Don Heck dan Jack Kirby.",
            "Marvel Comics"
        ),
        arrayOf(
            "5",
            "Spiderman",
            "https://upload.wikimedia.org/wikipedia/id/7/74/Spider-Man547.jpg",
            "Stan Lee, Steve Ditko",
            "Spider-Man, adalah pahlawan super fiktif dari Marvel Comics yang diciptakan oleh penulis Stan Lee dan artis Steve Ditko. Ia pertama muncul dalam Amazing Fantasy #15. Ia telah menjadi salah satu pahlawan super yang paling terkenal di dunia.",
            "Marvel Comics"
        ),
        arrayOf(
            "6",
            "Flash",
            "https://upload.wikimedia.org/wikipedia/en/e/ed/The_Flash_Family.jpg",
            "Gardner Fox, Harry Lampert",
            "The Flash adalah nama beberapa pahlawan super yang muncul dalam buku komik yang diterbitkan oleh DC Comics. Dibuat oleh penulis Gardner Fox dan artis Harry Lampert, Flash asli pertama kali muncul di Flash Comics #1",
            "DC Comics"
        ),
        arrayOf(
            "7",
            "Aquaman",
            "https://img.timesnownews.com/story/1544702069-Jason_Momoa_Aquaman.jpg",
            "Mort Weisinger, Paul Norris",
            "Aquaman adalah pahlawan super yang muncul dalam buku komik Amerika yang diterbitkan oleh DC Comics. Dibuat oleh Paul Norris dan Mort Weisinger, karakter ini memulai debutnya di More Fun Comics #73",
            "DC Comics"
        ),
        arrayOf(
            "8",
            "Green Lantern",
            "https://upload.wikimedia.org/wikipedia/en/thumb/8/80/Green_Lantern_Rebirth_6.jpg/220px-Green_Lantern_Rebirth_6.jpg",
            "Gil Kane, Martin Nodell, Bill Finger, John Broome",
            "Green Lantern adalah seri buku komik Amerika yang sedang berlangsung yang menampilkan para pahlawan DC Comics dengan nama yang sama. Inkarnasi pertama karakter itu, Alan Scott, muncul di All-American Comics # 16, dan kemudian diputar ke dalam volume pertama Green Lantern pada tahun 1941.",
            "DC Comics"
        ),
        arrayOf(
            "9",
            "Wonder Woman",
            "https://images-na.ssl-images-amazon.com/images/I/81ugxFdBZBL._SY445_.jpg",
            "William Moulton Marston, H. G. Peter",
            "Wonder Woman adalah karakter perempuan superhero fiktif yang muncul di buku komik Amerika Serikat yang diterbitkan oleh DC Comics. Karakter ini adalah putri pejuang dari bangsa Amazon dan dikenal di tanah airnya, Themyscira, sebagai Putri Diana dari Themyscira.",
            "DC Comics"
        ),
        arrayOf(
            "10",
            "Black Panther",
            "https://upload.wikimedia.org/wikipedia/id/b/b8/Black_Panther_%28Marvel_Comics%29.jpg",
            "Stan Lee, Jack Kirby",
            "Black Panther adalah seorang pahlawan super fiksi yang muncul di buku komik Amerika yang diterbitkan oleh Marvel Comics. Dibuat oleh editor penulis Stan Lee dan penciller dan co-plotter Jack Kirby, ia pertama kali muncul di Fantastic Four #52",
            "Marvel Comics"
        )
    )

    val listData: ArrayList<Superhero>
        get() {
            val list = arrayListOf<Superhero>()
            for (aData in data) {
                val superhero = Superhero()
                superhero.id = aData[0]
                superhero.name = aData[1]
                superhero.photo = aData[2]
                superhero.creator = aData[3]
                superhero.simple_description = aData[4]
                superhero.publisher = aData[5]

                list.add(superhero)
            }
            return list
        }
}