import java.util.*;
public class reto1 {
    public interface Client {
        double getDiscount();
        String getType();
    }

    public class NewClient implements Client {
        public double getDiscount() {
            return 0.05;
        }

        public String getType() {
            return "Nuevo";
        }
    }

    public class FreqClient implements Client {
        public double getDiscount() {
            return 0.10;
        }

        public String getType() {
            return "Frecuente";
        }
    }

    public class ClientFactory {

    public static Client createClient(String tipo) {
            return switch (tipo.toUpperCase()) {
                case "NUEVO" -> new NewClient();
                case "FRECUENTE" -> new FreqClient();
                default -> throw new IllegalArgumentException("Tipo de cliente inválido");
            };
        }
    }
}