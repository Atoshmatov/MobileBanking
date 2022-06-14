package uz.gita.mobilebanking.ui.splash.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.mobilebanking.ui.splash.screen.SplashScreenDirection
import uz.gita.mobilebanking.ui.splash.viewmodel.SplashViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModelImpl @Inject constructor(
    private val splashScreenDirection: SplashScreenDirection
) : ViewModel(), SplashViewModel {

    init {
        viewModelScope.launch {
            delay(2000)
            splashScreenDirection.navigateToLanguageScreen()
        }
    }
}