import org.koin.dsl.module.module

val roomDBModule = module {

}

val localDataSourceModule = module {

}

val localStorageModule = listOf(roomDBModule, localDataSourceModule)