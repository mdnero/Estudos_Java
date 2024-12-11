import java.text.DecimalFormat;

public class Teste {
public static void main(String[] args) {
    	double a = 5.0;
        double b = 7.1;

        DecimalFormat df = new DecimalFormat("#.#####");

        double media = (a+b)/2;

        String result = df.format(media);


        System.err.println("Media: " + result);
    
}

        
}
