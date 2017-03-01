/**
 *
 * $Id$
 */
package TTMCConstraint.validation;

import java.math.BigInteger;

/**
 * A sample validator interface for {@link TTMCConstraint.IntegerLiteralExpression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IntegerLiteralExpressionValidator {
	boolean validate();

	boolean validateValue(BigInteger value);
}
