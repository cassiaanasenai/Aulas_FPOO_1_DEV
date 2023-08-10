package aulaestruturadecisao;

public class exemplo2 {
    public static void main(String[] args) {
        int temperatura = 15;
        
        if (temperatura == 15) {
            System.out.println("Esta ficando frio");
        } else if (temperatura == 20){
            System.out.println("Esta ficando agradavel");
        }else if (temperatura == 30){
            System.out.println("Esta ficando calor");
        }
        switch (temperatura) {
            case 15:
                System.out.println("Esta ficando frio");
                break;
                case 20:
                    System.out.println("Esta agradavel");
                break;
                case 30:
                    System.out.println("Esta calor");
                break;
                default:
        }
    }

}
