public class Server {
    public boolean canServeGuest(Guest guest){
        if (guest.getAge() < 18) {
            return false;
        }
        if (guest.getWallet() < 5.00) {
            return false;
        }

        return true;
    }
}
