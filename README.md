# Objetos 2 - Clase 1

- Maven
    - Estructura de Proyecto Maven
    - dependencias (https://www.maven.org/)
        - External libraries
        - comandos: mvn compile, mvn test
- Primera Regla de Código Elegante:
    - IDE: Format on save
- Primera Regla de Buenos Diseños:
    - Testeables:
        - Sin asserts no hay test
        - Nombre de los tests
- Covertura
- Segunda Regla de Código Elegante:
    - IDE: Quick Fixes
- Refactoring
    - To for
    - Usando Quick Fixes to Stream anyMatch
        - Ver otros quick fixes sugeridos luego.
    - Factory Method en Inscripcion cuando hay relaciones bidireccionales
        - Evita la posibilidad que se creen instancias de inscripcion en forma inconsistente
        - El diseño permitiría a clientes hacer esto:
          ```unConcurso.nuevaInscripcion(new Inscripcion(jose1, otroConcurso, LocalDateTime.now()));```
    - Asistentes IA
        - GitHub Copilot
        - Qodo
        - Otros