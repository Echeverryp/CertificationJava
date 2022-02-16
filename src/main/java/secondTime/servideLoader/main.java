package secondTime.servideLoader;

import java.util.Base64;
import java.util.ServiceLoader;

public class main {

    public static void main(String[] args) {
         /*java.util.ServiceLoader<main> loader= ServiceLoader.load(main.class);
         loader.stream().forEach(System.out::println);*/
        
        ServiceLoader<CodecFactory> loaderMessage= ServiceLoader.load(CodecFactory.class);

        for (CodecFactory factory: loaderMessage
             ) {
            String en=factory.getName("Mensaje");
            if(en!=null){
                System.out.println(en);
            }

            
        }

        ServiceLoader<CodecFactory> loader = ServiceLoader.load(CodecFactory.class);
        for (CodecFactory factory : loader) {
            Base64.Encoder enc = factory.getEncoder("PNG");
            if (enc != null){
              
            }
          
            break;
        }
    }
}
