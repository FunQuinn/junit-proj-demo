import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

/**
 * @Author FunQuinn
 * @Description: runner引擎
 * @Date 2020/11/27 23:19
 */
public class TDDStepsTest {

    @ParameterizedTest
    @MethodSource()
    void searchMethod(TDDStepCaseTest tddStepCaseTest){
        System.out.println(tddStepCaseTest);
//        runner引擎
        tddStepCaseTest.run();
    }

    static Stream<TDDStepCaseTest> searchMethod() throws IOException {
        ObjectMapper mapper=new ObjectMapper(new YAMLFactory());

       TDDStepCaseTest tddStepCaseTest = mapper.readValue(
                TDDStepsTest.class.getResourceAsStream("/framework/searchstep.yaml"),
                TDDStepCaseTest.class);
        return Stream.of(tddStepCaseTest);

    }

}
