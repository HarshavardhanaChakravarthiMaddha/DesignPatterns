package Facade_Design_Pattern;

public class TicketBookingFacade {
    private PaymentProcessor paymentProcessor;
    private SeatAllocator seatAllocator;
    private  NotificationService notificationService;

    public TicketBookingFacade() {
        paymentProcessor = new PaymentProcessor();
        seatAllocator = new SeatAllocator();
        notificationService = new NotificationService();
    }

    public void bookTicket(double amount, int seatNumber) {
        paymentProcessor.processPayment(amount);
        seatAllocator.allocateSeat(seatNumber);
        notificationService.sendNotification("Ticket booked successfully.");
    }
}
