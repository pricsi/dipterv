/*
 * generated by Xtext
 */
package hu.bme.mit.inf.ttmc.constraint.language.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractTTMCConstraintLanguageValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.inf.mit.bme.hu/ttmc/TTMCConstraint"));
		return result;
	}
}