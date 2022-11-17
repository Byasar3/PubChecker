public class Server {
    public boolean canServeGuest(Guest guest){
        if (guest.getAge() < 18) {
            return false;
        }
        if (guest.getWallet() < 5.00) {
            return false;
        }
        if(guest.getSobrietyLevel() < 50){
            return false;
        }
        if (guest.getIsGuestIsBanned()){
            return false;
        }
        if (guest.getIsCurrencyIsPound()){
            return true;
        }

        return true;
    }
}
