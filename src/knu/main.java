package knu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class main {
    public static void main(String[] args) {
        try {
            final int PORT = 6000;
            DatagramSocket ds = new DatagramSocket();
            InetAddress addr = InetAddress.getByName("10.2.8.162");
            String s;
            do {
                BufferedReader keyin;
                keyin = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("輸入字串");
                s = keyin.readLine();
                DatagramPacket dp = new DatagramPacket(s.getBytes(), s.length(), addr, PORT);
                ds.send(dp);
            }
            while (!s.equals(""));
            System.out.println("結束!");
            ds.close();
            }catch(Exception e)
        {
            System.out.println("UdpClient fails.");
        }
        }
    }

