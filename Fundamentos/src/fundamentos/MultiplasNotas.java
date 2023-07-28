package fundamentos;

public class MultiplasNotas {
    public static void main(String[] args) {
        int rs = somar(4,8,2);
        System.out.println("A soma: " + rs);
    }
    
    public static int somar (int... valores){
        int resultado = 0;
        
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            resultado += valor;
        }
            return resultado;
    }
}
