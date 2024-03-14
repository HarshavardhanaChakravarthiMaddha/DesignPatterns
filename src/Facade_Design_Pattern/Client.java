package Facade_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        SeatAllocator seatAllocator = new SeatAllocator();
        NotificationService notificationService = new NotificationService();

        double amount = 50.0;
        int seatNumber = 12;

        paymentProcessor.processPayment(amount);
        seatAllocator.allocateSeat(seatNumber);
        notificationService.sendNotification("Ticket booked successfully.");
//
//        TicketBookingFacade facade = new TicketBookingFacade();
//        facade.bookTicket(50.0, 12);
    }
}
