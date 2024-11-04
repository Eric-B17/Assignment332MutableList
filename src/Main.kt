fun main () {
    val gameCharacters = mutableListOf(
        "Mario",
        "Sonic",
        "Pac-Man",
        "Mega Man",
        "Cloud Strife",
        "Master Chief",
        "Doom Guy",
        "Kratos",
        "Ray Man",
        "Crash Bandicoot",
        "Link",
        "Mewtwo",
        "Sora"
    )

    gameCharacters.add("Steve");
    gameCharacters[11] = "Ryu";
    gameCharacters.remove("Mewtwo")
    println(gameCharacters)


}
