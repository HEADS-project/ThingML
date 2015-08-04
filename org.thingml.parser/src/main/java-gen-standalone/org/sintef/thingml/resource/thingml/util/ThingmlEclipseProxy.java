/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.sintef.thingml.resource.thingml.util;

/**
 * A utility class that bundles all dependencies to the Eclipse platform. Clients
 * of this class must check whether the Eclipse bundles are available in the
 * classpath. If they are not available, this class is not used, which allows to
 * run resource plug-in that are generated by EMFText in stand-alone mode. In this
 * case the EMF JARs are sufficient to parse and print resources.
 */
public class ThingmlEclipseProxy {
	
	// This class is intentionally left empty because option
	// 'removeEclipseDependentCode' is set to true.
}
