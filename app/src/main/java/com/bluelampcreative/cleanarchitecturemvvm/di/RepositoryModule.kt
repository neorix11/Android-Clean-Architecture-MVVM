import com.bluelampcreative.data.repositories.TestDataRepositoryImp
import com.bluelampcreative.domain.repositories.TestDataRepository
import org.koin.dsl.module.module

val repositoryModule = module {
    factory<TestDataRepository> { TestDataRepositoryImp() }
}