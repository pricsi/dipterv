/*
 * generated by Xtext
 */
package hu.bme.mit.inf.ttmc.system.language.scoping

import org.eclipse.xtext.scoping.IScope
import TTMCConstraint.ReferenceExpression
import org.eclipse.emf.ecore.EReference
import TTMCConstraint.Declaration
import org.eclipse.xtext.scoping.Scopes
import TTMCSystem.System
import TTMCSystem.SystemDefinition
import TTMCSystem.SystemReference
import TTMCSystem.PropertyDeclaration
import java.util.LinkedList

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class TTMCSystemLanguageScopeProvider extends hu.bme.mit.inf.ttmc.constraint.language.scoping.TTMCConstraintLanguageScopeProvider {
	
	def IScope scope_ReferenceExpression_reference(ReferenceExpression referenceExpression, EReference ref) {
		
		// declarations whose container has the reference as a content
		val visibleDeclarations = referenceExpression.eResource.allContents.filter(Declaration).filter [
			it.eContainer.eAllContents.filter(ReferenceExpression).exists[it === referenceExpression]
		].toList
		
		//PropertyDeclaration that has referenceExpression as a content
		val containingProperty = referenceExpression.eResource.allContents.filter(PropertyDeclaration).filter [
			it.expression.eAllContents.filter(ReferenceExpression).exists[it === referenceExpression]
		].head

		if (containingProperty == null) {
			return Scopes::scopeFor(visibleDeclarations);
		} else {
			val baseSystem = containingProperty.system.getBaseSystem
			if (baseSystem != null) {
				// look for declaration locally
				val scope = new LinkedList<Declaration>(visibleDeclarations.toList)
				scope.addAll(baseSystem.variableDeclarations)
				scope.addAll(baseSystem.definitionDeclarations)
				return Scopes::scopeFor(scope)
			}
		}
		
		return Scopes::scopeFor(new LinkedList)
	}
	
	////////
	
	private def dispatch SystemDefinition getBaseSystem(System system) {
		return null
	}
	
	private def dispatch SystemDefinition getBaseSystem(SystemDefinition system) {
		return system
	}
	
	private def dispatch SystemDefinition getBaseSystem(SystemReference system) {
		return system.reference.system.getBaseSystem
	}

}
