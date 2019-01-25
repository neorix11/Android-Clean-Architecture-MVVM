import org.koin.dsl.module.module

val useCaseModule = module {

}

val coroutineModule = module {

}

val domainModule = listOf(useCaseModule, coroutineModule)