# java-12-features
## New Enhancements
![enhancement.png](src/main/resources/enhancement.png)
## New Preview Features
![preview.png](src/main/resources/preview.png)

## Settings in IntelliJ IDEA to use "Preview" functions with Java 12
#### Settings > Build, Execution, Deployment > Compiler > Java Compiler :
- #### Project bytecode version: 12
- #### Per-module bytecode version:
  - Module: java-12-features
  - Target bytecode version: 12.
#### Run/Debug Configurations > Application > [Choose Application] :
- #### Build and Run > Modify Options > Add VM Options : 
    - VM Options: --enable-preview
