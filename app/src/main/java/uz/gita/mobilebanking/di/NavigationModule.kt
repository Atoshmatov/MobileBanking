package uz.gita.mobilebanking.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.mobilebanking.navigation.AppNavigation
import uz.gita.mobilebanking.ui.splash.screen.SplashScreenDirection
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NavigationModule {

    @[Provides Singleton]
    fun provideSplashScreenDirection(appNavigation: AppNavigation): SplashScreenDirection =
        appNavigation.splashDirection
}