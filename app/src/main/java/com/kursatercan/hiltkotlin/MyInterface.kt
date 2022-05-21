package com.kursatercan.hiltkotlin

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String
}

/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{

    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor : MyInterfaceImpl) : MyInterface
}

 */

@InstallIn(SingletonComponent::class)
@Module
class MyModule{
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface{
        return MyInterfaceImpl()
    }
    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderFunction() : MyInterface{
        return SecondInterfaceImpl()
    }

    @Singleton
    @Provides
    fun gsonProvider(): Gson{
        return Gson()
    }
}

//aynı sınıftan türetilmiş instance'ları birbirinden ayırmak için annotation oluşturabiliriz

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor