package api.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestCallerTest {

    @Test
    public void runner() {
        RequestCaller requestCaller = new RequestCaller();
        try {
            requestCaller.main();
        } catch (Exception ignored) {

        }
    }

}