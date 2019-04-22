import com.bluelampcreative.cleanarchitecturemvvm.views.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel { MainActivityViewModel(get()) }
}

val appModule = listOf(uiModule)