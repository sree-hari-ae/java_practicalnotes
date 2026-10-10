class TicketBooking {

    int tickets = 5;

    synchronized void bookTicket(String name, int number) {

        System.out.println(name + " wants to book " + number + " tickets");

        if (tickets >= number) {

            tickets = tickets - number;

            System.out.println(name + " booked " + number + " tickets");
            System.out.println("Remaining tickets = " + tickets);

        } else {

            System.out.println("Sorry " + name + ", tickets not available");
            System.out.println("Remaining tickets = " + tickets);
        }
    }
}

class Customer extends Thread {

    TicketBooking booking;
    int number;

    Customer(TicketBooking booking, String name, int number) {
        super(name);
        this.booking = booking;
        this.number = number;
    }

    public void run() {
        booking.bookTicket(getName(), number);
    }
}

class TicketDemo {
    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        Customer c1 = new Customer(booking, "Customer 1", 2);
        Customer c2 = new Customer(booking, "Customer 2", 2);
        Customer c3 = new Customer(booking, "Customer 3", 2);

        c1.start();
        c2.start();
        c3.start();
    }
}