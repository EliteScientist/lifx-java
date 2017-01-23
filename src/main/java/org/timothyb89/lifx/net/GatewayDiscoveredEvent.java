package org.timothyb89.lifx.net;

import org.timothyb89.lifx.gateway.Gateway;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.timothyb89.eventbus.Event;

/**
 *
 * @author tim
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GatewayDiscoveredEvent extends Event {
	
	@Getter
	private final Gateway gateway;
	
}
