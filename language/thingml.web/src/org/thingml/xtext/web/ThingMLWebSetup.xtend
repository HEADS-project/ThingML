/*
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.web

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Provider
import com.google.inject.util.Modules
import java.util.concurrent.ExecutorService
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.thingml.xtext.ThingMLRuntimeModule
import org.thingml.xtext.ThingMLStandaloneSetup

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
class ThingMLWebSetup extends ThingMLStandaloneSetup {
	
	val Provider<ExecutorService> executorServiceProvider;
	
	override Injector createInjector() {
		val runtimeModule = new ThingMLRuntimeModule()
		val webModule = new ThingMLWebModule(executorServiceProvider)
		return Guice.createInjector(Modules.override(runtimeModule).with(webModule))
	}
	
}