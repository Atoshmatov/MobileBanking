package uz.gita.mobilebanking.ui.account.language.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.terrakok.modo.android.compose.ComposeScreen
import com.github.terrakok.modo.android.compose.uniqueScreenKey
import kotlinx.parcelize.Parcelize
import uz.gita.mobilebanking.ui.account.language.viewmodel.LanguageViewModel
import uz.gita.mobilebanking.ui.account.language.viewmodel.impl.LanguageViewModelImpl
import uz.gita.mobilebanking.ui.theme.MobileBankingTheme

@Parcelize
class LanguageScreen(override val screenKey: String = uniqueScreenKey) :
    ComposeScreen(id = "LanguageScreen") {

    @Composable
    override fun Content() {
        val viewModel: LanguageViewModel = viewModel<LanguageViewModelImpl>()
        LanguageScreenContent()
    }
}

@Composable
fun LanguageScreenContent() {
    Surface(modifier = Modifier.fillMaxSize()) {
        ConstraintLayout {
            val (text, column) = createRefs()
        }
    }
}

@Preview
@Composable
fun LanguageScreenPreview() {
    MobileBankingTheme { LanguageScreenContent() }
}