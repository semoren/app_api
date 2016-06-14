package com.haoxin.app.api.model;

public class HandleModeSupport {

	private Boolean remoteControl;

	private Boolean joypad;

	private Boolean motionController;

	public Boolean getRemoteControl() {
		return this.remoteControl;
	}

	public void setRemoteControl(Boolean remoteControl) {
		this.remoteControl = remoteControl;
	}

	public Boolean getJoypad() {
		return this.joypad;
	}

	public void setJoypad(Boolean joypad) {
		this.joypad = joypad;
	}

	public Boolean getMotionController() {
		return this.motionController;
	}

	public void setMotionController(Boolean motionController) {
		this.motionController = motionController;
	}
}