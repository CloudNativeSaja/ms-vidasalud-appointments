package cl.duoc.vidasalud.appointments;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Comprueba que el contexto de Spring arranca. Usa H2 en memoria: la prueba
 * no necesita MariaDB, RabbitMQ ni Kafka.
 */
@SpringBootTest(properties = {
        "spring.datasource.url=jdbc:h2:mem:appointments;MODE=MariaDB;DB_CLOSE_DELAY=-1",
        "spring.datasource.driver-class-name=org.h2.Driver",
        "spring.datasource.username=sa",
        "spring.datasource.password=",
        "spring.jpa.hibernate.ddl-auto=create-drop",
        // Sin RabbitMQ ni Kafka: la prueba solo comprueba que el contexto arranca
        "vidasalud.messaging.enabled=false",
        "vidasalud.streaming.enabled=false"
})
class MsVidasaludAppointmentsApplicationTests {

	@Test
	void contextLoads() {
	}

}
