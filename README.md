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
