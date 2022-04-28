package com.evolve.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository

//    @Provides
//    fun getSQLRepository() : UserRepository
//    {
//        return SQLRepository()
//    }
}