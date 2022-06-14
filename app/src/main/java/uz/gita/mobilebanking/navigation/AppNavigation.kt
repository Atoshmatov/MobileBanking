package uz.gita.mobilebanking.navigation

import com.github.terrakok.modo.Modo
import com.github.terrakok.modo.replace
import uz.gita.mobilebanking.ui.splash.screen.SplashScreenDirection
import javax.inject.Inject

class AppNavigation @Inject constructor(
    private val modo: Modo,
    private val graph: AppGraph
) {

    val splashDirection = object : SplashScreenDirection {
        override fun navigateToLanguageScreen() {
            modo.replace(graph.splashScreen())
        }
    }
}