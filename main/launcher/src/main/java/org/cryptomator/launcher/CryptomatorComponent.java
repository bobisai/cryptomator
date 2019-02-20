package org.cryptomator.launcher;

import dagger.Component;
import org.cryptomator.common.CommonsModule;
import org.cryptomator.common.Environment;
import org.cryptomator.logging.DebugMode;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Optional;

@Singleton
@Component(modules = {CryptomatorModule.class, CommonsModule.class})
public interface CryptomatorComponent {

	DebugMode debugMode();

	IpcFactory ipcFactory();

	@Named("applicationVersion")
	Optional<String> applicationVersion();

	FxApplicationComponent.Builder fxApplicationComponent();

}
