package standardlib9

data class Album(val title: String, val year: Int, val chartUK: Int, val chartUS: Int, val tracks: List<Track> = listOf())

data class Track(val title: String, val durationInSeconds: Int)

val albums = listOf(
        Album("The Dark Side of the Moon", 1973, 2, 1,
                listOf(Track("Speak to Me", 90),
                        Track("Breathe", 163),
                        Track("On he Run", 216),
                        Track("Time", 421),
                        Track("The Great Gig in the Sky", 276),
                        Track("Money", 382),
                        Track("Us and Them", 462),
                        Track("Any Color You Like", 205),
                        Track("Brain Damage", 228),
                        Track("Eclipse", 123)
                )),
        Album("The Wall", 1979, 3, 1),
        Album("Wish You Were Here", 1975, 1, 1),
        Album("Animals", 1977, 2, 3),
        Album("The Piper at the Gates of Dawn", 1967, 6, 131),
        Album("The Final Cut", 1983, 1, 6),
        Album("Meddle", 1971, 3, 70),
        Album("Atom Heart Mother", 1970, 1, 55),
        Album("Ummagumma", 1969, 5, 74),
        Album("A Sauceful of Secrets", 1968, 9, 0),
        Album("More", 1969, 9, 153))



fun albumAndTrackLowerThenXSeconds(durationInSeconds: Int , albums: List<Album> ) : List<Pair<String,String>>? {

//    return albums.flatMap {  }

    return null

}

fun main(args: Array<String>) {

    //Find all albums that were number 1 in the UK

    // albums.forEach { a -> if (a.chartUK == 1) println("Found ${a.title}") }

//use the parameter as it
    albums.forEach { if (it.chartUK == 1) println("Found ${it.title}") }

    val albums1 = albums.filter { it.chartUK == 1 }
    albums1.forEach { println(it.title) }

    //Method pipelining
    albums
            .filter { it.chartUK == 1 }
            .forEach { println(it.title) }

    //Return the actual title of the album

    val mappedList = albums
            .filter { it.chartUK == 1 }
            .map { it.title }


    println("Mapped list $mappedList")







}