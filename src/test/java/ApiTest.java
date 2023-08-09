import com.fdd.FDD;
import com.fdd.FDDFactory;
import com.fdd.factory.FieldRule;
import com.fdd.factory.FieldRules;
import data.Car;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void toto(){
        FDD.setKey("kfdskflkdsklf");

        FDDFactory<Car> factory = FDD.factory(Car.class);
        factory.addRule("name", FieldRules.string().size(5,10), FieldRules.string().noSpecialChars());

        factory.addRule("maxSpeed", FieldRules.floats().range(5,10), FieldRules.string().noSpecialChars());


        Car car = factory.get();
    }
}
