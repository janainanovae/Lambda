// Interface funcional: possui exatamente UM método abstrato, por isso pode ser implementada com Lambda
@FunctionalInterface
public interface FiltroNome {

    boolean testar(String nome);
}
