/*
 * generated by Xtext
 */
package hu.bme.mit.inf.ttmc.constraint.language.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import hu.bme.mit.inf.ttmc.constraint.language.services.TTMCConstraintLanguageGrammarAccess;

public class TTMCConstraintLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private TTMCConstraintLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected hu.bme.mit.inf.ttmc.constraint.language.ui.contentassist.antlr.internal.InternalTTMCConstraintLanguageParser createParser() {
		hu.bme.mit.inf.ttmc.constraint.language.ui.contentassist.antlr.internal.InternalTTMCConstraintLanguageParser result = new hu.bme.mit.inf.ttmc.constraint.language.ui.contentassist.antlr.internal.InternalTTMCConstraintLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getConstraintSpecificationAccess().getAlternatives_4(), "rule__ConstraintSpecification__Alternatives_4");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getTypeDefinitionAccess().getAlternatives(), "rule__TypeDefinition__Alternatives");
					put(grammarAccess.getSubrangeTypeDefinitionAccess().getAlternatives_2(), "rule__SubrangeTypeDefinition__Alternatives_2");
					put(grammarAccess.getSubrangeTypeDefinitionAccess().getAlternatives_4(), "rule__SubrangeTypeDefinition__Alternatives_4");
					put(grammarAccess.getIfThenElseExpressionAccess().getAlternatives(), "rule__IfThenElseExpression__Alternatives");
					put(grammarAccess.getUnaryLogicExpressionAccess().getAlternatives(), "rule__UnaryLogicExpression__Alternatives");
					put(grammarAccess.getEquivalenceExpressionAccess().getAlternatives_1(), "rule__EquivalenceExpression__Alternatives_1");
					put(grammarAccess.getComparisionExpressionAccess().getAlternatives_1_0(), "rule__ComparisionExpression__Alternatives_1_0");
					put(grammarAccess.getAdditiveExpressionAccess().getAlternatives_1(), "rule__AdditiveExpression__Alternatives_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getAlternatives_1(), "rule__MultiplicativeExpression__Alternatives_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getAlternatives_1_1_0(), "rule__MultiplicativeExpression__Alternatives_1_1_0");
					put(grammarAccess.getSignumExpressionAccess().getAlternatives(), "rule__SignumExpression__Alternatives");
					put(grammarAccess.getAccessExpressionAccess().getAlternatives_1(), "rule__AccessExpression__Alternatives_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
					put(grammarAccess.getBooleanLiteralExpressionAccess().getAlternatives(), "rule__BooleanLiteralExpression__Alternatives");
					put(grammarAccess.getConstraintSpecificationAccess().getGroup(), "rule__ConstraintSpecification__Group__0");
					put(grammarAccess.getConstraintSpecificationAccess().getGroup_2(), "rule__ConstraintSpecification__Group_2__0");
					put(grammarAccess.getConstraintSpecificationAccess().getGroup_2_1(), "rule__ConstraintSpecification__Group_2_1__0");
					put(grammarAccess.getConstraintSpecificationAccess().getGroup_2_1_1(), "rule__ConstraintSpecification__Group_2_1_1__0");
					put(grammarAccess.getParameterDeclarationAccess().getGroup(), "rule__ParameterDeclaration__Group__0");
					put(grammarAccess.getFieldDeclarationAccess().getGroup(), "rule__FieldDeclaration__Group__0");
					put(grammarAccess.getLetDeclarationAccess().getGroup(), "rule__LetDeclaration__Group__0");
					put(grammarAccess.getConstantDeclarationAccess().getGroup(), "rule__ConstantDeclaration__Group__0");
					put(grammarAccess.getConstantDeclarationAccess().getGroup_4(), "rule__ConstantDeclaration__Group_4__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup(), "rule__FunctionDeclaration__Group__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_2(), "rule__FunctionDeclaration__Group_2__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1(), "rule__FunctionDeclaration__Group_2_1__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1_1(), "rule__FunctionDeclaration__Group_2_1_1__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_5(), "rule__FunctionDeclaration__Group_5__0");
					put(grammarAccess.getTypeDeclarationAccess().getGroup(), "rule__TypeDeclaration__Group__0");
					put(grammarAccess.getNaturalTypeDefinitionAccess().getGroup(), "rule__NaturalTypeDefinition__Group__0");
					put(grammarAccess.getIntegerTypeDefinitionAccess().getGroup(), "rule__IntegerTypeDefinition__Group__0");
					put(grammarAccess.getBooleanTypeDefinitionAccess().getGroup(), "rule__BooleanTypeDefinition__Group__0");
					put(grammarAccess.getRealTypeDefinitionAccess().getGroup(), "rule__RealTypeDefinition__Group__0");
					put(grammarAccess.getArrayTypeDefinitionAccess().getGroup(), "rule__ArrayTypeDefinition__Group__0");
					put(grammarAccess.getArrayTypeDefinitionAccess().getGroup_2(), "rule__ArrayTypeDefinition__Group_2__0");
					put(grammarAccess.getEnumerationTypeDefinitionAccess().getGroup(), "rule__EnumerationTypeDefinition__Group__0");
					put(grammarAccess.getEnumerationTypeDefinitionAccess().getGroup_3(), "rule__EnumerationTypeDefinition__Group_3__0");
					put(grammarAccess.getRecordTypeDefinitionAccess().getGroup(), "rule__RecordTypeDefinition__Group__0");
					put(grammarAccess.getRecordTypeDefinitionAccess().getGroup_3(), "rule__RecordTypeDefinition__Group_3__0");
					put(grammarAccess.getTupleTypeDefinitionAccess().getGroup(), "rule__TupleTypeDefinition__Group__0");
					put(grammarAccess.getTupleTypeDefinitionAccess().getGroup_3(), "rule__TupleTypeDefinition__Group_3__0");
					put(grammarAccess.getSubrangeTypeDefinitionAccess().getGroup(), "rule__SubrangeTypeDefinition__Group__0");
					put(grammarAccess.getSubrangeTypeDefinitionAccess().getGroup_2_0(), "rule__SubrangeTypeDefinition__Group_2_0__0");
					put(grammarAccess.getSubTypeDefinitionAccess().getGroup(), "rule__SubTypeDefinition__Group__0");
					put(grammarAccess.getFunctionTypeDefinitionAccess().getGroup(), "rule__FunctionTypeDefinition__Group__0");
					put(grammarAccess.getFunctionTypeDefinitionAccess().getGroup_2(), "rule__FunctionTypeDefinition__Group_2__0");
					put(grammarAccess.getFunctionTypeDefinitionAccess().getGroup_2_1(), "rule__FunctionTypeDefinition__Group_2_1__0");
					put(grammarAccess.getIfThenElseExpressionAccess().getGroup_0(), "rule__IfThenElseExpression__Group_0__0");
					put(grammarAccess.getIfThenElseExpressionAccess().getGroup_0_5(), "rule__IfThenElseExpression__Group_0_5__0");
					put(grammarAccess.getEqualExpressionAccess().getGroup(), "rule__EqualExpression__Group__0");
					put(grammarAccess.getEqualExpressionAccess().getGroup_1(), "rule__EqualExpression__Group_1__0");
					put(grammarAccess.getImplyExpressionAccess().getGroup(), "rule__ImplyExpression__Group__0");
					put(grammarAccess.getImplyExpressionAccess().getGroup_1(), "rule__ImplyExpression__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1_1(), "rule__OrExpression__Group_1_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1_1(), "rule__AndExpression__Group_1_1__0");
					put(grammarAccess.getReleaseExpressionAccess().getGroup(), "rule__ReleaseExpression__Group__0");
					put(grammarAccess.getReleaseExpressionAccess().getGroup_1(), "rule__ReleaseExpression__Group_1__0");
					put(grammarAccess.getUntilExpressionAccess().getGroup(), "rule__UntilExpression__Group__0");
					put(grammarAccess.getUntilExpressionAccess().getGroup_1(), "rule__UntilExpression__Group_1__0");
					put(grammarAccess.getNotExpressionAccess().getGroup(), "rule__NotExpression__Group__0");
					put(grammarAccess.getForallExpressionAccess().getGroup(), "rule__ForallExpression__Group__0");
					put(grammarAccess.getForallExpressionAccess().getGroup_3(), "rule__ForallExpression__Group_3__0");
					put(grammarAccess.getForallExpressionAccess().getGroup_3_1(), "rule__ForallExpression__Group_3_1__0");
					put(grammarAccess.getExistsExpressionAccess().getGroup(), "rule__ExistsExpression__Group__0");
					put(grammarAccess.getExistsExpressionAccess().getGroup_3(), "rule__ExistsExpression__Group_3__0");
					put(grammarAccess.getExistsExpressionAccess().getGroup_3_1(), "rule__ExistsExpression__Group_3_1__0");
					put(grammarAccess.getFunctionLiteralExpressionAccess().getGroup(), "rule__FunctionLiteralExpression__Group__0");
					put(grammarAccess.getFunctionLiteralExpressionAccess().getGroup_3(), "rule__FunctionLiteralExpression__Group_3__0");
					put(grammarAccess.getFunctionLiteralExpressionAccess().getGroup_3_1(), "rule__FunctionLiteralExpression__Group_3_1__0");
					put(grammarAccess.getGloballyExpressionAccess().getGroup(), "rule__GloballyExpression__Group__0");
					put(grammarAccess.getFinallyExpressionAccess().getGroup(), "rule__FinallyExpression__Group__0");
					put(grammarAccess.getNextExpressionAccess().getGroup(), "rule__NextExpression__Group__0");
					put(grammarAccess.getTemporalForallExpressionAccess().getGroup(), "rule__TemporalForallExpression__Group__0");
					put(grammarAccess.getTemporalExistsExpressionAccess().getGroup(), "rule__TemporalExistsExpression__Group__0");
					put(grammarAccess.getLetExpressionAccess().getGroup(), "rule__LetExpression__Group__0");
					put(grammarAccess.getLetExpressionAccess().getGroup_4(), "rule__LetExpression__Group_4__0");
					put(grammarAccess.getInExpressionAccess().getGroup(), "rule__InExpression__Group__0");
					put(grammarAccess.getInExpressionAccess().getGroup_1(), "rule__InExpression__Group_1__0");
					put(grammarAccess.getEquivalenceExpressionAccess().getGroup(), "rule__EquivalenceExpression__Group__0");
					put(grammarAccess.getEquivalenceExpressionAccess().getGroup_1_0(), "rule__EquivalenceExpression__Group_1_0__0");
					put(grammarAccess.getEquivalenceExpressionAccess().getGroup_1_1(), "rule__EquivalenceExpression__Group_1_1__0");
					put(grammarAccess.getComparisionExpressionAccess().getGroup(), "rule__ComparisionExpression__Group__0");
					put(grammarAccess.getComparisionExpressionAccess().getGroup_1(), "rule__ComparisionExpression__Group_1__0");
					put(grammarAccess.getComparisionExpressionAccess().getGroup_1_0_0(), "rule__ComparisionExpression__Group_1_0_0__0");
					put(grammarAccess.getComparisionExpressionAccess().getGroup_1_0_1(), "rule__ComparisionExpression__Group_1_0_1__0");
					put(grammarAccess.getComparisionExpressionAccess().getGroup_1_0_2(), "rule__ComparisionExpression__Group_1_0_2__0");
					put(grammarAccess.getComparisionExpressionAccess().getGroup_1_0_3(), "rule__ComparisionExpression__Group_1_0_3__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0(), "rule__AdditiveExpression__Group_1_0__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_1(), "rule__AdditiveExpression__Group_1_0_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_1_0(), "rule__AdditiveExpression__Group_1_0_1_0__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_1(), "rule__AdditiveExpression__Group_1_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0(), "rule__MultiplicativeExpression__Group_1_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_1(), "rule__MultiplicativeExpression__Group_1_0_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_1_0(), "rule__MultiplicativeExpression__Group_1_0_1_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_1(), "rule__MultiplicativeExpression__Group_1_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_1_0_0(), "rule__MultiplicativeExpression__Group_1_1_0_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_1_0_1(), "rule__MultiplicativeExpression__Group_1_1_0_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_1_0_2(), "rule__MultiplicativeExpression__Group_1_1_0_2__0");
					put(grammarAccess.getSignumExpressionAccess().getGroup_0(), "rule__SignumExpression__Group_0__0");
					put(grammarAccess.getSignumExpressionAccess().getGroup_1(), "rule__SignumExpression__Group_1__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup(), "rule__AccessExpression__Group__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup_1_0(), "rule__AccessExpression__Group_1_0__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup_1_0_2(), "rule__AccessExpression__Group_1_0_2__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup_1_0_2_1(), "rule__AccessExpression__Group_1_0_2_1__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup_1_1(), "rule__AccessExpression__Group_1_1__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup_1_1_2(), "rule__AccessExpression__Group_1_1_2__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup_1_1_2_1(), "rule__AccessExpression__Group_1_1_2_1__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup_1_2(), "rule__AccessExpression__Group_1_2__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup_1_3(), "rule__AccessExpression__Group_1_3__0");
					put(grammarAccess.getAccessExpressionAccess().getGroup_1_4(), "rule__AccessExpression__Group_1_4__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
					put(grammarAccess.getRationalLiteralExpressionAccess().getGroup(), "rule__RationalLiteralExpression__Group__0");
					put(grammarAccess.getTrueExpressionAccess().getGroup(), "rule__TrueExpression__Group__0");
					put(grammarAccess.getFalseExpressionAccess().getGroup(), "rule__FalseExpression__Group__0");
					put(grammarAccess.getArrayLiteralExpressionAccess().getGroup(), "rule__ArrayLiteralExpression__Group__0");
					put(grammarAccess.getArrayLiteralExpressionAccess().getGroup_1(), "rule__ArrayLiteralExpression__Group_1__0");
					put(grammarAccess.getArrayLiteralExpressionAccess().getGroup_1_1(), "rule__ArrayLiteralExpression__Group_1_1__0");
					put(grammarAccess.getRecordLiteralExpressionAccess().getGroup(), "rule__RecordLiteralExpression__Group__0");
					put(grammarAccess.getRecordLiteralExpressionAccess().getGroup_2(), "rule__RecordLiteralExpression__Group_2__0");
					put(grammarAccess.getFieldAssignmentAccess().getGroup(), "rule__FieldAssignment__Group__0");
					put(grammarAccess.getTupleLiteralExpressionAccess().getGroup(), "rule__TupleLiteralExpression__Group__0");
					put(grammarAccess.getTupleLiteralExpressionAccess().getGroup_2(), "rule__TupleLiteralExpression__Group_2__0");
					put(grammarAccess.getEnumerationLiteralExpressionAccess().getGroup(), "rule__EnumerationLiteralExpression__Group__0");
					put(grammarAccess.getBasicConstraintDefinitionAccess().getGroup(), "rule__BasicConstraintDefinition__Group__0");
					put(grammarAccess.getConstraintSpecificationAccess().getNameAssignment_1(), "rule__ConstraintSpecification__NameAssignment_1");
					put(grammarAccess.getConstraintSpecificationAccess().getParameterDeclarationsAssignment_2_1_0(), "rule__ConstraintSpecification__ParameterDeclarationsAssignment_2_1_0");
					put(grammarAccess.getConstraintSpecificationAccess().getParameterDeclarationsAssignment_2_1_1_1(), "rule__ConstraintSpecification__ParameterDeclarationsAssignment_2_1_1_1");
					put(grammarAccess.getConstraintSpecificationAccess().getTypeDeclarationsAssignment_4_0(), "rule__ConstraintSpecification__TypeDeclarationsAssignment_4_0");
					put(grammarAccess.getConstraintSpecificationAccess().getConstantDeclarationsAssignment_4_1(), "rule__ConstraintSpecification__ConstantDeclarationsAssignment_4_1");
					put(grammarAccess.getConstraintSpecificationAccess().getFunctionDeclarationsAssignment_4_2(), "rule__ConstraintSpecification__FunctionDeclarationsAssignment_4_2");
					put(grammarAccess.getConstraintSpecificationAccess().getBasicConstraintDefinitionsAssignment_4_3(), "rule__ConstraintSpecification__BasicConstraintDefinitionsAssignment_4_3");
					put(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1(), "rule__ParameterDeclaration__NameAssignment_1");
					put(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_3(), "rule__ParameterDeclaration__TypeAssignment_3");
					put(grammarAccess.getFieldDeclarationAccess().getNameAssignment_1(), "rule__FieldDeclaration__NameAssignment_1");
					put(grammarAccess.getFieldDeclarationAccess().getTypeAssignment_3(), "rule__FieldDeclaration__TypeAssignment_3");
					put(grammarAccess.getLetDeclarationAccess().getNameAssignment_1(), "rule__LetDeclaration__NameAssignment_1");
					put(grammarAccess.getLetDeclarationAccess().getTypeAssignment_3(), "rule__LetDeclaration__TypeAssignment_3");
					put(grammarAccess.getLetDeclarationAccess().getExpressionAssignment_5(), "rule__LetDeclaration__ExpressionAssignment_5");
					put(grammarAccess.getConstantDeclarationAccess().getNameAssignment_1(), "rule__ConstantDeclaration__NameAssignment_1");
					put(grammarAccess.getConstantDeclarationAccess().getTypeAssignment_3(), "rule__ConstantDeclaration__TypeAssignment_3");
					put(grammarAccess.getConstantDeclarationAccess().getExpressionAssignment_4_1(), "rule__ConstantDeclaration__ExpressionAssignment_4_1");
					put(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_1(), "rule__FunctionDeclaration__NameAssignment_1");
					put(grammarAccess.getFunctionDeclarationAccess().getParameterDeclarationsAssignment_2_1_0(), "rule__FunctionDeclaration__ParameterDeclarationsAssignment_2_1_0");
					put(grammarAccess.getFunctionDeclarationAccess().getParameterDeclarationsAssignment_2_1_1_1(), "rule__FunctionDeclaration__ParameterDeclarationsAssignment_2_1_1_1");
					put(grammarAccess.getFunctionDeclarationAccess().getTypeAssignment_4(), "rule__FunctionDeclaration__TypeAssignment_4");
					put(grammarAccess.getFunctionDeclarationAccess().getExpressionAssignment_5_1(), "rule__FunctionDeclaration__ExpressionAssignment_5_1");
					put(grammarAccess.getTypeDeclarationAccess().getNameAssignment_1(), "rule__TypeDeclaration__NameAssignment_1");
					put(grammarAccess.getTypeDeclarationAccess().getTypeAssignment_3(), "rule__TypeDeclaration__TypeAssignment_3");
					put(grammarAccess.getTypeReferenceAccess().getReferenceAssignment(), "rule__TypeReference__ReferenceAssignment");
					put(grammarAccess.getArrayTypeDefinitionAccess().getIndexTypesAssignment_1(), "rule__ArrayTypeDefinition__IndexTypesAssignment_1");
					put(grammarAccess.getArrayTypeDefinitionAccess().getIndexTypesAssignment_2_1(), "rule__ArrayTypeDefinition__IndexTypesAssignment_2_1");
					put(grammarAccess.getArrayTypeDefinitionAccess().getElementTypeAssignment_4(), "rule__ArrayTypeDefinition__ElementTypeAssignment_4");
					put(grammarAccess.getEnumerationTypeDefinitionAccess().getLiteralsAssignment_2(), "rule__EnumerationTypeDefinition__LiteralsAssignment_2");
					put(grammarAccess.getEnumerationTypeDefinitionAccess().getLiteralsAssignment_3_1(), "rule__EnumerationTypeDefinition__LiteralsAssignment_3_1");
					put(grammarAccess.getEnumerationLiteralDefinitionAccess().getNameAssignment(), "rule__EnumerationLiteralDefinition__NameAssignment");
					put(grammarAccess.getRecordTypeDefinitionAccess().getFieldDeclarationsAssignment_2(), "rule__RecordTypeDefinition__FieldDeclarationsAssignment_2");
					put(grammarAccess.getRecordTypeDefinitionAccess().getFieldDeclarationsAssignment_3_1(), "rule__RecordTypeDefinition__FieldDeclarationsAssignment_3_1");
					put(grammarAccess.getTupleTypeDefinitionAccess().getTypesAssignment_2(), "rule__TupleTypeDefinition__TypesAssignment_2");
					put(grammarAccess.getTupleTypeDefinitionAccess().getTypesAssignment_3_1(), "rule__TupleTypeDefinition__TypesAssignment_3_1");
					put(grammarAccess.getSubrangeTypeDefinitionAccess().getLowerBoundAssignment_2_1(), "rule__SubrangeTypeDefinition__LowerBoundAssignment_2_1");
					put(grammarAccess.getSubrangeTypeDefinitionAccess().getUpperBoundAssignment_4_1(), "rule__SubrangeTypeDefinition__UpperBoundAssignment_4_1");
					put(grammarAccess.getSubTypeDefinitionAccess().getParameterDeclarationAssignment_1(), "rule__SubTypeDefinition__ParameterDeclarationAssignment_1");
					put(grammarAccess.getSubTypeDefinitionAccess().getExpressionAssignment_3(), "rule__SubTypeDefinition__ExpressionAssignment_3");
					put(grammarAccess.getFunctionTypeDefinitionAccess().getParameterTypesAssignment_2_0(), "rule__FunctionTypeDefinition__ParameterTypesAssignment_2_0");
					put(grammarAccess.getFunctionTypeDefinitionAccess().getParameterTypesAssignment_2_1_1(), "rule__FunctionTypeDefinition__ParameterTypesAssignment_2_1_1");
					put(grammarAccess.getFunctionTypeDefinitionAccess().getReturnTypeAssignment_5(), "rule__FunctionTypeDefinition__ReturnTypeAssignment_5");
					put(grammarAccess.getIfThenElseExpressionAccess().getConditionAssignment_0_2(), "rule__IfThenElseExpression__ConditionAssignment_0_2");
					put(grammarAccess.getIfThenElseExpressionAccess().getThenAssignment_0_4(), "rule__IfThenElseExpression__ThenAssignment_0_4");
					put(grammarAccess.getIfThenElseExpressionAccess().getElseAssignment_0_5_1(), "rule__IfThenElseExpression__ElseAssignment_0_5_1");
					put(grammarAccess.getEqualExpressionAccess().getRightOperandAssignment_1_2(), "rule__EqualExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getImplyExpressionAccess().getRightOperandAssignment_1_2(), "rule__ImplyExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getOrExpressionAccess().getOperandsAssignment_1_1_1(), "rule__OrExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getAndExpressionAccess().getOperandsAssignment_1_1_1(), "rule__AndExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getReleaseExpressionAccess().getRightOperandAssignment_1_2(), "rule__ReleaseExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getUntilExpressionAccess().getRightOperandAssignment_1_2(), "rule__UntilExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getNotExpressionAccess().getOperandAssignment_2(), "rule__NotExpression__OperandAssignment_2");
					put(grammarAccess.getForallExpressionAccess().getParameterDeclarationsAssignment_3_0(), "rule__ForallExpression__ParameterDeclarationsAssignment_3_0");
					put(grammarAccess.getForallExpressionAccess().getParameterDeclarationsAssignment_3_1_1(), "rule__ForallExpression__ParameterDeclarationsAssignment_3_1_1");
					put(grammarAccess.getForallExpressionAccess().getOperandAssignment_6(), "rule__ForallExpression__OperandAssignment_6");
					put(grammarAccess.getExistsExpressionAccess().getParameterDeclarationsAssignment_3_0(), "rule__ExistsExpression__ParameterDeclarationsAssignment_3_0");
					put(grammarAccess.getExistsExpressionAccess().getParameterDeclarationsAssignment_3_1_1(), "rule__ExistsExpression__ParameterDeclarationsAssignment_3_1_1");
					put(grammarAccess.getExistsExpressionAccess().getOperandAssignment_6(), "rule__ExistsExpression__OperandAssignment_6");
					put(grammarAccess.getFunctionLiteralExpressionAccess().getParameterDeclarationsAssignment_3_0(), "rule__FunctionLiteralExpression__ParameterDeclarationsAssignment_3_0");
					put(grammarAccess.getFunctionLiteralExpressionAccess().getParameterDeclarationsAssignment_3_1_1(), "rule__FunctionLiteralExpression__ParameterDeclarationsAssignment_3_1_1");
					put(grammarAccess.getFunctionLiteralExpressionAccess().getReturnTypeAssignment_6(), "rule__FunctionLiteralExpression__ReturnTypeAssignment_6");
					put(grammarAccess.getFunctionLiteralExpressionAccess().getOperandAssignment_8(), "rule__FunctionLiteralExpression__OperandAssignment_8");
					put(grammarAccess.getGloballyExpressionAccess().getOperandAssignment_2(), "rule__GloballyExpression__OperandAssignment_2");
					put(grammarAccess.getFinallyExpressionAccess().getOperandAssignment_2(), "rule__FinallyExpression__OperandAssignment_2");
					put(grammarAccess.getNextExpressionAccess().getOperandAssignment_2(), "rule__NextExpression__OperandAssignment_2");
					put(grammarAccess.getTemporalForallExpressionAccess().getOperandAssignment_2(), "rule__TemporalForallExpression__OperandAssignment_2");
					put(grammarAccess.getTemporalExistsExpressionAccess().getOperandAssignment_2(), "rule__TemporalExistsExpression__OperandAssignment_2");
					put(grammarAccess.getLetExpressionAccess().getLetDeclarationsAssignment_3(), "rule__LetExpression__LetDeclarationsAssignment_3");
					put(grammarAccess.getLetExpressionAccess().getLetDeclarationsAssignment_4_1(), "rule__LetExpression__LetDeclarationsAssignment_4_1");
					put(grammarAccess.getLetExpressionAccess().getExpressionAssignment_7(), "rule__LetExpression__ExpressionAssignment_7");
					put(grammarAccess.getInExpressionAccess().getTypeAssignment_1_2(), "rule__InExpression__TypeAssignment_1_2");
					put(grammarAccess.getEquivalenceExpressionAccess().getRightOperandAssignment_1_0_2(), "rule__EquivalenceExpression__RightOperandAssignment_1_0_2");
					put(grammarAccess.getEquivalenceExpressionAccess().getRightOperandAssignment_1_1_2(), "rule__EquivalenceExpression__RightOperandAssignment_1_1_2");
					put(grammarAccess.getComparisionExpressionAccess().getRightOperandAssignment_1_1(), "rule__ComparisionExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getOperandsAssignment_1_0_1_0_1(), "rule__AdditiveExpression__OperandsAssignment_1_0_1_0_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightOperandAssignment_1_1_2(), "rule__AdditiveExpression__RightOperandAssignment_1_1_2");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOperandsAssignment_1_0_1_0_1(), "rule__MultiplicativeExpression__OperandsAssignment_1_0_1_0_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandAssignment_1_1_1(), "rule__MultiplicativeExpression__RightOperandAssignment_1_1_1");
					put(grammarAccess.getSignumExpressionAccess().getOperandAssignment_0_2(), "rule__SignumExpression__OperandAssignment_0_2");
					put(grammarAccess.getSignumExpressionAccess().getOperandAssignment_1_2(), "rule__SignumExpression__OperandAssignment_1_2");
					put(grammarAccess.getAccessExpressionAccess().getParametersAssignment_1_0_2_0(), "rule__AccessExpression__ParametersAssignment_1_0_2_0");
					put(grammarAccess.getAccessExpressionAccess().getParametersAssignment_1_0_2_1_1(), "rule__AccessExpression__ParametersAssignment_1_0_2_1_1");
					put(grammarAccess.getAccessExpressionAccess().getParametersAssignment_1_1_2_0(), "rule__AccessExpression__ParametersAssignment_1_1_2_0");
					put(grammarAccess.getAccessExpressionAccess().getParametersAssignment_1_1_2_1_1(), "rule__AccessExpression__ParametersAssignment_1_1_2_1_1");
					put(grammarAccess.getAccessExpressionAccess().getFieldAssignment_1_2_2(), "rule__AccessExpression__FieldAssignment_1_2_2");
					put(grammarAccess.getAccessExpressionAccess().getIndexAssignment_1_3_2(), "rule__AccessExpression__IndexAssignment_1_3_2");
					put(grammarAccess.getReferenceExpressionAccess().getDeclarationAssignment(), "rule__ReferenceExpression__DeclarationAssignment");
					put(grammarAccess.getIntegerLiteralExpressionAccess().getValueAssignment(), "rule__IntegerLiteralExpression__ValueAssignment");
					put(grammarAccess.getDecimalLiteralExpressionAccess().getValueAssignment(), "rule__DecimalLiteralExpression__ValueAssignment");
					put(grammarAccess.getRationalLiteralExpressionAccess().getNumeratorAssignment_0(), "rule__RationalLiteralExpression__NumeratorAssignment_0");
					put(grammarAccess.getRationalLiteralExpressionAccess().getDenominatorAssignment_2(), "rule__RationalLiteralExpression__DenominatorAssignment_2");
					put(grammarAccess.getArrayLiteralExpressionAccess().getParameterDeclarationsAssignment_1_0(), "rule__ArrayLiteralExpression__ParameterDeclarationsAssignment_1_0");
					put(grammarAccess.getArrayLiteralExpressionAccess().getParameterDeclarationsAssignment_1_1_1(), "rule__ArrayLiteralExpression__ParameterDeclarationsAssignment_1_1_1");
					put(grammarAccess.getArrayLiteralExpressionAccess().getOperandAssignment_3(), "rule__ArrayLiteralExpression__OperandAssignment_3");
					put(grammarAccess.getRecordLiteralExpressionAccess().getFieldAssignmentsAssignment_1(), "rule__RecordLiteralExpression__FieldAssignmentsAssignment_1");
					put(grammarAccess.getRecordLiteralExpressionAccess().getFieldAssignmentsAssignment_2_1(), "rule__RecordLiteralExpression__FieldAssignmentsAssignment_2_1");
					put(grammarAccess.getFieldAssignmentAccess().getReferenceAssignment_0(), "rule__FieldAssignment__ReferenceAssignment_0");
					put(grammarAccess.getFieldAssignmentAccess().getValueAssignment_2(), "rule__FieldAssignment__ValueAssignment_2");
					put(grammarAccess.getTupleLiteralExpressionAccess().getExpressionsAssignment_1(), "rule__TupleLiteralExpression__ExpressionsAssignment_1");
					put(grammarAccess.getTupleLiteralExpressionAccess().getExpressionsAssignment_2_1(), "rule__TupleLiteralExpression__ExpressionsAssignment_2_1");
					put(grammarAccess.getEnumerationLiteralExpressionAccess().getReferenceAssignment_1(), "rule__EnumerationLiteralExpression__ReferenceAssignment_1");
					put(grammarAccess.getBasicConstraintDefinitionAccess().getExpressionAssignment_1(), "rule__BasicConstraintDefinition__ExpressionAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			hu.bme.mit.inf.ttmc.constraint.language.ui.contentassist.antlr.internal.InternalTTMCConstraintLanguageParser typedParser = (hu.bme.mit.inf.ttmc.constraint.language.ui.contentassist.antlr.internal.InternalTTMCConstraintLanguageParser) parser;
			typedParser.entryRuleConstraintSpecification();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public TTMCConstraintLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TTMCConstraintLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
