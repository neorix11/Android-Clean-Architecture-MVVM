import org.koin.dsl.module

val roomDBModule = module {

}

val localDataSourceModule = module {

}

val localStorageModule = listOf(roomDBModule, localDataSourceModule)