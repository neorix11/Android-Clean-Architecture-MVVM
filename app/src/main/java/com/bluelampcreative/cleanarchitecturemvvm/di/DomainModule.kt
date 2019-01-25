import com.bluelampcreative.domain.usecases.GetTestData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import org.koin.dsl.module.module

val useCaseModule = module {
    factory { GetTestData() }
}

val coroutineModule = module {
    single("MAIN_SCOPE") { Dispatchers.Main + Job() }
}

val domainModule = listOf(useCaseModule, coroutineModule)