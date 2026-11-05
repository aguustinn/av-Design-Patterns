public class Main {

        public static void main(String[] args) {
    
            System.out.println("=== Tarifa de Estacionamento ===");
    
            int permanencia = 95;
    
            Tiquete rotativo = new Tiquete(
                    "ABC1D23",
                    permanencia,
                    new PerfilRotativo()
            );
    
            Tiquete mensalista = new Tiquete(
                    "XYZ2E34",
                    permanencia,
                    new PerfilMensalista()
            );
    
            Tiquete conveniado = new Tiquete(
                    "DEF3G45",
                    permanencia,
                    new PerfilConveniado()
            );
    
            rotativo.imprimirResumo();
            mensalista.imprimirResumo();
            conveniado.imprimirResumo();
    
            System.out.println("\nAlterando o perfil do mesmo tíquete:");
    
            rotativo.alterarPerfil(new PerfilConveniado());
    
            rotativo.imprimirResumo();
        }
    }