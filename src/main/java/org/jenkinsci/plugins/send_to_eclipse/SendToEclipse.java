package org.jenkinsci.plugins.send_to_eclipse;

import hudson.Extension;
import hudson.model.PageDecorator;

@Extension(ordinal=5)
public class SendToEclipse extends PageDecorator {
	
	public SendToEclipse() {
		super(SendToEclipse.class);
	}
}