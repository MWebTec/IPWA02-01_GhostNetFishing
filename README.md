# Ghost Net Fishing Web-App

Die **Ghost Net Fishing Web-App** ist ein fiktives Projekt im Rahmen meines Studiums an der **Internationalen Hochschule (IU)**. Es wurde als Teil einer praxisorientierten Aufgabe entwickelt, um die Meldung und Bergung von Geisternetzen im Meer zu verwalten und zu koordinieren. Geisternetze sind herrenlose Fischernetze, die in den Ozeanen treiben und eine Gefahr für die Meeresumwelt sowie die Fischerei darstellen.

Dieses Projekt stellt eine **fiktive Non-Profit-Organisation** namens **Shea Shepherd** dar, die sich der Bekämpfung der Geisternetze im Ozean widmet.

## Funktionen

Die Web-App unterstützt die folgenden grundlegenden Funktionen:

1. **Geisternetze melden**:  
   - Meldende Personen können Geisternetze erfassen (anonym oder mit Kontaktdaten).

2. **Bergung von Geisternetzen**:  
   - Bergende Personen können sich für die Bergung eines Geisternetzes eintragen.  
   - Bergende Personen können den Status von Geisternetzen aktualisieren und die Bergung als "geborgen" melden.

3. **Statusverfolgung**:  
   - Der Status eines Geisternetzes kann zwischen den Zuständen **"Gemeldet"**, **"Bergung bevorstehend"**, **"Geborgen"** und **"Verschollen"** geändert werden.

4. **Visualisierung auf einer Weltkarte** (optional, für zukünftige Erweiterungen):  
   - Bergende Personen können Geisternetze auf einer Weltkarte sehen, um den Standort der Netzwerke zu überwachen.

## Benutzerrollen

- **Meldende Personen**:  
  - Melden Geisternetze im System und können optional anonym bleiben.  
  - Sie müssen den Standort und die geschätzte Größe des Netzes angeben.

- **Bergende Personen**:  
  - Registrieren sich, um Geisternetze zu bergen.  
  - Aktualisieren den Status der Geisternetze, indem sie die Bergung durchführen oder bestätigen.

- **Allgemeine Benutzer**:  
  - Haben die Möglichkeit, Geisternetze als verschollen zu melden, wenn sie feststellen, dass das Netz am angegebenen Standort nicht gefunden werden kann.

## Architektur

Die Web-App basiert auf folgenden Technologien:

- **JSF (JavaServer Faces)**: Für die Benutzeroberfläche.
- **CDI (Contexts and Dependency Injection)**: Für die Implementierung von Beans und die Verwaltung von Abhängigkeiten.
- **JPA (Java Persistence API)**: Für die Persistenz und Speicherung von Geisternetzen und Benutzerdaten.
- **Hibernate**: Als JPA-Implementierung zur Datenbankkommunikation.
- **MySQL**: Für die Speicherung der Daten in einer relationalen Datenbank.

Die Datenbankstruktur besteht aus mehreren Entitäten, darunter `GhostNet`, `Person`, `Rescue`, die die relevanten Informationen zu Geisternetzen und deren Status speichern.

## Installation

### Voraussetzungen

- **Java 8 oder höher**: Um das Projekt auszuführen, benötigst du eine Java-Umgebung.
- **MySQL-Datenbank**: Die Web-App verwendet MySQL zur Speicherung von Daten. Stelle sicher, dass du eine MySQL-Datenbank eingerichtet hast.

### Schritt 1: Klone das Repository

```bash
git clone https://github.com/yourusername/ghost-net-fishing.git
cd ghost-net-fishing
```

### Schritt 2: Konfiguriere die MySQL-Datenbank

Stelle sicher, dass du eine MySQL-Datenbank eingerichtet hast und ändere die Datenbankverbindungsdetails in der `persistence.xml` Datei unter `src/main/resources/META-INF/`. Ändere dort die folgenden Parameter:

- **Benutzername** (Username)
- **Passwort** (Password)
- **URL** (Datenbank-URL)

Beispiel:
```xml
<persistence-unit name="ghostNetPU">
    <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
    <jta-data-source>java:/MySQLDS</jta-data-source>
    <properties>
        <property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect" />
        <property name="hibernate.hbm2ddl.auto" value="update" />
        <property name="hibernate.show_sql" value="true" />
        <property name="hibernate.format_sql" value="true" />
        <property name="hibernate.connection.driver_class" value="com.mysql.cj.jdbc.Driver" />
        <property name="hibernate.connection.url" value="jdbc:mysql://localhost:3306/ghostnetfishing" />
        <property name="hibernate.connection.username" value="deinUsername" />
        <property name="hibernate.connection.password" value="deinPasswort" />
    </properties>
</persistence-unit>
```
### Schritt 3: Baue das Projekt mit Maven

Um das Projekt zu bauen, öffne ein Terminal und navigiere zum Projektordner. Führe dann folgenden Befehl aus:

```bash
mvn clean install
```

### Schritt 4: Starte den Webserver

Wenn du einen lokalen Server verwendest, wie z.B. **Apache Tomcat**, kopiere das WAR-File in das `webapps`-Verzeichnis deines Tomcat-Servers und starte den Server.

Alternativ, wenn du Maven als eingebauten Webserver verwendest, kannst du die Anwendung direkt mit dem folgenden Befehl starten:

```bash
mvn jetty:run
```

### Schritt 5: Zugriff auf die Web-App

Sobald der Webserver läuft, öffne deinen Webbrowser und navigiere zu:
http://localhost:8080

### Schritt 6: Fehlerbehebung und Logs

Falls beim Starten des Webservers oder während der Nutzung der Anwendung Probleme auftreten, kannst du die Fehlerprotokolle (Logs) einsehen, um die Ursache zu ermitteln. 

- **Maven-Fehlermeldungen**: Wenn du Maven verwendest, werden Fehler direkt im Terminal angezeigt, wenn ein Befehl fehlschlägt. Diese kannst du zur Fehlerbehebung verwenden.
- **Tomcat-Logs**: Wenn du Apache Tomcat verwendest, kannst du die Log-Dateien unter dem Verzeichnis `logs` in deinem Tomcat-Server-Installationsordner finden. Sie enthalten detaillierte Informationen zu Fehlern und Problemen während der Ausführung der Anwendung.

# Verzeichnisstruktur

Die Verzeichnisstruktur des Projekts sieht wie folgt aus:

```
GhostNetFishing
│
├── pom.xml                   <-- Maven-Projektdatei (Abhängigkeiten, Plugins)
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── sheashepherd
│   │   │           └── ghostnetfishing
│   │   │               ├── bean            <-- JSF/Bean Klassen
│   │   │               ├── model           <-- JPA Entitäten (GhostNet, Person, Rescue)
│   │   │               └── persistence     <-- (Optional) Persistenzlogik, Datenbankzugriff
│   │   └── resources
│   │       └── META-INF
│   │           └── persistence.xml          <-- JPA-Datenbankkonfiguration
└── README.md
```

### Erklärungen zu den Änderungen:

1. **Schritt 2: Konfiguration der MySQL-Datenbank**  
   - Ich habe den XML-Block für die `persistence.xml` korrekt formatiert, damit er in GitHub als Codeblock angezeigt wird.

2. **Schritt 3: Maven Build**  
   - Ich habe die Schritte zur Verwendung von Maven zur Installation und zum Builden des Projekts mit einem `bash`-Codeblock versehen.

3. **Schritt 4: Starten des Webservers**  
   - Ich habe sowohl die Anleitung für die Verwendung eines externen Webservers (Tomcat) als auch für die Nutzung von Maven Jetty zum Starten des Webservers hinzugefügt.

4. **Verzeichnisstruktur**  
   - Die Verzeichnisstruktur ist in einem Codeblock formatiert, sodass sie in GitHub als Code und nicht als normalen Text angezeigt wird.

Mit dieser Formatierung solltest du die Datei in GitHub richtig und übersichtlich anzeigen können.
