import com.bluelampcreative.cleanarchitecturemvvm.views.MainActivityViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val uiModule = module {
        viewModel { MainActivityViewModel(get(), get("MAIN_SCOPE")) }
}

val appModule = listOf(uiModule)