package tidbits6

import classes3.CustomerKotlin


fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 230000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("USA", "NewYork", 4556);
}

fun main(args: Array<String>) {
    val result = capitalAndPopulation("Spain")
    println(result.first)
    println(result.second)

    // Look at the above code, what the hell is first and second ? I can't know without looking at capitalAndPopulation method
    // This restores the information that Pair and Triple are taking away
    val (capital, population) = capitalAndPopulation("Spain")
    println(capital)
    println(population)


    val customerKotlin = CustomerKotlin(1, "Vinoth", "abc@gmail.com")

    val (id, name, email) = CustomerKotlin(1, "Vinoth", "abc@gmail.com")


    val listOfCapitalAndCountries = listOf(Pair("Madrid", "Spain"), "New York" to "USA")

    for ((capital1, country) in listOfCapitalAndCountries) {
        println(capital1)
        println(country)
    }
}