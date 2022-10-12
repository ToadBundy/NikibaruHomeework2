import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        PhoneType phoneType = new PhoneType("Motorolla", "2235", true);
        System.out.println(phoneType);

        PhoneDto phoneDto = PhoneDto.builder()
                .number("125")
                .phoneType(phoneType)
                .clientFio("Toad Bundy")
                .isGovernment(false)
                .build();
        System.out.println(phoneDto);
    }

    public static void runExceptions() throws Exception {
        throw new Exception("Опачки");
    }

    public static void runExceptions2(){
        try{
            throw new RuntimeException("Опачки");
        }catch(RuntimeException e){

        }
    }

    @SneakyThrows
    public static void runExeptions3(){
        throw new Exception("Опачки");
    }

    @SneakyThrows
    public static void MyGame(){
        @Cleanup FileWriter writer = new FileWriter("1.txt");
    }
}
