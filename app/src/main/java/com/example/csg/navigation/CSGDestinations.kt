package com.example.csg.navigation

/*
 * Info needed for every navigation destination.
 */
interface CSGDestination {
    val route: String
}

/*
 * Destinations
 */
object Splash: CSGDestination {
    override val route: String
        get() = "splash_screen"
}

object Home: CSGDestination {
    override val route: String
        get() = "home_screen"
}

object Login: CSGDestination {
    override val route: String
        get() = "login_screen"

}
