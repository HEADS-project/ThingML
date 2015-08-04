/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sintef.thingml.resource.thingml.analysis;

import org.sintef.thingml.*;

public class ReferenceParameterReferenceResolver implements org.sintef.thingml.resource.thingml.IThingmlReferenceResolver<org.sintef.thingml.Reference, org.sintef.thingml.Parameter> {
	
	private org.sintef.thingml.resource.thingml.analysis.ThingmlDefaultResolverDelegate<org.sintef.thingml.Reference, org.sintef.thingml.Parameter> delegate = new org.sintef.thingml.resource.thingml.analysis.ThingmlDefaultResolverDelegate<org.sintef.thingml.Reference, org.sintef.thingml.Parameter>();
	
	public void resolve(String identifier, org.sintef.thingml.Reference container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.sintef.thingml.resource.thingml.IThingmlReferenceResolveResult<org.sintef.thingml.Parameter> result) {
		ReferencedElmt elmt = container.getReference();

		Message message = null;
		if(elmt instanceof ReceiveMessage) {
			message = ((ReceiveMessage)elmt).getMessage();
		} else if(elmt instanceof MessageParameter) {
			message = ((MessageParameter)elmt).getMsgRef();
		} else if(elmt instanceof SimpleSource) {
			message = ((SimpleSource)elmt).getMessage().getMessage();
		} else if(elmt instanceof SourceComposition) {
			message = ((SourceComposition)elmt).getResultMessage();
		} else {
			result.setErrorMessage("The reference is incorrect or a new referenced element has been added. " +
					"May be you should update the resolver (" + this.getClass().getName() + ").");
		}

		if(message != null) {
			for(Parameter parameter : message.getParameters()) {
				if(resolveFuzzy && parameter.getName().startsWith(identifier)) {
					result.addMapping(parameter.getName(),parameter);
				} else if(!resolveFuzzy && parameter.getName().equals(identifier)) {
					result.addMapping(parameter.getName(),parameter);
				}
			}

			if(!result.wasResolved()) {
				result.setErrorMessage("The parameter " + identifier + " cannot be resolved for message " + message.getName());
			}
		}


	}
	
	public String deResolve(org.sintef.thingml.Parameter element, org.sintef.thingml.Reference container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
