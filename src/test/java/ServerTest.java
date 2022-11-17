import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    Guest noMoney;
    Guest yesMoney;
    Guest soberSusan;


    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("Berna", 25, 50.00, 100, false, true);
        noMoney = new Guest("John", 19,2, 60, false, true);
        yesMoney = new Guest("John'sFriend", 19, 10, 55,false,true);
        soberSusan = new Guest("Susan", 38,1000,99,false,true);
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeIfOver18(){
        boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void canServeNotBrokePersons(){
        boolean result = server.canServeGuest(yesMoney);
        assertThat(result).isEqualTo(true);
    }
    // also doesn't serve the peoples with no money
    @Test
    public void doesNotServeBrokePersons(){
        boolean result = server.canServeGuest(noMoney);
        assertThat(result).isEqualTo(false);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)


    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
