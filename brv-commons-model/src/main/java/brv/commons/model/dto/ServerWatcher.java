package brv.commons.model.dto;

import java.io.Serializable;

import brv.commons.model.enums.Protocol;

public class ServerWatcher implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7351217101483497056L;
	
	private long id;
	private Protocol protocol;
	private int port;
	private int timeoutMilliseconds;
	private int refreshSeconds;
	private boolean running;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Protocol getProtocol() {
		return protocol;
	}
	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getTimeoutMilliseconds() {
		return timeoutMilliseconds;
	}
	public void setTimeoutMilliseconds(int timeoutMilliseconds) {
		this.timeoutMilliseconds = timeoutMilliseconds;
	}
	public int getRefreshSeconds() {
		return refreshSeconds;
	}
	public void setRefreshSeconds(int refreshSeconds) {
		this.refreshSeconds = refreshSeconds;
	}
	public boolean isRunning() {
		return running;
	}
	public void setRunning(boolean running) {
		this.running = running;
	}

	
	
}
