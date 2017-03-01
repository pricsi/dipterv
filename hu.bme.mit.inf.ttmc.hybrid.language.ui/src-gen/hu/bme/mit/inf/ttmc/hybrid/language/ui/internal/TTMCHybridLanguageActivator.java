/*
 * generated by Xtext
 */
package hu.bme.mit.inf.ttmc.hybrid.language.ui.internal;

import java.util.Collections;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TTMCHybridLanguageActivator extends AbstractUIPlugin {
	
	public static final String HU_BME_MIT_INF_TTMC_HYBRID_LANGUAGE_TTMCHYBRIDLANGUAGE = "hu.bme.mit.inf.ttmc.hybrid.language.TTMCHybridLanguage";
	
	private static final Logger logger = Logger.getLogger(TTMCHybridLanguageActivator.class);
	
	private static TTMCHybridLanguageActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static TTMCHybridLanguageActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}

	protected Module getRuntimeModule(String grammar) {
		if (HU_BME_MIT_INF_TTMC_HYBRID_LANGUAGE_TTMCHYBRIDLANGUAGE.equals(grammar)) {
			return new hu.bme.mit.inf.ttmc.hybrid.language.TTMCHybridLanguageRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (HU_BME_MIT_INF_TTMC_HYBRID_LANGUAGE_TTMCHYBRIDLANGUAGE.equals(grammar)) {
			return new hu.bme.mit.inf.ttmc.hybrid.language.ui.TTMCHybridLanguageUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}
