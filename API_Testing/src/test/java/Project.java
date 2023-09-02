
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;




public class Project {



    @Test
    public void Login_with_valid_data()
    {
        HashMap loginDetails = new HashMap();
        loginDetails.put("email","merchant@foodics.com");
        loginDetails.put("password", "123456");
        String bearerToken= "Lyz22cfYKMetFhKQybx5HAmVimF1i0xO";

             given()
                .auth().basic("merchant@foodics.com","123456")
                . headers("Authorization","Bearer"+bearerToken)

                .when()
                     .get("https://pay2.foodics.dev/cp_internal/login")
                .then()
                     .statusCode(200).log().all();



    }


    @Test
    public void Login_with_invalid_email()
    {
        HashMap loginDetails = new HashMap();
        loginDetails.put("email","merchant@foodis.com");
        loginDetails.put("password", "123456");
        String bearerToken= "Lyz22cfYKMetFhKQybx5HAmVimF1i0xO";

        given()
                .auth().basic("merchant@foods.com","123456")
                . headers("Authorization","Bearer"+bearerToken)

                .when()
                    .get("https://pay2.foodics.dev/cp_internal/login")
                .then()
                      .statusCode(200).log().all();



    }


    @Test
    public void Login_with_invalid_password()
    {
        HashMap loginDetails = new HashMap();
        loginDetails.put("email","merchant@foodics.com");
        loginDetails.put("password", "198756");
        String bearerToken= "Lyz22cfYKMetFhKQybx5HAmVimF1i0xO";

        given()
                .auth().basic("merchant@foodics.com","123")
                . headers("Authorization","Bearer"+bearerToken)

                .when()
                       .get("https://pay2.foodics.dev/cp_internal/login")
                .then()
                        .statusCode(200).log().all();

    }


    @Test
    public void Login_with_invalid_token()
    {
        HashMap loginDetails = new HashMap();
        loginDetails.put("email","merchant@foodics.com");
        loginDetails.put("password", "123456");
        String bearerToken= "Lyz22cfYKMetFhKQybx";

        given()
                .auth().basic("merchant@foodics.com","123456")
                . headers("Authorization","Bearer"+bearerToken)

                .when()
                        .get("https://pay2.foodics.dev/cp_internal/login")
                .then()
                       .statusCode(200).log().all();



    }


}
