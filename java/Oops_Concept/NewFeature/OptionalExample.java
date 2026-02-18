package NewFeature;

import java.util.Optional;

public class OptionalExample {
    static void main() {
        String name = null;
        if(name != null){
            System.out.println(name.isEmpty());
        }

        Optional<String> optionalname = Optional.ofNullable(name);

        if(optionalname.isPresent()){
            System.out.println(optionalname.get());
        }else {
            System.out.println("Name is not Present ");
        }
    }
}
