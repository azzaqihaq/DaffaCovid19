package com.azzaqihaq.daffacovid19.network

data class AllCountries(
    val Global: World,
    val Countries: List<Countries>
)

data class World(
    val TotalConfirmed: String = "",
    val TotalDeaths: String = "",
    val TotalRecovered: String = ""
)

data class Countries(
    val Country: String = "",
    val CountryCode: String = "",
    val NewConfirmed: String = "",
    val TotalConfirmed: String = "",
    val NewDeaths: String = "",
    val TotalDeaths: String = "",
    val NewRecovered: String = "",
    val TotalRecovered: String = "",
    val Date: String = ""
)

data class InfoCountry(
     val Confirmed: String = "",
     val Deaths: String = "",
     val Recovered: String = "",
     val Active: String = "",
     val Date: String = ""
)