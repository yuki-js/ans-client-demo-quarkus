# Quarkus Getting Started

## Prerequisites

1. **Java 21**: Ensure that Java 21 is installed on your system. You can download it from the [official website](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html). Follow these steps to install it:

    a. Download the JDK installer for your operating system.
    b. Run the installer and follow the on-screen instructions.
    c. Set the `JAVA_HOME` environment variable to the installation directory.
    d. Add the `bin` directory of the JDK installation to the `PATH` environment variable.

    e. Update your environment variables to include the following lines in your shell profile (e.g., `~/.bashrc`, `~/.zshrc`):
    
    ```sh
    export JAVA_HOME=/usr/local/java
    export PATH=$JAVA_HOME/bin:$PATH
    ```
    

2. **Quarkus CLI (optional)**: For easier development, you can install the Quarkus CLI. Follow the instructions on the [Quarkus website](https://quarkus.io/guides/cli-tooling).


This project is a simple Quarkus application that provides a REST endpoint.

## Building the Project

To build the project, run the following command:

```bash
./gradlew build
```

## Running the Application

To run the application, use the following command:

```bash
java -jar target/quarkus-getting-started-1.0.0-SNAPSHOT-runner.jar
```

The application will be available at `http://localhost:8080`.

## REST Endpoint

You can access the REST endpoint at:

```
http://localhost:8080/hello
```

This will return the message "Hello, Quarkus!".

## Java 21 Installation

To install Java 21, follow these steps:

1. Download the Java 21 tarball:
   ```bash
   wget -P /tmp https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.tar.gz
   ```

2. Extract the tarball to the `/opt` directory:
   ```bash
   sudo tar -xzf /tmp/jdk-21_linux-x64_bin.tar.gz -C /opt
   ```

3. Set the `JAVA_HOME` environment variable:
   ```bash
   export JAVA_HOME=/opt/jdk-21.0.4
   ```

4. Add the `JAVA_HOME/bin` directory to the `PATH` variable:
   ```bash
   export PATH=$JAVA_HOME/bin:$PATH
   ```

5. Verify the Java installation:
   ```bash
   java -version
   ```
