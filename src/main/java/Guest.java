public class Guest {

    private String name;
    private Integer age;
    private double wallet;
    private int sobrietyLevel;
    private boolean guestIsBanned;
    private boolean currencyIsPound;

    public Guest(String name, Integer age, double wallet, int sobrietyLevel, boolean guestIsBanned, boolean currencyIsPound){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobrietyLevel = sobrietyLevel;
        this.guestIsBanned = guestIsBanned;
        this.currencyIsPound = currencyIsPound;
    }


    // Getters and Setters
    // getters:

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWallet(){
        return this.wallet;
    }

    public int getSobrietyLevel(){
        return this.sobrietyLevel;
    }

    public boolean getIsGuestIsBanned() {
        return guestIsBanned;
    }

    public boolean getIsCurrencyIsPound() {
        return currencyIsPound;
    }
}


