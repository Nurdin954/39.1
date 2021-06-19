package com.company;


import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Comparator<Ticket> ticketComparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                if (o1.getCost() > o2.getCost())
                    return -1;

                if (o1.getCost() < o2.getCost())
                    return 1;
                return 0;
            }
        };


        PriorityQueue<Ticket> ticketPriorityQueue = new PriorityQueue<>(ticketComparator);
        Ticket ticket1 = new Ticket(2900,"Wars_Clone");
        Ticket ticket2 = new Ticket(6000,"Transformers");
        Ticket ticket3 = new Ticket(4000,"Bakugan");
        Ticket ticket4 = new Ticket(9100,"Sailar_Moon");
        Ticket ticket5 = new Ticket(3500,"Star_Wars");
        Ticket ticket6 = new Ticket(6250,"Lego_Binikle");
        Ticket ticket7 = new Ticket(7600,"Mortal_Combat");


        ticketPriorityQueue.add(ticket1);
        ticketPriorityQueue.add(ticket2);
        ticketPriorityQueue.add(ticket3);
        ticketPriorityQueue.add(ticket4);
        ticketPriorityQueue.add(ticket5);
        ticketPriorityQueue.add(ticket6);
        ticketPriorityQueue.add(ticket7);





        while (!ticketPriorityQueue.isEmpty()){

            System.out.println(ticketPriorityQueue.remove());

        }


    }
}
