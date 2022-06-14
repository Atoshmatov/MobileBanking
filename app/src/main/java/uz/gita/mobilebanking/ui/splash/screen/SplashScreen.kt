package uz.gita.mobilebanking.ui.splash.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.terrakok.modo.android.compose.ComposeScreen
import com.github.terrakok.modo.android.compose.uniqueScreenKey
import kotlinx.parcelize.Parcelize
import uz.gita.mobilebanking.R
import uz.gita.mobilebanking.ui.splash.viewmodel.SplashViewModel
import uz.gita.mobilebanking.ui.splash.viewmodel.impl.SplashViewModelImpl
import uz.gita.mobilebanking.ui.theme.MobileBankingTheme

@Parcelize
class SplashScreen(override val screenKey: String = uniqueScreenKey) :
    ComposeScreen(id = "SplashScreen") {


    @Composable
    override fun Content() {
        val viewModel: SplashViewModel = viewModel<SplashViewModelImpl>()
        SplashScreenContent()
    }
}

@Composable
fun SplashScreenContent() {
    Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
        Column(verticalArrangement = Arrangement.Center) {
            Image(
                painterResource(R.drawable.ic_splash),
                modifier = Modifier.padding(32.dp),
                contentDescription = ""
            )
            Text(
                text = "Mobile Banking",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }
    }

}

@Preview
@Composable
fun SplashScreenPreview() {
    MobileBankingTheme { SplashScreenContent() }
}