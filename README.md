# crif-training

## Comunicazione tramite Spring Cloud Eureka e Feign

I tre Spring Boot rappresentano un tipico schema di comunicazione su Spring Cloud, sfruttando sia Eureka Server per reperire le risorse senza doverle specificare ai client sia Feign per l'uso di client REST dichiarativi.

Una volta avviati tutti e tre, potrete osservare i tre seguenti ambienti

- A localhost:8761 vedrete il registro di Eureka, che dovrebbe mostrare gli altri due Boot registrati su di esso
- Chiamando http://localhost:9999/sample-api/hello?name=[NOME] vedrete l'Api che chiameremo attraverso Eureka. Immaginate che questo sia un servizio privato, che non vogliamo esporre direttamente ai client. 
- Chiamando http://localhost:8088/sample-client/remote-hello?name=Carlo , che rappresenta il nostro client pubblico, vedrete che otterrete la stessa risposta del punto precedente. Questo perchè il client Feign all'interno del terzo Boot ha il nome del servizio sample-api, pur non conoscendone l'ip preciso, e l'indirizzo del server Eureka, che glielo fornirà al momento della chiamata.

Provate a modificare e ad aggiungere funzioni ai due moduli sample-api e sample-client.
