package day19.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Ω” ‹∂À
 * 
 * @author fan
 *
 */
public class ReceiveDemo {
	public static void main(String[] args) throws Exception {
		int port = 10086;
		DatagramSocket socket = new DatagramSocket(port);
		byte[] buf = new byte[10];
		int length = buf.length;
		DatagramPacket p = new DatagramPacket(buf, length);
		socket.receive(p);
		String str = new String(buf);
		System.out.println(str);
	}
}