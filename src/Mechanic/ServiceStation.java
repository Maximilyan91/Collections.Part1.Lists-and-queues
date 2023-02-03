package Mechanic;

import Transport.Transport;
import Transport.Bus;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    private  Queue<T> transportQueue = new LinkedList<>();

    public void addTransport(T transport) {
        if (transport instanceof Bus) {
            System.out.println(" Автобусы не нуждаются в ТО");
        } else {
            transportQueue.offer(transport);
        }
    }

    public void runService(Mechanics mechanics) {
        T transport = transportQueue.poll();
        if (transport != null) {
           mechanics.doService();
        } else {
            System.out.println("авто в очереди нет");
        }
    }


}
