# Aufgabe vom Programmierkurs

### Entwickelt einen Adventskalender!

- Klassen:
    - (Tipp: Als UML-Diagramm zeichnen)
    - Adventskalender
    - Tür
        - `subclass` LetzteTür

- Tür-Objekte in einem Array speichern
    - diesen mit einer for-Schleife auffüllen
        - Verwendung von 6 verschiedenen Inhalten
- Nutzereingabe, um Tür zu öffnen
    - `Scanner`
    - Kontrolle, ob es diese Tür gibt
        - 28 wäre zu groß, -1 zu klein
    - beim Türöffnen wird
        - das Objekt in dem Array gefunden
        - eine Methode von ihm aufgerufen
- Erweiterungsidee:
    - So lange neue Türen öffnen, wie der Nutzer noch korrekte Eingaben macht
    - verbieten, dass der Nutzer Türen überspringt
