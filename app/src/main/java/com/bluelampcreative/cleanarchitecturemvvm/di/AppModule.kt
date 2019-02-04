import com.bluelampcreative.cleanarchitecturemvvm.views.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel { MainActivityViewModel(get(), get("MAIN_SCOPE")) }
}

val appModule = listOf(uiModule)