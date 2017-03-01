/**
 *
 * $Id$
 */
package TTMCConstraint.validation;

import TTMCConstraint.Expression;
import TTMCConstraint.ParameterDeclaration;

/**
 * A sample validator interface for {@link TTMCConstraint.SubTypeDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SubTypeDefinitionValidator {
	boolean validate();

	boolean validateParameterDeclaration(ParameterDeclaration value);
	boolean validateExpression(Expression value);
}