package day19.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * ·¢ËÍ¶Ë
 * 
 * @author fan
 *
 */
public class SendDdemo {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();
		byte[] buf = "aa".getBytes();
		int length = buf.length;
		int port = 10086;
		InetAddress address = InetAddress.getByName("yang");
		DatagramPacket p = new DatagramPacket(buf, length, address, port);
		socket.send(p);
		socket.close();
		
	}
}
