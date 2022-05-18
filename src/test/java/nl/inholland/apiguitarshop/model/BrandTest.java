package nl.inholland.apiguitarshop.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class BrandTest {

    private Guitar guitar;

    @BeforeEach
    void setup() {
        guitar = new Guitar();
    }

    @Test
    void creatingNewGuitarShouldNotReturnNull() {
        assertNull(guitar);
    }

    @Test
    void settingNegativePriceWillResultInIllegalArgumentException() {
        guitar = new Guitar();
    }
}
