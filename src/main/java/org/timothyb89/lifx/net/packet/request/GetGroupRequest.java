/*
 * The MIT License
 *
 * Copyright 2017 Michael Rochelle.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.timothyb89.lifx.net.packet.request;

import java.nio.ByteBuffer;
import org.timothyb89.lifx.net.packet.Packet;

/**
 *
 * @author Michael Rochelle
 */
public class GetGroupRequest extends Packet
{
	public static final int TYPE = 0x33;
	
	@Override
	public int packetType() 
	{
		return TYPE;
	}

	@Override
	protected int packetLength() 
	{
		return 0;
	}

	@Override
	protected void parsePacket(ByteBuffer bytes) 
	{
		// do nothing
	}

	@Override
	protected ByteBuffer packetBytes() 
	{
		return ByteBuffer.allocate(0);
	}

	@Override
	public int[] expectedResponses() 
	{
		return new int[] {};
	}
}
