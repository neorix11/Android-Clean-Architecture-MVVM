import org.koin.dsl.module

val awsSdkModule = module {
    //for those using aws services
}

val retrofitModule = module {
    //for those who are not
}

val networkModule = listOf(awsSdkModule, retrofitModule)