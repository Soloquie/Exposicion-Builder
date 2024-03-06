# heladeria

La heladería Don Simón tiene como proyecto expandir su negocio por distintos medios, los ha contratado a ustedes con el objetivo de desarrollar un aplicación o pagina web, en la cual los clientes puedan hacer su compra antes de llegar al local físico, o para domicilio.
Se debe tener en cuenta que, a la hora de hacer el pedido, se debe tener un nombre, un numero celular de carácter obligatorio.
Para los demás requisitos de facturación se debe tener opcionalmente una dirección de vivienda si es domicilio; y como modo de cancelación el cliente debe elegir entre: NEQUI, Bancolombia a la mano, o DaviPlata.
Como el proyecto estará en fase de prueba, la heladería exige que el primer producto que se encuentre en la aplicación sean las ensaladas de fruta.
De carácter obligatorio las ensaladas deberán llevar banano y sandia, pero también podrían llevar mango, papaya y manzana a elección del cliente.
Deberán llevar obligatoriamente un líquido, el cliente puede elegir entre yogurt o crema de leche.
De forma opcional puede llevar queso, fresa, y uva.
Finalmente, el cliente podrá seleccionar un sabor de helado, la heladería cuenta con las siguiente opciones; chocolate, vainilla, veteado de mora, lulo, brownie, o podría decidir que no lleve helado.
# Autores

- Natalia Tejada Cardona
- Juan David Castañeda
- Cesar Camilo Tulcan Erira

# Herramientas

- [java 17](https://adoptium.net/es)
- [junit 5.10.0](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0)
- [maven](https://maven.apache.org)



# Construcción y pruebas

Para compilar el proyecto puede usar el comando:

```shell
mvn clean compile
```

Para ejecutar las pruebas puede usar el comando: 

```shell
 mvn clean test
```

Para generar el jar puede usar el comando: 

```shell
 mvn clean package
```

y para ejecutar el jar

```shell
 java -jar target/heladeria-1.0.jar
```
