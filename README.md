### Ejecución en Aragorn

Para la ejecución apropiada en Aragorn, se debe ejecutar el archivo main.java, para eso, se deben ejecutar los siguientes comandos en la terminal de aragorn apropiada, como en vscode:

```bash
    -ssh tu_usuario@aragorn.usm.cl
    -(desde el directorio donde estan los codigos, esto en la terminal del vscode)scp -r nombre_carpeta/ tu_usuario@aragorn.usm.cl:~/
    
    -(ya en aragorn) cd nombreCarpeta
    -make compile
    -make run

```

### Ejecución en IntelliJ IDEA

Para ejecutar desde este programa, tan solo hay que abrir la carpeta del repositorio clonado, y configurar el proyecto para que tenga de argumento el archivo "config.txt". Para esto, se sigue las instrucciones:


1. Haz clic derecho en tu clase principal y elige "Run main" (si no lo has corrido nunca, así creas una configuración de ejecución).

2. Luego arriba a la derecha (en IntelliJ) donde aparece el nombre de tu programa (main), haz clic en el menú desplegable.

3. Elige "Edit Configurations...".

4. Se abrirá una ventana.
   Busca tu configuración que dice main a la izquierda.

5. En el campo que dice "Program arguments", escribe:

```bash
    "config.txt"
```
Y ya se puede ejecutar correctamente.