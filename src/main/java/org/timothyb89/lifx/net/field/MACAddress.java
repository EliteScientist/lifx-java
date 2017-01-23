package org.timothyb89.lifx.net.field;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author tim
 */
@ToString(of = {"hex"})
public class MACAddress {
	
	@Getter private ByteBuffer bytes;
	@Getter private String hex;
	
	public MACAddress(ByteBuffer bytes) {
		this.bytes = bytes;
		
		createHex();
	}
	
	public MACAddress() {
		this(ByteBuffer.allocate(8));
	}
	
	private void createHex() {
		bytes.rewind();
		
		List<String> byteStrings = new LinkedList<>();
		
		// Mac only uses 6 of the 8 bytes
		for (int i = 0; i < 6; i++)
		{
			byteStrings.add(String.format("%02X", bytes.get()));
		}
						
		hex = StringUtils.join(byteStrings, ':');
		
		bytes.rewind();
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.hex);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		final MACAddress other = (MACAddress) obj;
		if (!this.hex.equalsIgnoreCase(other.hex)) {
			return false;
		}
		
		return true;
	}
	
}
