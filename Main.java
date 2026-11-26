package State;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Flujo completo de pedido ===");
        Pedido pedido = new Pedido();
        pedido.mostrarEstado();

        pedido.enviar(); // Operación inválida en EstadoPendiente
        pedido.procesar();
        pedido.mostrarEstado();

        pedido.cancelar(); // Operación inválida en EstadoProcesado
        pedido.enviar();
        pedido.mostrarEstado();

        pedido.entregar();
        pedido.mostrarEstado();

        // Intentar operación inválida en EstadoEntregado
        pedido.cancelar();

        System.out.println("\n=== Flujo de cancelación ===");
        Pedido pedidoCancelado = new Pedido();
        pedidoCancelado.mostrarEstado();
        pedidoCancelado.cancelar();
        pedidoCancelado.mostrarEstado();
        pedidoCancelado.procesar(); // Operación inválida en EstadoCancelado
        pedidoCancelado.enviar();   // Operación inválida en EstadoCancelado
    }
}
