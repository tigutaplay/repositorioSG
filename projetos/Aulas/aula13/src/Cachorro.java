public class Cachorro extends Lobo {

    public void reagir(String frase) {
        if (frase.equals("Olá")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora) {
        if (hora <= 12) {
            System.out.println("Abanar");
        } else if (hora >=18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idadade, float peso) {
        if (idadade <= 5) {
            if (peso <= 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso <= 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

    public void emitirSom() {
        System.out.println("Latido");
    }
}
