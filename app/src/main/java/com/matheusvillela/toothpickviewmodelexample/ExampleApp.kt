package com.matheusvillela.toothpickviewmodelexample

import android.app.Application
import toothpick.Scope
import toothpick.Toothpick
import toothpick.registries.FactoryRegistryLocator
import toothpick.registries.MemberInjectorRegistryLocator

class ExampleApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Toothpick.setConfiguration(toothpick.configuration.Configuration.forProduction().disableReflection())
        MemberInjectorRegistryLocator.setRootRegistry(com.matheusvillela.toothpickviewmodelexample.MemberInjectorRegistry())
        FactoryRegistryLocator.setRootRegistry(com.matheusvillela.toothpickviewmodelexample.FactoryRegistry())

        val appScope: Scope = Toothpick.openScope(this)

        appScope.installModules(AppModule(this))
        Toothpick.inject(this, appScope)
    }

}