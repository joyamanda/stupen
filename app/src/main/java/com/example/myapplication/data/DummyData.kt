package com.example.myapplication.data

import com.example.myapplication.R
import com.example.myapplication.model.About
import com.example.myapplication.model.Gallery
import com.example.myapplication.model.Pesan
import com.example.myapplication.model.Member
import com.example.myapplication.model.Convo

object DummyData {
    val mobileMembers = listOf(
        Member(
            id = 1,
            name = "Choi SeungCheol",
            nickname = "S.Coups",
            unit = "HipHop Unit",
            photo = R.drawable.scoups
        ),
        Member(
            id = 2,
            name = "Yoon JeongHan",
            nickname = "Jeonghan",
            unit = "Vocal Unit",
            photo = R.drawable.jeonghan
        ),
        Member(
            id = 3,
            name = "Hong JiSoo",
            nickname = "Joshua",
            unit = "Vocal Unit",
            photo = R.drawable.joshua
        ),
        Member(
            id = 4,
            name = "Moon JunHui",
            nickname = "Jun",
            unit = "Performance Unit",
            photo = R.drawable.jun
        ),
        Member(
            id = 5,
            name = "Kwon SoonYoung",
            nickname = "Hoshi",
            unit = "Performance Unit",
            photo = R.drawable.hoshi
        )
        ,
        Member(
            id = 6,
            name = "Jeon WonWoo",
            nickname = "WonWoo",
            unit = "HipHop Unit",
            photo = R.drawable.wonwoo
        ),
        Member(
            id = 7,
            name = "Lee JiHoon",
            nickname = "Woozi",
            unit = "Vocal Unit",
            photo = R.drawable.uji
        ),
        Member(
            id = 8,
            name = "Seo MyungHo",
            nickname = "The8",
            unit = "Performance Unit",
            photo = R.drawable.eisa
        ),
        Member(
            id = 9,
            name = "Kim Mingyu",
            nickname = "Mingyu",
            unit = "HipHop Unit",
            photo = R.drawable.mingyu
        ),
        Member(
            id = 10,
            name = "Lee SeokMin",
            nickname = "Dokyeom",
            unit = "Vocal Unit",
            photo = R.drawable.dokyeom
        ),
        Member(
            id = 11,
            name = "Chwe Hansol",
            nickname = "Vernon",
            unit = "HipHop Unit",
            photo = R.drawable.vernon
        ),
        Member(
            id = 12,
            name = "Boo SeungKwan",
            nickname = "SeungKwan",
            unit = "Vocal Unit",
            photo = R.drawable.seungkwan
        ),
        Member(
            id = 13,
            name = "Lee Chan",
            nickname = "Dino",
            unit = "Performance Unit",
            photo = R.drawable.dino
        )
    )

    val mobilePesans = listOf(
        Pesan(
            id = 1,
            name = "Mingoo ❤️",
            photo = R.drawable.mingyu,
            detail = "otw yaa",

        ),
        Pesan(
            id = 2,
            name = "Kak Hannie 😇",
            photo = R.drawable.jeonghan,
            detail = "nanti kita jalan-jalan kesana ya",

        ),
        Pesan(
            id = 3,
            name = "Kak Wonwooku ❤️❤️❤️",
            photo = R.drawable.wonwoo,
            detail = "mau main game apa malam ini?",

        ),
        Pesan(
            id = 4,
            name = "Kak Coupse 💸💗",
            photo = R.drawable.seungcheol,
            detail = "udah kaka transfer ya deek ❤️",

        ),
        Pesan(
            id = 5,
            name = "Bang DK 😻",
            photo = R.drawable.dokyeom,
            detail = "iya cintaaa",

        ),
        Pesan(
            id = 6,
            name = "Kak Josh 🪽",
            photo = R.drawable.joshua,
            detail = "besok kita gereja bareng yuk",

        ),
        Pesan(
            id = 7,
            name = "Hoshi 🐯",
            photo = R.drawable.hoshi,
            detail = "Horanghaeeeee 🐯🐯❤️❤️",

        ),
        Pesan(
            id = 8,
            name = "Bang Uji",
            photo = R.drawable.uji,
            detail = "Sini ke studio abang aja",

        ),
        Pesan(
            id = 9,
            name = "Kwannie 🍊",
            photo = R.drawable.seungkwan,
            detail = "lagi dimana?",

        ),
        Pesan(
            id = 10,
            name = "Bononiee 🐻‍❄️",
            photo = R.drawable.vernon,
            detail = "liat aku sama ikan ini deh",

        ),
        Pesan(
            id = 11,
            name = "Ichan 🦦",
            photo = R.drawable.dino,
            detail = "Mainn kesinii yuuu",

        ),
        Pesan(
            id = 12,
            name = "Kak Eisa 🦦",
            photo = R.drawable.eisa,
            detail = "Dek kamu udh makan belum?",

        ),
        Pesan(
            id = 13,
            name = "Kak Junnnie 🦦",
            photo = R.drawable.jun,
            detail = "nanti kaka beliin deh janji",
            )


    )

    val listConvo = listOf(
        Convo(
            pesanId = 1,
            id = 1,
            name = "Mingoo ❤️",
            photo = R.drawable.mingyu,
            detail = "Oii",
            ),
        Convo(
            pesanId = 1,
            id = 11,
            name = "Mingoo ❤️",
            photo = R.drawable.mingyu,
            detail = "tidur?",
        ),
        Convo(
            pesanId = 1,
            id = 2,
            name = "Me",
            photo = R.drawable.no_profile,
            detail = "kenapa kaa??",
            ),
        Convo(
            pesanId = 1,
            id = 3,
            name = "Mingoo ❤️",
            photo = R.drawable.mingyu,
            detail = "lagi ngapainn?",
        ),
        Convo(
            pesanId = 1,
            id = 33,
            name = "Mingoo ❤️",
            photo = R.drawable.mingyu,
            detail = "main yuu",
        ),
        Convo(
            pesanId = 1,
            id = 4,
            name = "Me",
            photo = R.drawable.no_profile,
            detail = "mauu",
        ),
        Convo(
            pesanId = 1,
            id = 44,
            name = "Me",
            photo = R.drawable.no_profile,
            detail = "jemput akuuu",
        ),
        Convo(
            pesanId = 1,
            id = 5,
            name = "Mingoo ❤️",
            photo = R.drawable.mingyu,
            detail = "otw yaa",
        ),
        Convo(
            pesanId = 2,
            id = 2,
            name = "Me",
            photo = R.drawable.no_profile,
            detail = "lagi ngapain ka?",
        ),
        Convo(
            pesanId = 2,
            id = 1,
            name = "Kak Hannie 😇",
            photo = R.drawable.jeonghan,
            detail = "lagi ngerjain proyek, kenapa??",
        ),
        Convo(
            pesanId = 2,
            id = 4 ,
            name = "Me",
            photo = R.drawable.no_profile,
            detail = "sibuk ya?",
        ),
        Convo(
            pesanId = 2,
            id = 3,
            name = "Kak Hannie 😇",
            photo = R.drawable.jeonghan,
            detail = "buat kamu ngga kok",
        ),
        Convo(
            pesanId = 2,
            id = 6,
            name = "Me",
            photo = R.drawable.no_profile,
            detail = "kaa aku mau ke pantai deh",
        ),
        Convo(
            pesanId = 2,
            id = 5,
            name = "Kak Hannie 😇",
            photo = R.drawable.jeonghan,
            detail = "kenapa tiba-tiba pantai?",
        ),
        Convo(
            pesanId = 2,
            id = 8,
            name = "Me",
            photo = R.drawable.no_profile,
            detail = "kmrn aku liat pantai cantik bgt",
        ),
        Convo(
            pesanId = 2,
            id = 10,
            name = "Me",
            photo = R.drawable.no_profile,
            detail = "mau jalan-jalan juga sama kaka",
        ),
        Convo(
            pesanId = 2,
            id = 7,
            name = "Kak Hannie 😇",
            photo = R.drawable.jeonghan,
            detail = "nanti kita jalan-jalan kesana ya",
        ),

    )

    val aboutMe = listOf(
        About(
            id = 1,
            name = "Joya Ruth Amanda Pane",
            photo = R.drawable.joy_poto,
            email = "jaya.ra.pane@gmail.com",
            uni = "Universitas Indonesia",
            major = "Ilmu Komputer",

        )
    )

    val infiniteGalleries = listOf(
        Gallery(
            id = 1,
            name = "Mingyu Julid",
            photo = R.drawable.mingyu_julid,
            detail = "",
        ),
        Gallery(
            id = 2,
            name = "Seungcheol Pasang Lap Makan",
            photo = R.drawable.seungcheol_lap,
            detail = "",
        ),
        Gallery(
            id = 3,
            name = "Jeonghan Ketawa Makan",
            photo = R.drawable.han_makan,
            detail = "",
        ),
        Gallery(
            id = 4,
            name = "Wonwoo Kamera",
            photo = R.drawable.wonwoo_kamera,
            detail = "",
        ),
        Gallery(
            id = 5,
            name = "Dokyoem Suap Makan",
            photo = R.drawable.dokyeom_suap,
            detail = "",
        ),
        Gallery(
            id = 6,
            name = "Woozi Studio",
            photo = R.drawable.woozi_studio,
            detail = "",
        ),
        Gallery(
            id = 7,
            name = "Vernon Makan",
            photo = R.drawable.vernon_makan,
            detail = "",
        ),
        Gallery(
            id = 8,
            name = "Mingyu Lucu (?)",
            photo = R.drawable.mingyu_kenapa,
            detail = "",
        ),
        Gallery(
            id = 9,
            name = "Seungcheol Marah",
            photo = R.drawable.seungcheol_marah,
            detail = "",
        ),
        Gallery(
            id = 10,
            name = "Vernon Angle",
            photo = R.drawable.vernon_angel,
            detail = "",
        ),
        Gallery(
            id = 11,
            name = "Wonwoo Dapur",
            photo = R.drawable.wonwoo_dapur,
            detail = "",
        ),
    )
}